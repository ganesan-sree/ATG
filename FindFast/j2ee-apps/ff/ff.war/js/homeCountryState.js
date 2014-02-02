/* --- BoxOver ---
/* --- v 2.1 17th June 2006
By Oliver Bryant with help of Matthew Tagg
http://boxover.swazz.org */

function countryChange(from)
{
	first=document.getElementById(from);
	second=document.getElementById("dsp"+from);
	second.value=first.value;
}
function copyAddress(from)
{
	val=document.getElementById(from+"LoadAddress");
	homeAddress1=document.getElementById("homeAddress1");
	homeAddress2=document.getElementById("homeAddress2");
	homeCountry=document.getElementById("homeCountry");
	homeState=document.getElementById("homeState");
	homeCity=document.getElementById("homeCity");
	homePostalcode=document.getElementById("homePostalcode");

	Address1=document.getElementById(from+"Address1");
	Address2=document.getElementById(from+"Address2");
	Country=document.getElementById(from+"Country");
	State=document.getElementById(from+"State");
	City=document.getElementById(from+"City");
	Postalcode=document.getElementById(from+"Postalcode");


	
	dspCountry=document.getElementById("dsp"+from+"Country");

	if(val.checked)
	{
		Address1.value=homeAddress1.value;
		Address2.value=homeAddress2.value;
		dspCountry.value=homeCountry.value;
		Country.value=homeCountry.value;
		State.value=homeState.value;
		City.value=homeCity.value;
		Postalcode.value=homePostalcode.value;
	}
	else
	{
		Address1.value="";
		Address2.value="";
		Country.value="";
		dspCountry.value="";
		State.value="";
		City.value="";
		PostalCode.value="";
	}


}
