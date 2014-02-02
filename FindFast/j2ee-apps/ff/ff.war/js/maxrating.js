function showIt(item,i,j,max){
   var id;
   actualItem = item;

   
   // Show the selected boxes
   for (var x=1;x<=i;x++){
      id = item + "_" + x;
val=document.getElementById(id);
	if(val!=null)
      document.getElementById(id).src = "/ff/img/rating/b.gif";
   }
   
   // Display the not selected ones
   for (var x=i+1;x<=max;x++){
      id = item + "_" + x;
val=document.getElementById(id);
	if(val!=null){
      if (x<=j) document.getElementById(id).src = "/ff/img/rating/y.gif";
      else document.getElementById(id).src = "/ff/img/rating/w.gif";
	}
   }
}

function showOriginal(i,max){
   for (var x=1;x<=max;x++){
      id = actualItem + "_" + x;
      val=document.getElementById(id);
	if(val!=null){
      if (x<=i) document.getElementById(id).src = "/ff/img/rating/y.gif";
      else document.getElementById(id).src = "/ff/img/rating/w.gif";
	}
   }
}

// Get the HTTP Object
function getHTTPObject(){
   if (window.ActiveXObject) return new ActiveXObject("Microsoft.XMLHTTP");
   else if (window.XMLHttpRequest) return new XMLHttpRequest();
   else {
      alert("Your browser does not support AJAX.");
      return null;
   }
}   

// Change the value of the outputText field
function setOutput(){
   var result;
   var data;
   var rating;
   var totalRates;
   var max;
   if(httpObject.readyState == 4){
      result = httpObject.responseText;
	alert(result);
        updateTextRating(actualItem,rating,totalRates,max);
      removeActions(Math.round(rating),max);
   }
}

function removeActions(rating,max){
      showOriginal(rating,max);
      var t;
      for (var x=1;x<=max;x++){
         id = actualItem + "_" + x;
         t = document.getElementById(id);
         t.onmouseover = null;
         t.onmouseout  = null;
         t.onclick     = null;
      }  
}

function updateTextRating(item,rating,total,max){
   var itemRating;
   var totalRating;
   var id;
   
   id = item + "_ir";
   itemRating = document.getElementById(id);
   id = item + "_tr";
   totalRating = document.getElementById(id);
   
   if (itemRating != null) itemRating.innerHTML = rating;
   if (totalRating != null) totalRating.innerHTML = total;
}

// Implement business logic
function submitRating(item,rate,max,skuId){
   httpObject = getHTTPObject();
   actualItem = item;
   if (httpObject != null) {
     
httpObject.open("POST","http://localhost:8180/vote/vote/setRating");
httpObject.setRequestHeader("Man", "POST http://localhost:8180/vote/vote/setRating HTTP/1.1");
 httpObject.setRequestHeader("MessageType","CALL");
 httpObject.setRequestHeader("Content-Type","text/xml");
 httpObject.setRequestHeader("Connection", "close");
 /* Calling the Web service */
 httpObject.send("<?xml version='1.0' encoding='UTF-8'?>"+"\n\n"+
             '<SOAP-ENV:Envelope'+
             ' xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"'+
             ' xmlns:xsi="http://www.w3.org/1999/XMLSchema-instance"'+
             ' xmlns:xsd="http://www.w3.org/1999/XMLSchema">'+
               '<SOAP-ENV:Body xmlns:ns1="http://www.atg.com/webservices">'+
               '<ns1:setRating SOAP-ENV:encodingStyle="http://schemas.xmlsoap.org/soap/encoding/">'+
                 '<skuID xsi:type="xsd:string">'+skuId+'</skuID>'
                 +
                 '<rating xsi:type="xsd:string">'+rate+'</rating>'+
               '</ns1:setRating>'+
             '</SOAP-ENV:Body></SOAP-ENV:Envelope>');



      httpObject.onreadystatechange = setOutput;
   }
}
 
var httpObject = null;
var actualItem = null;
