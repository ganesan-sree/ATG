package com.cts.droplet;

import java.io.IOException;

import javax.servlet.ServletException;

import com.cts.manager.MyPipelineManager;

import atg.repository.MutableRepository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;
import atg.repository.rql.RqlStatement;
import atg.service.pipeline.RunProcessException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.servlet.ServletUtil;
import atg.userprofiling.Profile;

public class MyRepoDroplet extends DynamoServlet {

	MutableRepository myRepo;
	Profile profile;
	String userId = null;

	public Profile getProfile() {
		return (Profile) ServletUtil.getCurrentUserProfile();
	}

	public MutableRepository getMyRepo() {
		return myRepo;
	}

	public void setMyRepo(MutableRepository myRepo) {
		this.myRepo = myRepo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {
			System.out.println("Strart Droplet !!!!!!!!!!!!!");
			
		if (request.getParameter("userId") != null) {
			setUserId(request.getParameter("userId"));
		}

		try {
			if (getUserId() != null && getUserId().length() > 4) {
				System.out.println("get UserId =="+getUserId());
				RepositoryItem item = (RepositoryItem) getMyRepo()
						.getItem(getUserId(), "my_user");
				request.setParameter("user", item);
				request.serviceParameter("edit", request, response);
				setUserId(null);
			} else {
				RepositoryView userListView = getMyRepo().getView("my_user");
				RqlStatement query = RqlStatement.parseRqlStatement("ALL");
				RepositoryItem[] items = query.executeQuery(userListView, null);
				request.setParameter("userlist", items);
				request.serviceParameter("output", request, response);
			}
			
			MyPipelineManager manager= new MyPipelineManager();
			try {
				manager.runProcess("/com/cts/pipeline/mypipeline", null);
			} catch (RunProcessException e) {				
				e.printStackTrace();
			}

		} catch (RepositoryException e) {
			e.printStackTrace();
		}
		
	}
}
