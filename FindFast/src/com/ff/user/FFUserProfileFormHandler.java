package com.ff.user;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.ServletException;


import com.ff.constant.FFConstant;
import com.ff.help.FFUtils;


import atg.core.util.ResourceUtils;
import atg.droplet.DropletException;
import atg.droplet.DropletFormException;
import atg.projects.b2cstore.B2CProfileFormHandler;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.Query;
import atg.repository.QueryBuilder;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;
import atg.repository.rql.RqlStatement;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.UploadedFile;
import atg.userprofiling.ProfileFormHandler;

public class FFUserProfileFormHandler extends B2CProfileFormHandler {
	
	public String firstName;
	public String lastName;
	public String email;
	public String password;
	public String confirmPassword;
	public String country;
	public String state;
	public String city;
	public String postalcode;
	public String login;
	public String gender;
	public FFUtils FFUtils;
	public String successURL;
	public String errorURL;
	public FFConstant FFConstant;
	public int maxLoginAttempt;
	public boolean locked;
	public String address1;
	public Date dateOfBirth;
	public MutableRepository profileRepository;
	public String userInterest[];
	public String imageURL;
	public UploadedFile uploadedFile;
	public MutableRepository productRepository;
	public MutableRepository getProductRepository() {
		return productRepository;
	}
	public void setProductRepository(MutableRepository productRepository) {
		this.productRepository = productRepository;
	}
	public String getErrorURL() {
		return errorURL;
	}
	public void setErrorURL(String errorURL) {
		this.errorURL = errorURL;
	}
	public String getSuccessURL() {
		return successURL;
	}
	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setZipcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public FFUtils getFFUtils() {
		return FFUtils;
	}
	public void setFFUtils(FFUtils utils) {
		FFUtils = utils;
	}
	public void preLoginUser(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse) throws ServletException, IOException
	{
		logInfo("--- Inside Pre Login User ---- ");
		boolean isLocked=false;
		try
		{
			String login[]=new String[]{(String)getValueProperty("login")};
			String password=(String)getValueProperty("password");
			if(login !=null && password !=null)
			{
				
				RepositoryItem user[]=findUser(login);
				if(user!=null)
				{
					int loginAttempt=Integer.parseInt(""+user[0].getPropertyValue("loginAttempt"));
					logInfo("--- Login Attempt --- "+loginAttempt);
					if(loginAttempt>=getMaxLoginAttempt())
					{
						isLocked=true;
					}
				}
			}
		}
		catch(Exception e)
		{
			logInfo("Exception ---- Pre Login ---"+e);
		}
		if(isLocked)
		{
			addFormException(new DropletFormException(FFConstant.LOGIN_LOCKED,"Locked"));
		}
		super.preLoginUser(pRequest,pResponse);
	}
	public RepositoryItem[] findUser(String[] login)
	{
		RepositoryItem user[]=null;
		try
		{
			RepositoryView view=this.getProfileRepository().getView("user");
			RqlStatement statement=RqlStatement.parseRqlStatement("login=?0");
			user=statement.executeQuery(view,login);
			logInfo("User "+user);
		}
		catch(Exception e)
		{
			logInfo("Find use Exception "+e);
		}
		return user;
	}
	public boolean handleCreate(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse) throws ServletException, IOException
	{
		logInfo("Inside handle create");
		firstName=(String)getValueProperty(FFConstant.firstName);
		lastName=(String)getValueProperty(FFConstant.lastName);
		email=(String)getValueProperty(FFConstant.email);
		password=(String)getValueProperty(FFConstant.password);
		confirmPassword=(String)getValueProperty(FFConstant.confirmPassword);
		country=(String)getValueProperty(FFConstant.country);
		state=(String)getValueProperty(FFConstant.state);
		city=(String)getValueProperty(FFConstant.city);
		login=(String)getValueProperty(FFConstant.login);
		postalcode=(String)getValueProperty(FFConstant.postalcode);
		gender=(String)getValueProperty(FFConstant.gender);
		address1=(String)getValueProperty(FFConstant.ADDRESS1);
		dateOfBirth=(Date)getValueProperty(FFConstant.DATE_OF_BIRTH);
		HashMap fields=new HashMap();
		fields.put(FFConstant.firstName,firstName);
		fields.put(FFConstant.lastName,lastName);
		fields.put(FFConstant.email,email);
		fields.put(FFConstant.password,password);
		fields.put(FFConstant.confirmPassword, confirmPassword);
		fields.put(FFConstant.country,country);
		fields.put(FFConstant.state, state);
		fields.put(FFConstant.city, city);
		fields.put(FFConstant.postalcode, postalcode);
		fields.put(FFConstant.gender, gender);
		fields.put(FFConstant.login, login);
		fields.put(FFConstant.ADDRESS1, address1);
		fields.put(FFConstant.DATE_OF_BIRTH,dateOfBirth);
		
		
		logInfo(" DATA ------------- "+fields);
		
		getFFUtils().validateFields(fields);
		
		HashMap error=getFFUtils().getErrorInfo();
		
		putErrorMessage(error);
		setValueProperty("loginAttempt","0");
		setValueProperty("lastLoginActivityDate",new Timestamp(new java.util.Date().getTime()));
		logInfo(""+getUserInterest());
		if(userInterest!=null && getUserInterests()!=null)
		{
			logInfo("Interest "+getUserInterests());
			setValueProperty("userInterests",getUserInterests());
		}
		try {
			if (error == null || error.size() <= 0) {
				if (getUploadedFile() != null) {
					int length = 0;
					logInfo(this.getUploadedFile().getContentType());
					logInfo(this.getUploadedFile().getFilename());
					String fileName = getUploadedFile().getFilename();
					logInfo(pRequest.getContextPath());
					String root=pRequest.getPathTranslated();
					logInfo(pRequest.getPathTranslated());
					File f=new File("C:/jboss-4.0.5.GA/server/ff/deploy/ff.ear/ff.war/img/user/"+fileName);
					File f1=new File("F:/FindFast/j2ee-apps/ff/ff.war/img/user/"+fileName);
					FileOutputStream output1=new FileOutputStream(f1);
					
					FileOutputStream output = new FileOutputStream(
							f);
					DataInputStream input = new DataInputStream(
							getUploadedFile().getInputStream());
					byte[] bbuf = new byte[4 * 1024];
					while ((input != null)
							&& ((length = input.read(bbuf)) != -1)) {
						output.write(bbuf, 0, length);
						output1.write(bbuf,0,length);
					}
					RepositoryItem item = this.getProductRepository().getItem("fld10002", "folder");
					logInfo(""+item);
					logInfo("" + item);
					if (item != null) {
						MutableRepositoryItem rep = this.getProductRepository()
								.createItem("media");
						rep.setPropertyValue("name", fileName);
						rep.setPropertyValue("description", fileName);
						rep.setPropertyValue("parentFolder", item);
						rep.setPropertyValue("url", "/img/user/"+fileName);
						rep.setPropertyValue("path","/img/user/"+ fileName);
						//rep.setPropertyValue("creationDate", new Date());
						RepositoryItem it=getProductRepository().addItem(rep);
						logInfo("media : "+rep);
						setValueProperty("userImage",rep);
					}
					output.flush();
					output1.flush();
				}
			}
			super.handleCreate(pRequest, pResponse);
		} catch (Exception e) {
			logInfo("Exception " + e);
			addFormException(new DropletException(MessageFormat.format("Can not upload image "+e,"Error")));
		}
		
		
		return checkFormRedirect(getSuccessURL(),getErrorURL(),pRequest,pResponse);
	}
	public boolean handleUpdate(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse) throws ServletException, IOException
	{
		logInfo("Inside handle update");
		firstName=(String)getValueProperty(FFConstant.firstName);
		lastName=(String)getValueProperty(FFConstant.lastName);
		email=(String)getValueProperty(FFConstant.email);
		password=(String)getValueProperty(FFConstant.password);
		confirmPassword=(String)getValueProperty(FFConstant.confirmPassword);
		country=(String)getValueProperty(FFConstant.country);
		state=(String)getValueProperty(FFConstant.state);
		city=(String)getValueProperty(FFConstant.city);
		login=(String)getValueProperty(FFConstant.login);
		postalcode=(String)getValueProperty(FFConstant.postalcode);
		gender=(String)getValueProperty(FFConstant.gender);
		address1=(String)getValueProperty(FFConstant.ADDRESS1);
		dateOfBirth=(Date)getValueProperty(FFConstant.DATE_OF_BIRTH);
		
		HashMap fields=new HashMap();
		fields.put(FFConstant.firstName,firstName);
		fields.put(FFConstant.lastName,lastName);
		fields.put(FFConstant.email,email);
		fields.put(FFConstant.password,password);
		fields.put(FFConstant.confirmPassword, confirmPassword);
		fields.put(FFConstant.country,country);
		fields.put(FFConstant.state, state);
		fields.put(FFConstant.city, city);
		fields.put(FFConstant.postalcode, postalcode);
		fields.put(FFConstant.gender, gender);
		fields.put(FFConstant.login, login);
		fields.put(FFConstant.ADDRESS1, address1);
	
		
		logInfo(" DATA ------------- "+fields);
		
		getFFUtils().validateFields(fields);
		
		HashMap error=getFFUtils().getErrorInfo();
		putErrorMessage(error);
		setValueProperty("loginAttempt","0");
		setValueProperty("lastLoginActivityDate",new Timestamp(new java.util.Date().getTime()));
		logInfo(getImageURL());
		logInfo("uploaded file "+getUploadedFile());
		try {
			if (error == null || error.size() <= 0) {
				if (getUploadedFile() != null) {
					
					int length = 0;
					logInfo(this.getUploadedFile().getContentType());
					logInfo(this.getUploadedFile().getFilename());
					String fileName = getUploadedFile().getFilename();
					logInfo(pRequest.getContextPath());
					String root=pRequest.getPathTranslated();
					logInfo(pRequest.getPathTranslated());
					File f=new File("C:/jboss-4.0.5.GA/server/ff/deploy/ff.ear/ff.war/img/user/"+fileName);
					File f1=new File("F:/FindFast/j2ee-apps/ff/ff.war/img/user/"+fileName);
					FileOutputStream output1=new FileOutputStream(f1);
					
					FileOutputStream output = new FileOutputStream(
							f);
					DataInputStream input = new DataInputStream(
							getUploadedFile().getInputStream());
					byte[] bbuf = new byte[4 * 1024];
					while ((input != null)
							&& ((length = input.read(bbuf)) != -1)) {
						output.write(bbuf, 0, length);
						output1.write(bbuf,0,length);
					}
					if(getImageURL()!=null && getImageURL().length()>0)
					{
						MutableRepositoryItem media=getProductRepository().getItemForUpdate(getImageURL(),"media");
						if(media!=null)
						{
							media.setPropertyValue("path","/img/user/"+fileName);
							getProductRepository().updateItem(media);
						}
					}
					else{
					RepositoryItem item = this.getProductRepository().getItem("fld10002", "folder");
					if (item != null) {
						MutableRepositoryItem rep = this.getProductRepository()
								.createItem("media");
						rep.setPropertyValue("name", fileName);
						rep.setPropertyValue("description", fileName);
						rep.setPropertyValue("parentFolder", item);
						rep.setPropertyValue("url", "/img/user/"+fileName);
						rep.setPropertyValue("path","/img/user/"+ fileName);
						//rep.setPropertyValue("creationDate", new Date());
						RepositoryItem it=getProductRepository().addItem(rep);
						logInfo("media : "+rep);
						setValueProperty("userImage",rep);
					}
					}
					output.flush();
					output1.flush();
				}
			}
			super.handleUpdate(pRequest, pResponse);
		}
		catch(Exception e)
		{
			logInfo("EXception "+e);
			addFormException(new DropletException(MessageFormat.format("Can not upload image "+e,"Error")));
		}
		
		
		
		
		
		return checkFormRedirect(getSuccessURL(),getErrorURL(),pRequest,pResponse);
	}
	public boolean handleLogin(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse) throws ServletException, IOException
	{
		logInfo("--- Inside Handle Login User ---- ");
		String login[]=null;
		String password=null;
		boolean isLocked=false;
		try
		{
			login=new String[]{(String)getValueProperty("login")};
			password=(String)getValueProperty("password");
			String locked=null;
			if(login!=null && password!=null)
			{
				password=this.getProfileTools().getPropertyManager().generatePassword(password);
				RepositoryItem[] user=findUser(login);
				Timestamp lastLoginActivityDate=null;
				if(user!=null)
				{
					locked=(String)user[0].getPropertyValue("isLocked");
					lastLoginActivityDate=(Timestamp)user[0].getPropertyValue("lastLoginActivityDate");
					Calendar c1 = Calendar.getInstance();
					c1.setTimeInMillis(lastLoginActivityDate.getTime());
					Calendar c2 = Calendar.getInstance();
					c2.setTimeInMillis(lastLoginActivityDate.getTime());
					c2.set(Calendar.DATE, c2.get(Calendar.DATE) + 1);
					Calendar now = Calendar.getInstance();
					if (now.after(c1) && now.before(c2) && !locked.equals("true")) {
					
						if(user[0].getPropertyValue("password")!=null && !user[0].getPropertyValue("password").toString().equals(password))
						{
							loginRetryAuthentication(user[0]);
						}
						
					}
					else if(!(now.after(c1) && now.before(c2)))
					{
						restoreUserLogin(user[0]);
					}
					
				}
			}
		}
		catch(Exception e)
		{
			logInfo("Exception in handleLogin ----"+e);
		}
		return super.handleLogin(pRequest, pResponse);
	}
	public void restoreUserLogin(RepositoryItem user) throws RepositoryException
	{
		MutableRepository rep=getProfileTools().getProfileRepository();
		MutableRepositoryItem profile=(MutableRepositoryItem) rep.getItemForUpdate(user.getRepositoryId(),"user");
		profile.setPropertyValue("loginAttempt","0");
		profile.setPropertyValue(
				"lastLoginActivityDate",
				new Timestamp(new java.util.Date().getTime()));
		profile.setPropertyValue("isLocked", "false");
		setLocked(false);
		rep.updateItem(profile);
	}
	public void loginRetryAuthentication(RepositoryItem user) throws RepositoryException
	{
		String count=(String)user.getPropertyValue("loginAttempt");
		MutableRepository rep=getProfileTools().getProfileRepository();
		MutableRepositoryItem profile=(MutableRepositoryItem) rep.getItemForUpdate(user.getRepositoryId(),"user");
		if(Integer.parseInt(count)>=this.getMaxLoginAttempt()){
			setLocked(true);
			profile.setPropertyValue("isLocked","true");
		}
		else{
		int c=Integer.parseInt(count)+1;
		profile.setPropertyValue("loginAttempt",""+c);
		}
		rep.updateItem(profile);
	}
	public void putErrorMessage(HashMap error)
	{
		Set set=error.entrySet();
		Iterator iterate=set.iterator();
		logInfo("Inside Error Message");
		logInfo(""+error);
		while(iterate.hasNext())
		{
			Map.Entry entry=(Entry) iterate.next();
			final ResourceBundle resourceBundle=ResourceBundle.getBundle("com.ff.ErrorMessage");
			String errorCode=entry.getValue().toString();
			String errorMessage= ResourceUtils.getMsgResource(errorCode, "com.ff.ErrorMessage", resourceBundle);
			addFormException(new DropletException(MessageFormat.format(errorMessage, entry.getKey().toString())));
		}
	}
	public Set getUserInterests()
	{
		Set s=null;
		try{
		if(getUserInterest()!=null && getUserInterest().length>0)
		{
			s=new HashSet();
			for(int i=0;i<getUserInterest().length;i++)
			{
				RepositoryItem item=getProductRepository().getItem(getUserInterest()[i],"category");
				s.add(item);
			}
				
		}
		}
		catch(Exception e)
		{
			logInfo(e);
			addFormException(new DropletException("Exception "+e,"Exception"));
		}
		return s;
	}
	public FFConstant FFConstant() {
		return FFConstant;
	}
	public void setFFConstant(FFConstant constant) {
		FFConstant = constant;
	}
	public MutableRepository getProfileRepository() {
		return profileRepository;
	}
	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	public int getMaxLoginAttempt() {
		return maxLoginAttempt;
	}
	public void setMaxLoginAttempt(int maxLoginAttempt) {
		this.maxLoginAttempt = maxLoginAttempt;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String[] getUserInterest() {
		return userInterest;
	}
	public void setUserInterest(String[] userInterest) {
		this.userInterest = userInterest;
	}
	public UploadedFile getUploadedFile() {
		return uploadedFile;
	}
	public void setUploadedFile(UploadedFile uploadedFile) {
		this.uploadedFile = uploadedFile;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
}
