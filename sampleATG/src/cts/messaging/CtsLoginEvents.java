package cts.messaging;

import java.util.HashMap;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.userprofiling.dms.DPSMessage;
import atg.userprofiling.email.HtmlContentProcessor;
import atg.userprofiling.email.TemplateEmailException;
import atg.userprofiling.email.TemplateEmailInfoImpl;
import atg.userprofiling.email.TemplateEmailSender;


public class CtsLoginEvents implements atg.dms.patchbay.MessageSink
	{
	
	
	private TemplateEmailSender mEmailSenderTemplate;
	private MutableRepository mProfileRepository;
	
	public MutableRepository getProfileRepository() {
		return mProfileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		mProfileRepository = profileRepository;
	}
	

		

		public TemplateEmailSender getmEmailSenderTemplate() {
		return mEmailSenderTemplate;
	}
	public void setmEmailSenderTemplate(TemplateEmailSender mEmailSenderTemplate) {
		this.mEmailSenderTemplate = mEmailSenderTemplate;
	}
	public TemplateEmailInfoImpl getmLoginEmailInfoTemplate() {
		return mLoginEmailInfoTemplate;
	}
	public void setmLoginEmailInfoTemplate(
			TemplateEmailInfoImpl mLoginEmailInfoTemplate) {
		this.mLoginEmailInfoTemplate = mLoginEmailInfoTemplate;
	}
		@Override
		public void receiveMessage(String pPortName, Message pMessage)
				throws JMSException
			{
				System.out.println("Received message from port " + pPortName
						+ " of JMSType " + pMessage.getJMSType());

				ObjectMessage objectMessage = null;

				if (pMessage instanceof ObjectMessage)
					{						
						objectMessage = (ObjectMessage) pMessage;
						System.out.println("  ObjectMessage, value =" + objectMessage);						
						if (objectMessage.getObject() instanceof DPSMessage)
							{
								DPSMessage dpsMessage = (DPSMessage) objectMessage.getObject();								
								String profileId = dpsMessage.getProfileId();
								System.out.println(profileId);
								System.out.println("Done");
							}

					}

			}

		
		
		private TemplateEmailInfoImpl mLoginEmailInfoTemplate;
		
		public TemplateEmailInfoImpl getLoginEmailInfoTemplate()
			{
				return mLoginEmailInfoTemplate;
			}
		public void setLoginEmailInfoTemplate(
				TemplateEmailInfoImpl pLoginEmailInfoTemplate)
			{
				mLoginEmailInfoTemplate = pLoginEmailInfoTemplate;
			}
		public void sendMailForLogin (String profileId){
		
			System.out.println(getLoginEmailInfoTemplate());
			
			MutableRepositoryItem userItem=null;
			try
				{
					 userItem = getProfileRepository().getItemForUpdate(profileId,"user");
				} catch (RepositoryException e1)
				{			
					e1.printStackTrace();
				}
			
			String emailAddress = (String) userItem.getPropertyValue("email");
			System.out.println(emailAddress);
			HtmlContentProcessor contentProcessor = new HtmlContentProcessor();		
			contentProcessor.setSendAsHtml(true);
			contentProcessor.setSendAsText(false);
			getmLoginEmailInfoTemplate().setContentProcessor(contentProcessor);
			
			
			getmLoginEmailInfoTemplate().setMessageTo(emailAddress);
			getmLoginEmailInfoTemplate().setFillFromTemplate(true);
					
			Map emailMap = new HashMap();	
			emailMap.put("firstName","ganesan");		
			Map map = new HashMap();
			map.put("emailMap", emailMap);
			
				

			getLoginEmailInfoTemplate().setMessageSubject("Login SuccessFull !!!!!!");
			getLoginEmailInfoTemplate().setTemplateURL("/common/email/login_event.jsp");
			String strTemplateURLRestore = getLoginEmailInfoTemplate().getTemplateURL();
			System.out.println("#####################     ==== "+strTemplateURLRestore);
					
			       
			 MutableRepositoryItem[] users = { userItem };
			 try
				{
					getLoginEmailInfoTemplate().setTemplateParameters(map);
					mEmailSenderTemplate.sendEmailMessage(getLoginEmailInfoTemplate(), users, false, false);
				} catch (TemplateEmailException e)
				{			
					e.printStackTrace();
				}
		}
		
	}
