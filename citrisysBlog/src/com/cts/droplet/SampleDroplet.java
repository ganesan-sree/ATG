package com.cts.droplet;

import atg.core.util.StringUtils;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.userprofiling.Profile;
import javax.servlet.ServletException;
import java.io.IOException;
import java.text.MessageFormat;

public class SampleDroplet extends DynamoServlet {

	// input parameters

	private static final String PARAM_PROFILE = "profile";
	private static final String PARAM_CURRENT_PAGE = "currentPage";
	// output parameters
	private static final String PARAM_MESSAGE = "message";
	private static final String PARAM_ERROR_MESSAGE = "errorMsg";
	// open parameters
	private static final String OPARAM_OUTPUT = "output";
	private static final String OPARAM_ERROR = "error";

	@Override
	public void service(DynamoHttpServletRequest pRequest,
			DynamoHttpServletResponse pResponse) throws ServletException,
			IOException {

		Profile profile = (Profile) pRequest.getObjectParameter(PARAM_PROFILE);
		System.out.println(profile);
		if (profile == null) {
			pRequest.setParameter(PARAM_ERROR_MESSAGE,
					"The passed in Profile was null.");
			pRequest.serviceParameter(OPARAM_ERROR, pRequest, pResponse);
		} else {

			String name = (String) profile.getPropertyValue("firstName");
			if (StringUtils.isBlank(name)) {
				name = profile.getRepositoryId();
			}

			String currentPage = pRequest.getParameter(PARAM_CURRENT_PAGE);

			// render output

			if (StringUtils.isBlank(currentPage)) {

				pRequest.setParameter(PARAM_MESSAGE,
						MessageFormat.format("Hello, {0}.", name));

			} else {

				pRequest.setParameter(PARAM_MESSAGE, MessageFormat.format(
						"Hello, {0}, thanks for visiting {1}.", name,
						currentPage));

			}

			pRequest.serviceParameter(OPARAM_OUTPUT, pRequest, pResponse);

		}

	}

}
