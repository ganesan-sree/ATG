<%@ taglib uri="/dspTaglib" prefix="dsp" %>
<%@ taglib uri="/fenderTaglib" prefix="fender" %>

<%@ page import="atg.servlet.*" %>
<dsp:page>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler"/>
<dsp:importbean bean="/atg/userprofiling/Profile"/>
<dsp:importbean bean="/atg/dynamo/droplet/Switch"/>
<script type="text/javascript" src="/ff/js/includes/prototype.js"></script>
<script type="text/javascript" src="/ff/js/includes/scriptaculous.js? ¬ 
    load=effects"></script>
<script type="text/javascript" src="/ff/js/includes/modalbox.js"></script>
<div id="header">
<link rel="stylesheet" href="/ff/js/includes/modalbox.css" type="text/css" 
media="screen" />
       <div class="top_right">
       
            <div class="languages">
                <div class="lang_text">Languages:</div>
                <a href="#" class="lang"><img src="/ff/css/tool_shop/images/en.gif" alt="" title="" border="0" /></a>
                <a href="#" class="lang"><img src="/ff/css/tool_shop/images/de.gif" alt="" title="" border="0" /></a>       
            </div>
            
            <div class="big_banner">
            <a href="#"><img src="/ff/css/tool_shop/images/banner728.jpg" alt="" title="" border="0" /></a>

            </div>
        
        </div>
    
  
        <div id="logo">
            <a href="index.html"><img src="/ff/css/tool_shop/images/logo.png" alt="" title="" border="0" width="182" height="85" /></a>
	    </div>
    </div>


<div id="main_content"> 
   
            <div id="menu_tab">
                    <ul class="menu">

                         <li><a href="/ff" class="nav">  Home </a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">Products</a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">Specials</a></li>
                         <li class="divider"></li>
                         <li><a href="#" class="nav">My account</a></li>

                         <li class="divider"></li>
<dsp:droplet name="Switch">
	<dsp:param name="value" bean="Profile.transient"/>
	<dsp:oparam name="false">
	    <li><dsp:a bean="ProfileFormHandler.logout" type="submit" href="/ff" value="submit" iclass="nav" >Logout</dsp:a></li>
	</dsp:oparam>
	<dsp:oparam name="true">
	    <li><a href="user/registration.jsp" class="nav">Sign Up</a></li>
	</dsp:oparam>
</dsp:droplet>
                     
                         <li class="divider"></li>                         
                         <li><a href="#" class="nav">Shipping </a></li>
                         <li class="divider"></li>
                         <li><a href="/ff/common/about.jsp;" title="About Us" onclick="
Modalbox.show(this.href, {title: this.title, width: 600}); return false;
" class="nav"> About Us</a></li>

                    </ul>

	</div><!-- end of menu tab -->




			
</dsp:page>
