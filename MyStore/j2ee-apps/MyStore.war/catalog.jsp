<%@ taglib uri="/dsp" prefix="dsp"%>
<dsp:importbean bean="/atg/userprofiling/ProfileFormHandler" />
<dsp:importbean bean="/atg/userprofiling/Profile" />
<dsp:importbean bean="/atg/userprofiling/ProfileErrorMessageForEach" />
<dsp:importbean bean="/atg/dynamo/droplet/Switch" />
<%@ page import="atg.servlet.*"%>
<dsp:importbean bean="/atg/dynamo/droplet/ForEach"/>
<dsp:page>
 
<html>
<head><title>Products for sale</title></head>
<body>
 
  <table border="3">
    <dsp:droplet name="/com/cts/droplet/ListSkus">
      <dsp:oparam name="output">
        <tr>
          <td>
            <dsp:a href="ProcessOrder.jsp"><dsp:valueof param="items.displayName"/>
              <dsp:param name="sku" param="items.id" />
              <dsp:param name="product" param="items.parentProducts" />
            </dsp:a>
          </td>
          <td>$<dsp:valueof param="items.listPrice"/></td>
        </tr>
      </dsp:oparam>
    </dsp:droplet>
  </table>
 
</body>
</html>
 
</dsp:page>
