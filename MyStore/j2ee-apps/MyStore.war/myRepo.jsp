<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:importbean bean="/com/cts/handler/MyRepoHandler" />
	<dsp:importbean bean="/com/cts/droplet/MyRepoDroplet" />
	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/dynamo/droplet/Redirect" />
	<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
	<dsp:importbean bean="/atg/dynamo/droplet/ErrorMessageForEach" />


	<dsp:form name="myrepo" formid="myrepo" action="myRepo.jsp"
		method="post">
		<dsp:droplet name="Switch">
			<dsp:param bean="MyRepoHandler.formError" name="value" />
			<dsp:oparam name="true">
				<dsp:droplet name="ErrorMessageForEach">
					<dsp:param bean="MyRepoHandler.formExceptions" name="exceptions" />
					<dsp:oparam name="output">
						<dsp:valueof param="message" />
					</dsp:oparam>
				</dsp:droplet>
			</dsp:oparam>
		</dsp:droplet>
		
		
		
		
		
		
		<div class="form_row">
			<label class="labels"><strong>Details</strong></label> <br />
			<h2>
				<dsp:valueof bean="MyRepoHandler.successMessage" />
			</h2>
			<dsp:input type="text" bean="MyRepoHandler.name" name="Name"
				size="25" />
			<br />
			<dsp:input type="text" bean="MyRepoHandler.address" name="Address"
				size="25" />
			<br />
			<dsp:input type="text" bean="MyRepoHandler.phone" name="phone"
				size="25" />
			<br />
		</div>
		<div class="form_row">
			<dsp:input type="submit" bean="MyRepoHandler.create" value="Create" />
			<dsp:input type="hidden" bean="MyRepoHandler.successURL"
				value="myRepo.jsp" />
			<dsp:input type="hidden" bean="MyRepoHandler.errorURL"
				value="myRepo.jsp" />
		</div>
	</dsp:form>





	<dsp:droplet name="MyRepoDroplet">
		<dsp:oparam name="output">
			<dsp:droplet name="/atg/dynamo/droplet/ForEach">
				<dsp:param name="array" param="userlist" />
				<dsp:param name="elementName" value="user" />
				<dsp:oparam name="empty">
    				There are no User<br />
				</dsp:oparam>
				<dsp:oparam name="outputStart">
    				List Of User<br />
				</dsp:oparam>
				<dsp:oparam name="output">
					<dsp:valueof param="user.name"></dsp:valueof>
					<dsp:valueof param="user.address"></dsp:valueof>
					<dsp:valueof param="user.phone"></dsp:valueof>
					<dsp:a href="myRepo.jsp">
						<dsp:valueof value="Edit" />
						<dsp:param name="userId" param="user.id" />
					</dsp:a>
					<dsp:form id="myrepodelete">
						<dsp:input type="hidden" bean="MyRepoHandler.userId" name="userId"
							paramvalue="user.id" size="25" />
						<dsp:input bean="MyRepoHandler.delete" type="submit"
							value="Delete" />
					</dsp:form>
					<br />
				</dsp:oparam>
			</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>




	<dsp:droplet name="MyRepoDroplet">
		<dsp:param name="elementName" value="user" />
		<dsp:oparam name="edit">
			<dsp:form name="myrepoedit" formid="myrepoedit" action="myRepo.jsp">
				<dsp:input type="text" bean="MyRepoHandler.name" name="Name"
					paramvalue="user.name" size="25" />
				<br />
				<dsp:input type="text" bean="MyRepoHandler.address" name="Address"
					paramvalue="user.address" size="25" />
				<br />
				<dsp:input type="text" bean="MyRepoHandler.phone" name="phone"
					paramvalue="user.phone" size="25" />
				<br />
				<dsp:param name="userId" param="user.id" />
				<dsp:input type="hidden" bean="MyRepoHandler.userId" name="userId"
					paramvalue="user.id" size="25" />
				<br />
				<dsp:input type="submit" bean="MyRepoHandler.update" value="Update" />
				<dsp:input type="hidden" bean="MyRepoHandler.successURL"
					value="myRepo.jsp" />
				<dsp:input type="hidden" bean="MyRepoHandler.errorURL"
					value="myRepo.jsp" />
			</dsp:form>
		</dsp:oparam>
	</dsp:droplet>

</dsp:page>