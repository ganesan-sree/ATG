<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>

	<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
	<dsp:importbean bean="/atg/userprofiling/Profile" />
	<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
	
	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Home Shop" />
	</dsp:include>

	
	<dsp:include src="/common/header.jsp">
		<dsp:param name="title" value="Home Shop" />
	</dsp:include>
	
	
	<dsp:include src="catalog.jsp" />
	
	
	<dsp:include src="/common/footer.jsp" />
</dsp:page>
