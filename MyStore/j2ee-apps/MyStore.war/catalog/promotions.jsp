<%@ taglib uri="/dsp" prefix="dsp"%>


<dsp:page>

<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>

<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:droplet name="ForEach">
	<dsp:param name="array" bean="Profile.activePromotions"/>
	<dsp:oparam name="outputStart">
		<ul>
	</dsp:oparam>
	<dsp:oparam name="output">
		<li>
			<dsp:valueof param="element.promotion.displayName"/> <br\><dsp:valueof param="element.promotion.description"/>
		</li>
	</dsp:oparam>
	<dsp:oparam name="outputEnd">
		</ul>
	</dsp:oparam>
	<dsp:oparam name="empty">
		Theres no active promotions
	</dsp:oparam>
</dsp:droplet>
</dsp:page>