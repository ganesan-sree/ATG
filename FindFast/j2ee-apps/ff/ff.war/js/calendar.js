var currmonth;
var curryear;
var currdate;
var inHTML;
var month_arr = new Array("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
d = new Date();
window.onload=function populateYearSelect()
{
curryear = d.getFullYear();
currmonth = d.getMonth();
currdate=d.getDate();
startingdate();
}

function startingdate()
{
inHTML='<table id="cal">'
inHTML +='<tr id="yearmonth"><td colspan="4"align="center"><a href="javascript:void(0)" onclick="prevmonth()" id="arrow">&laquo;</a><span id="month"> </span><a href="javascript:void(0)" onclick="nextmonth()" id="arrow">&raquo;</a></td> <td colspan="3" align="center"><a href="javascript:void(0)" onclick="prevyear()"id="arrow">&laquo;</a> <span id="year"> </span> <a href="javascript:void(0)" onclick="nextyear()" id="arrow">&raquo;</a></td></tr>'



inHTML +='<tr id="days"><td>Sun</td><td>Mon</td><td>Tue</td><td>Wed</td><td>Thur</td><td>Fri</td><td>Sat</td></tr>';
inHTML +='<tbody id="dd">';
starting = new Date();
starting.setYear(curryear);
starting.setMonth(currmonth);
starting.setDate(1);
startday = starting.getDay();
dates = starting.getDate();
inHTML +='<tr>';
for (i=0; i<startday; i++)
{
inHTML +='<td></td>';
}
for (j=startday; j<7; j++)
{
if (dates==currdate)
{
inHTML +='<td id="highlightday"><a href="javascript:void(0)" onclick="gettheday(this)">'+dates+'</a></td>';
}
else
{
inHTML +='<td><a href="javascript:void(0)" onclick="gettheday(this)">'+dates+'</a></td>';
}
dates++;
}
inHTML +='</tr>';
for (da=dates; da<=lastdate();)
{
inHTML +='<tr>';
for (i=0; i<7; i++)
{
if (dates>lastdate())
{
inHTML +='<td> </td>';
}
else
{
if (dates==currdate)
{
inHTML +='<td id="highlightday"><a href="javascript:void(0)" onclick="gettheday(this)">'+dates+'</a></td>';
}
else
{
inHTML +='<td><a href="javascript:void(0)" onclick="gettheday(this)">'+dates+'</a></td>';
}
dates++;
}

}
da=dates;
inHTML +='</tr>';
}
inHTML +='</tbody>';
inHTML +='<tr><td  colspan="4" style="padding-right:0; border-right:0px;border-spacing:0px;" align="left"><input type="button" value="Today" id="todaybutton" onclick="todaysdate()"></td>';
inHTML +='<td align="right" colspan="3" style="padding-left:0; border-left:0px;"><input type="button" value="Close" id="closebutton" onclick="hidecalendar()"></td></tr>';

inHTML +='</table>';
document.getElementById('calendar').innerHTML = inHTML;
document.getElementById('month').innerHTML = month_arr[currmonth];
document.getElementById('year').innerHTML = curryear;

}

function nextmonth()
{
currmonth++;
if (currmonth>11)
{
currmonth=0;
curryear++;
document.getElementById('month').innerHTML = month_arr[currmonth];
document.getElementById('year').innerHTML = curryear;
inHTML=null;
startingdate();
}
else
{
document.getElementById('month').innerHTML = month_arr[currmonth];
inHTML=null;
startingdate();
lastdate();
}
}

function prevmonth()
{
currmonth--;
if (currmonth<0)
{
currmonth=11;
curryear--;
document.getElementById('month').innerHTML = month_arr[currmonth];
document.getElementById('year').innerHTML = curryear;
inHTML=null;
startingdate();
}
else
{
document.getElementById('month').innerHTML = month_arr[currmonth];
inHTML=null;
startingdate();
}
}

function prevyear()
{
curryear--;
document.getElementById('year').innerHTML = curryear;
inHTML=null;
startingdate();
}

function nextyear()
{
curryear++;
document.getElementById('year').innerHTML = curryear;
inHTML=null;
startingdate();
}

function lastdate()
{
lastd = new Date (curryear, currmonth+1, 0);
return lastd.getDate();
}

function gettheday(sdate)
{
var ba= sdate.innerHTML;
cumonth = currmonth+1;
ba +='/'+cumonth+'/'+curryear;
document.getElementById("datedisplay").value=ba;
}

function todaysdate()
{
var ba= d.getDate();
cumonth = d.getMonth()+1;
cuyear = d.getFullYear();
ba +='/'+cumonth+'/'+cuyear;
document.getElementById("datedisplay").value=ba;
}

function showcalendar()
{
document.getElementById("calendar").style.display="block";
}
function hidecalendar()
{
document.getElementById("calendar").style.display="none";
}
