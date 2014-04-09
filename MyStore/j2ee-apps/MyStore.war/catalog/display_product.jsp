<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:page>
	<dsp:droplet name="/atg/commerce/catalog/CategoryLookup">
		<dsp:param param="itemId" name="id" />

		<dsp:oparam name="output">
			<dsp:droplet name="/atg/dynamo/droplet/ForEach">
				<dsp:param param="element.childProducts" name="array" />
				<dsp:oparam name="outputStart">
					<p>
						<b>Child Products:</b>
				</dsp:oparam>
				<dsp:oparam name="output">
					<dsp:getvalueof var="templateURL" param="element.template.url" />
					<dsp:a href="${templateURL}">
						<dsp:valueof param="element.displayName" />
						<dsp:param param="element.repositoryId" name="itemId" />
					</dsp:a>
				</dsp:oparam>
			</dsp:droplet>
		</dsp:oparam>
	</dsp:droplet>
</dsp:page>
