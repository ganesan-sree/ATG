function selectCountry(from)
{
	val=document.getElementById(from);
	dsp=document.getElementById("dsp"+from);
	dsp.value=val.value;
	alert(dsp.value);
}
function copyAddress(from)
{
	val=document.getElementById(from);
	homeAddress1=document.getElementById("dsphomeAddress1");
	homeAddress2=document.getElementById("dsphomeAddress2");
	homeCountry=document.getElementById("homeCountry");
	homeState=document.getElementById("dsphomeState");
	homeCity=document.getElementById("dsphomeCity");
	homePostalcode=document.getElementById("dsphomePostalcode");
	
	country=document.getElementById(from+"Country");

	dspAddress1=document.getElementById("dsp"+from+"Address1");
	dspAddress2=document.getElementById("dsp"+from+"Address2");
	dspCountry=document.getElementById("dsp"+from+"Country");
	dspState=document.getElementById("dsp"+from+"State");
	dspCity=document.getElementById("dsp"+from+"City");
	dspPostalcode=document.getElementById("dsp"+from+"Postalcode");
	
	if(val.checked)
	{
		dspAddress1.value=homeAddress1.value;
		dspAddress2.value=homeAddress2.value;
		dspCountry.value=homeCountry.value;
		country.value=homeCountry.value;
		dspState.value=homeState.value;
		dspCity.value=homeCity.value;
		dspPostalcode.value=homePostalcode.value;
	}
	else
	{
		dspAddress1.value="";
		dspAddress2.value="";
		dspCountry.value="";
		country.value="";
		dspState.value="";
		dspCity.value="";
		dspPostalcode.value="";
	}
}
