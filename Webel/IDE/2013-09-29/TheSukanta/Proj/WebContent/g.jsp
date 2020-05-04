<!DOCTYPE html>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<link type="text/css" href="winter/style.css" rel="stylesheet" media="screen" />
<title>Winter School Training Registration Form - Globsyn</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.pack.js"></script>
<script type="text/javascript" src="/winter/js/registration.js"></script>
<script type="text/javascript" src="/winter/js/ajax.js"></script>

<script>
 function resetCaptcha() 
 {
  document.getElementById('imgCaptcha').src = '../ysm/captchaimage.jsp?' + Math.random(); 
 }
</script>

<style>
body {background:url("/images/new_bg.jpg") no-repeat center top;}
a{color:#fff; text-decoration:none; font-size:10px;}
a:hover{color:#3CF;}
h6{color:#fff; font-weight:100; float:left;}
#formheader, #header{background: #F7F7F7 !important; color:#000;}
#formheader img, #header img{ height: auto !important; width: 131px !important;}
</style>

</head>

<body>


<div id="formcontainer" style="background:#fff;">
<div id="formheader">
<img src="winter/images/gfsNew.png" /><center>Registration Form - Winter School-2013 </center>
</div>


<div><br clear="all" /></div>

<div id="instructions">
<b>Instructions :</b>
<ul>
<li>Please read the instructions carefully and fill up all relevant sections before submitting the form.</li>
<li>Improperly filled up forms will not be considered.</li>
<li>Students must have a valid e-mail id to register.</li>
<li>After submission, a copy of the form will be mailed to you at your e-mail id.</li>
</ul>
</div>
<div id="form">
<form name="ysmregis" method="POST" action="/registration_form.jsp?registration" enctype="multipart/form-data">

<div id="error"> </div>

<span>Your Preferred Location</span>
<div class="formnames">Location: </div>
<input type="radio" id="l1" name="selectlocation" value="Kolkata"  />&nbsp;<label><b>KOLKATA</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" id="l2" name="selectlocation" value="Durgapur"  />&nbsp;<label><b>DURGAPUR</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" id="l3" name="selectlocation" value="Bhubaneswar"   />&nbsp;<label><b>BHUBANESWAR</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" id="l4" name="selectlocation" value="Delhi" />&nbsp;<label><b>DELHI</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" id="l5" name="selectlocation" value="Mumbai"  />&nbsp;<label><b>MUMBAI</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<br />
<br />
<span>Personal Details</span>
<div class="formnames">First Name: </div><input type="text" class="input" maxlength="30" name="firstname" value='' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Last Name: <input type="text" class="input" maxlength="30" name="lastname"  value=''/><br /><br />
<div class="formnames">Email: </div><input type="text" class="input" maxlength="40" name="email" value='' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Date of Birth: 
    <select name="day">
	  <option value="">Select</option>
	
	  <option value="1" > 1 </option>
	
	  <option value="2" > 2 </option>
	
	  <option value="3" > 3 </option>
	
	  <option value="4" > 4 </option>
	
	  <option value="5" > 5 </option>
	
	  <option value="6" > 6 </option>
	
	  <option value="7" > 7 </option>
	
	  <option value="8" > 8 </option>
	
	  <option value="9" > 9 </option>
	
	  <option value="10" > 10 </option>
	
	  <option value="11" > 11 </option>
	
	  <option value="12" > 12 </option>
	
	  <option value="13" > 13 </option>
	
	  <option value="14" > 14 </option>
	
	  <option value="15" > 15 </option>
	
	  <option value="16" > 16 </option>
	
	  <option value="17" > 17 </option>
	
	  <option value="18" > 18 </option>
	
	  <option value="19" > 19 </option>
	
	  <option value="20" > 20 </option>
	
	  <option value="21" > 21 </option>
	
	  <option value="22" > 22 </option>
	
	  <option value="23" > 23 </option>
	
	  <option value="24" > 24 </option>
	
	  <option value="25" > 25 </option>
	
	  <option value="26" > 26 </option>
	
	  <option value="27" > 27 </option>
	
	  <option value="28" > 28 </option>
	
	  <option value="29" > 29 </option>
	
	  <option value="30" > 30 </option>
	
	  <option value="31" > 31 </option>
	
	</select>&nbsp;&nbsp;
	<select name="month" >
		
		<option  value="">Select</option>
		
		
                            <option value="January" >Jan</option>
                 
                            <option value="February" >Feb</option>
                 
                            <option value="March" >Mar</option>
                 
                            <option value="April" >Apr</option>
                 
                            <option value="May" >May</option>
                 
                            <option value="June" >Jun</option>
                 
                            <option value="July" >Jul</option>
                 
                            <option value="August" >Aug</option>
                 
                            <option value="September" >Sep</option>
                 
                            <option value="October" >Oct</option>
                 
                            <option value="November" >Nov</option>
                 
                            <option value="December" >Dec</option>
                  
		
	</select>&nbsp;&nbsp;
    <select name="year"><option value="">Select</option><option value="2013" >2013</option><option value="2012" >2012</option><option value="2011" >2011</option><option value="2010" >2010</option><option value="2009" >2009</option><option value="2008" >2008</option><option value="2007" >2007</option><option value="2006" >2006</option><option value="2005" >2005</option><option value="2004" >2004</option><option value="2003" >2003</option><option value="2002" >2002</option><option value="2001" >2001</option><option value="2000" >2000</option><option value="1999" >1999</option><option value="1998" >1998</option><option value="1997" >1997</option><option value="1996" >1996</option><option value="1995" >1995</option><option value="1994" >1994</option><option value="1993" >1993</option><option value="1992" >1992</option><option value="1991" >1991</option><option value="1990" >1990</option><option value="1989" >1989</option><option value="1988" >1988</option><option value="1987" >1987</option><option value="1986" >1986</option><option value="1985" >1985</option><option value="1984" >1984</option><option value="1983" >1983</option><option value="1982" >1982</option><option value="1981" >1981</option><option value="1980" >1980</option><option value="1979" >1979</option><option value="1978" >1978</option><option value="1977" >1977</option><option value="1976" >1976</option><option value="1975" >1975</option><option value="1974" >1974</option><option value="1973" >1973</option><option value="1972" >1972</option><option value="1971" >1971</option><option value="1970" >1970</option><option value="1969" >1969</option><option value="1968" >1968</option><option value="1967" >1967</option><option value="1966" >1966</option><option value="1965" >1965</option><option value="1964" >1964</option><option value="1963" >1963</option><option value="1962" >1962</option><option value="1961" >1961</option><option value="1960" >1960</option><option value="1959" >1959</option><option value="1958" >1958</option><option value="1957" >1957</option><option value="1956" >1956</option><option value="1955" >1955</option><option value="1954" >1954</option><option value="1953" >1953</option><option value="1952" >1952</option><option value="1951" >1951</option><option value="1950" >1950</option> 
	</select><br /><br />
<div class="formnames">Upload Photo: </div><input type="file" class="input" name="photo"  />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i>(optional)</i>
<br />
<span>Mailing Address</span>
<div class="formnames">Address: </div><input type="text" class="input" maxlength="150" name="address" style="width: 450px;"  value=''/><br /><br />
<div class="formnames">City: </div><input type="text" class="input" maxlength="20" name="city"  value='' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   
   State: 
   <select name="state"><option  value="">--Select--</option>
		
		<option value="Andhra Pradesh" >Andhra Pradesh </option>
		
		<option value="Arunachal Pradesh" >Arunachal Pradesh </option>
		
		<option value="Andaman Nicobar" >Andaman Nicobar </option>
		
		<option value="Assam" >Assam </option>
		
		<option value="Bihar" >Bihar </option>
		
		<option value="Chhattisgarh" >Chhattisgarh </option>
		
		<option value="Chandigarh" >Chandigarh </option>
		
		<option value="Delhi" >Delhi </option>
		
		<option value="Goa" >Goa </option>
		
		<option value="Gujarat" >Gujarat </option>
		
		<option value="Haryana" >Haryana </option>
		
		<option value="Himachal Pradesh" >Himachal Pradesh </option>
		
		<option value="Jammu Kashmir" >Jammu Kashmir </option>
		
		<option value="Jharkhand" >Jharkhand </option>
		
		<option value="Karnataka" >Karnataka </option>
		
		<option value="Kerala" >Kerala </option>
		
		<option value="Lakshadweep" >Lakshadweep </option>
		
		<option value="Madhya Pradesh" >Madhya Pradesh </option>
		
		<option value="Maharashtra" >Maharashtra </option>
		
		<option value="Manipur" >Manipur </option>
		
		<option value="Meghalaya" >Meghalaya </option>
		
		<option value="Mizoram" >Mizoram </option>
		
		<option value="Nagaland" >Nagaland </option>
		
		<option value="Orissa" >Orissa </option>
		
		<option value="Pondicherry" >Pondicherry </option>
		
		<option value="Punjab" >Punjab </option>
		
		<option value="Rajasthan" >Rajasthan </option>
		
		<option value="Sikkim" >Sikkim </option>
		
		<option value="Tamilnadu" >Tamilnadu </option>
		
		<option value="Tripura" >Tripura </option>
		
		<option value="Uttar Pradesh" >Uttar Pradesh </option>
		
		<option value="Uttaranchal" >Uttaranchal </option>
		
		<option value="West Bengal" >West Bengal </option>
		
		<option value="Others" >Others </option>
		 
 					</select> <br /><br />

<div class="formnames">Pin Code: </div><input type="text" class="input" maxlength="6" name="pin"  value=''/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Phone/Mobile: <input type="text" class="input" maxlength="10" name="phone"  value=''/><br /><br /> 

<span>Other Information </span>

<div class="formnames">Class 10 Marks:</div><input type="text" name="marksSchool" id="marksSchool" maxlength="5" placeholder="marks in %"  value=''/><img src="images/space.gif" width="95" height="1" />Class 12 Marks: &nbsp;<input type="text" name="marksHighSchool" id="marksHighSchool" maxlength="5" placeholder="marks in %"  value=''/><br/><br/>
<div class="formnames">JEE Rank or Equivalent</div><input type="text" name="jeeRank" id="jeeRank" maxlength="9" value=''/><br/><br/>
<div class="formnames">Degree:  </div><select name="gradstandard">
                          <option value="">Select</option>
            
		            <option value="B.Tech">B.Tech</option>
		        
		            <option value="B.E">B.E</option>
		        
		            <option value="MCA">MCA</option>
		        
		            <option value="BCA">BCA</option>
		        
		            <option value="Diploma">Diploma</option>
		        
		            <option value="B.SC">B.SC</option>
		        
		            <option value="M.Tech">M.Tech</option>
		         
                             
   </select><img src="images/space.gif" width="165" height="1" />
   Graduation Marks: &nbsp;<input type="text" name="marksCollege" id="marksCollege" maxlength="5" placeholder="marks in %" value=''/>
   <br /><br />
   
  <div class="formnames">College Location:</div> 
      <select name="gradlocation" id="gradlocation"  onchange="locationonchange(document.ysmregis.gradlocation.value,'gradcollege');" class="require" style="width: 230px;">
      <option value="">--Select Location--</option>
	    
					<option value="Andaman & Nikobar Island" > Andaman & Nikobar Island</option>                                
                  
					<option value="Andhra Pradesh" > Andhra Pradesh</option>                                
                  
					<option value="Arunachal Pradesh" > Arunachal Pradesh</option>                                
                  
					<option value="Assam" > Assam</option>                                
                  
					<option value="Bihar" > Bihar</option>                                
                  
					<option value="Chhattisgarh" > Chhattisgarh</option>                                
                  
					<option value="Dadra and Nagar Haveli" > Dadra and Nagar Haveli</option>                                
                  
					<option value="Delhi" > Delhi</option>                                
                  
					<option value="Goa" > Goa</option>                                
                  
					<option value="Gujarat" > Gujarat</option>                                
                  
					<option value="Haryana" > Haryana</option>                                
                  
					<option value="Himachal Pradesh" > Himachal Pradesh</option>                                
                  
					<option value="Jammu and Kashmir" > Jammu and Kashmir</option>                                
                  
					<option value="Jharkhand" > Jharkhand</option>                                
                  
					<option value="Karnataka" > Karnataka</option>                                
                  
					<option value="Kerala" > Kerala</option>                                
                  
					<option value="Madhya Pradesh" > Madhya Pradesh</option>                                
                  
					<option value="Maharashtra" > Maharashtra</option>                                
                  
					<option value="Manipur" > Manipur</option>                                
                  
					<option value="Meghalaya" > Meghalaya</option>                                
                  
					<option value="Mizoram" > Mizoram</option>                                
                  
					<option value="Nagaland" > Nagaland</option>                                
                  
					<option value="Odisha" > Odisha</option>                                
                  
					<option value="Pondicherry" > Pondicherry</option>                                
                  
					<option value="Punjab" > Punjab</option>                                
                  
					<option value="Rajasthan" > Rajasthan</option>                                
                  
					<option value="Sikkim" > Sikkim</option>                                
                  
					<option value="Tamil Nadu" > Tamil Nadu</option>                                
                  
					<option value="Tripura" > Tripura</option>                                
                  
					<option value="Uttar Pradesh" > Uttar Pradesh</option>                                
                  
					<option value="Uttaranchal" > Uttaranchal</option>                                
                  
					<option value="West Bengal" > West Bengal</option>                                
                  
   	
	</select>
  
  <br /><br />
  <div id="getcollegenames" style="display: none;">
	<div class="formnames">Institute Name: </div>
	
	    <select name="gradcollege"  id="gradcollege" class="require" style="width: 230px;">
	    </select>
	</div>
	

	
	
	
	
&nbsp;&nbsp;   <br /><br />

<div class="formnames">Current Semister:  </div><select name="gradaggregate">
<option value="">Select</option>
     
	  <option value="1"> 1 </option>
	
	  <option value="2"> 2 </option>
	
	  <option value="3"> 3 </option>
	
	  <option value="4"> 4 </option>
	
	  <option value="5"> 5 </option>
	
	  <option value="6"> 6 </option>
	
	  <option value="7"> 7 </option>
	
	  <option value="8"> 8 </option>
	
	  <option value="9"> 9 </option>
	
	  <option value="10"> 10 </option>
	
 </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Year of Passing: <select name="gradgraduation"><option value="">Select</option>
  
    <option value="2008">2008</option>
  
    <option value="2009">2009</option>
  
    <option value="2010">2010</option>
  
    <option value="2011">2011</option>
  
    <option value="2012">2012</option>
  
    <option value="2013">2013</option>
  
    <option value="2014">2014</option>
  
    <option value="2015">2015</option>
  
    <option value="2016">2016</option>
  
    <option value="2017">2017</option>
  
    <option value="2018">2018</option>
  
 </select><br/><br/>
 
 <div class="formnames">Stream Name: </div>

    <select name="gradstream" class="require" style="width: 230px;">
     <option value="">--Select Stream--</option>
	    
					<option value="1" > CIVIL ENGINEERING</option>                                
                  
					<option value="2" > COMPUTER SCIENCE AND ENGINEERING</option>                                
                  
					<option value="3" > ELECTRICAL ENGINEERING</option>                                
                  
					<option value="4" > ELECTRONICS & COMMUNICATION ENGG</option>                                
                  
					<option value="5" > INFORMATION TECHNOLOGY</option>                                
                  
					<option value="6" > MECHANICAL ENGINEERING</option>                                
                  
					<option value="7" > APPLIED ELECTRONICS AND INSTRUMENTATION ENGINEERING</option>                                
                  
					<option value="8" > TEXTILE TECHNOLOGY</option>                                
                  
					<option value="9" > LEATHER TECHNOLOGY</option>                                
                  
					<option value="10" > CERAMIC ENGINEERING AND TECHNOLOGY</option>                                
                  
					<option value="11" > BIOTECHNOLOGY</option>                                
                  
					<option value="12" > MCA</option>                                
                  
					<option value="13" > BCA</option>                                
                  
					<option value="14" > COMPUTER SCIENCE HONOURS (DEGREE COURSE)</option>                                
                  
   	
	</select>
 
<br /><br />
<div>Have you done any program with Globsyn before?  <input id="ya" name="otherprogram" onclick="openOtherPro('Yes');" value="Yes" type="radio" />
                          <label for="ya">Yes</label> &nbsp;&nbsp;
                        <input name="otherprogram" id="nope" onclick="openOtherPro('No');" value="No" type="radio"  />
                        <label for="nope">No&nbsp;</label>&nbsp;&nbsp;&nbsp;</div><br />
<div id="openother" style="display:none;"> 
<div class="formnames">Form no / Student ID:</div><input type="text" class="input" maxlength="30" name="programname" value='' /><br /><br />
</div>

<!--<div>Do you want to avail Transportation Service?&nbsp; <input name="bus" value="yes" type="radio">Yes&nbsp;&nbsp;
				  <input name="bus" value="no"  type="radio">No
</div><br />-->
<div>How did you come to know about us ?  <select name="refered"><option value="">--Select--</option>
		   
		     
		     
                    <option value="WBUT AD">WBUT AD</option>	                                	 
	            
                    <option value="Banner/Poster">Banner/Poster</option>	                                	 
	            
                    <option value="College Notice Board">College Notice Board</option>	                                	 
	            
                    <option value="Word of Mouth">Word of Mouth</option>	                                	 
	            
                    <option value="Training &Placement Cell">Training &Placement Cell</option>	                                	 
	            
                    <option value="TechnoCampus Newsletter">TechnoCampus Newsletter</option>	                                	 
	              						
</select>
</div><br />
<div id="refferedid">
<b>Details of the Reffered Person: <i>(optional)</i></b><br /><br />
<div class="formnames">Name: </div><input type="text" class="input" maxlength="30" name="referedname"  value='' />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;College: <input type="text" class="input" maxlength="60" name="referedcollege"  value='' /><br /><br />
<div class="formnames">Contact No: </div><input type="text" class="input" maxlength="10" name="referedcontactno"  value='' /><br /><br />
<!--
<div><input name="referedterms" value="1" type="checkbox">&nbsp;&nbsp; I Accept the terms & conditions for the referral scheme.</div>
-->
</div>

<div class="formnames"><b>Programs Offered: </b></div><br />
<div class="porgramselection">
             
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc0" name="selectcourse"   value="2, Application Development Using C# in .NET,Kolkata"  />&nbsp;<label for="sc0>" onclick="showcoursedetails('getdetails');"> Application Development Using C# in .NET</label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc1" name="selectcourse"   value="8, Mobile Application development in Android ,Kolkata"  />&nbsp;<label for="sc1>" onclick="showcoursedetails('getdetails');"> Mobile Application development in Android </label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc2" name="selectcourse"   value="3, Application Development using Java 7,Kolkata"  />&nbsp;<label for="sc2>" onclick="showcoursedetails('getdetails');"> Application Development using Java 7</label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc3" name="selectcourse"   value="1, Web Based Enterprise Application Development using JEE 6,Kolkata"  />&nbsp;<label for="sc3>" onclick="showcoursedetails('getdetails');"> Web Based Enterprise Application Development using JEE 6</label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc4" name="selectcourse"   value="6, Programming with PHP 5.0 and MySQL,Kolkata"  />&nbsp;<label for="sc4>" onclick="showcoursedetails('getdetails');"> Programming with PHP 5.0 and MySQL</label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc5" name="selectcourse"   value="4, Oracle 10 g PL/SQL Programming with Forms,Kolkata"  />&nbsp;<label for="sc5>" onclick="showcoursedetails('getdetails');"> Oracle 10 g PL/SQL Programming with Forms</label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc6" name="selectcourse"   value="7, Networking ,Kolkata"  />&nbsp;<label for="sc6>" onclick="showcoursedetails('getdetails');"> Networking </label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc7" name="selectcourse"   value="12, Micro-Controller Based Embedded Systems ,Kolkata"  />&nbsp;<label for="sc7>" onclick="showcoursedetails('getdetails');"> Micro-Controller Based Embedded Systems </label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc8" name="selectcourse"   value="13,IT Security ,Kolkata"  />&nbsp;<label for="sc8>" onclick="showcoursedetails('getdetails');">IT Security </label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc9" name="selectcourse"   value="18,MatLab ,Kolkata"  />&nbsp;<label for="sc9>" onclick="showcoursedetails('getdetails');">MatLab </label><br /> 
		 		 
		 		 
		 		            <input type="radio" onclick="showcoursedetails('getdetails');" id="sc10" name="selectcourse"   value="5, Programmable Logical Control (PLC) with Scada,Kolkata"  />&nbsp;<label for="sc10>" onclick="showcoursedetails('getdetails');"> Programmable Logical Control (PLC) with Scada</label><br /> 
		 		 
		 		  
   <!-- 
   <input type="radio" onclick="showcoursedetails('getdetails');" id="sc0" name="selectcourse" value="1, Web Based Enterprise Application Development using JEE, Kolkata" />&nbsp;<label for="sc0" onclick="showcoursedetails('getdetails');"> Web Based Enterprise Application Development using JEE</label><br /> 
    <input type="radio" onclick="showcoursedetails('getdetails');" id="sc1" name="selectcourse" value="2, Enterprise Development Using C# in .NET, Kolkata" />&nbsp;<label for="sc1" onclick="showcoursedetails('getdetails');"> Enterprise Development Using C# in .NET</label><br /> 
    <input type="radio" onclick="showcoursedetails('getdetails');" id="sc2" name="selectcourse" value="3, Application Development using Java 6, Kolkata" />&nbsp;<label for="sc2" onclick="showcoursedetails('getdetails');"> Application Development using Java 6</label><br /> 
    <input type="radio" onclick="showcoursedetails('getdetails');" id="sc3" name="selectcourse" value="4, Application development using Oracle 10g Forms, Kolkata" />&nbsp;<label for="sc3" onclick="showcoursedetails('getdetails');"> Application development using Oracle 10g Forms</label><br /> 
    <input type="radio" onclick="showcoursedetails('getdetails');" id="sc4" name="selectcourse" value="5, Programmable Logical Control (PLC) with Scada, Kolkata" />&nbsp;<label for="sc4" onclick="showcoursedetails('getdetails');"> Programmable Logical Control (PLC) with Scada</label><br /> 
    <input type="radio" onclick="showcoursedetails('getdetails');" id="sc5" name="selectcourse" value="6, Programming  with PHP, Kolkata" />&nbsp;<label for="sc5" onclick="showcoursedetails('getdetails');"> Programming  with PHP</label><br /> 
    <input type="radio" onclick="showcoursedetails('getdetails');" id="sc6" name="selectcourse" value="7, Networking , Kolkata" />&nbsp;<label for="sc6" onclick="showcoursedetails('getdetails');"> Networking </label><br />
    --> 
 </div>
<br />

<div id="getdetails" class="showdetails" style="display: none;"></div>

<div class="formnames">Verification Code: </div><input type="text" class="input" maxlength="10" name="verificationcode"  autocomplete="off"/><br />
<div><div class="formnames">&nbsp;</div><img src="../ysm/captchaimage.jsp" style="margin-top: 10px;border:1px solid black;" id="imgCaptcha"/>&nbsp;&nbsp;<img src="/images/refresh.png" width="28" height="28" border="0" alt="refresh code" style="cursor:pointer;" title="refresh code" id="imgRefresh" onclick="setTimeout('resetCaptcha()', 300); return false;"></div><br />

</div>




<div class="dddetails">
<div class="iagree"><input name="sms_true" value="1" type="checkbox"  /> I Agree that all communication will be sent to my mobile number. </div>
<div class="iagree"><input name="agree" value="1" type="checkbox"  /> I Agree that all the information in this application form is true, accurate and complete to the best of my knowledge. </div>
<p><b>BO clause-</b> We as a merchant shall be under no liability whatsoever in respect of any loss or damage arising directly or indirectly out of the decline of authorization for any Transaction, on Account of the Cardholder having exceeded the preset limit mutually agreed by us with our acquiring bank from time to time.</p>
</div>
<p><img src="images/pay.jpg" /></p>
<center><input type="submit" name="submit" class="button" value="Submit" onclick="return validateswform();" /></center>

</form>

<div id="formfoot">
	<h6>&copy; Copyright 2013-2014 Globsyn Skils. All Right Reserved</h6>
    <ul>
        <li><a href="javascript:void();" id="tncBtn">Terms and Conditions</a></li>
        <li>|</li>
        <li><a href="javascript:void();" id="crpBtn">Cancellation and refund Policy</a></li>
        <li>|</li>
        <li><a href="javascript:void();" id="ppBtn">Privacy Policy</a></li>
        <li>|</li>
        <li><a href="http://skillsforindia.com/contact.php" target="_blank">Contact Us</a></li>
    </ul>
</div>
<div class="fl black" id="tnc">
    <p><strong>TERMS & CONDITIONS</strong></p>
    <p>This agreement represents the complete agreement and understanding between Globsyn Skills and the Registered Users and supersedes any other written or oral agreement. Globsyn Skillsmay modify these terms and conditions, amplify them, and/or modify the prices, as well as discontinue or change services offered with or without prior notification.</p>
	<p>If you do not agree to these terms and conditions, please notify our Billing Department (info@globsynskills.com) so we can initiate a closure of your account. USE OF YOUR ACCOUNT shall constitute your approval. We reserve the right to refuse service to anyone.</p>
	<p>1. Globsyn Skillsmakes no warranties of any kind, whether expressed or implied, for the service it is providing. Globsyn Skillsalso disclaims any warranty of merchantability or fitness for a particular purpose. Globsyn Skillswill not be responsible for damages the customer suffers. This includes loss of data resulting from delays, non-deliveries, miss deliveries, or service interruptions caused by its own negligence, subscriber's errors or omissions, or due to the fault of third parties.</p>
	<p>2. Users agree to defend, hold harmless and expeditiously indemnify Globsyn Skillsfrom any liability, claim, loss, damage or expense arising out of the indemnifying party's breach or violation of any covenant contained in this Policy and resulting from the Customer's use of the service.</p>
	<p>3. Globsyn Skillsreserves the right to cancel service for any reason without prior notice. In this, unused fees may be returned to the subscriber on a pro-rated basis.</p>
</div>

<div class="fl black" id="crp">
    <p><strong>CANCELLATION AND REFUND POLICY</strong></p>
    <p><strong>CANCELLATION</strong></p>
	<p>You must notify Globsyn Skills formally by calling us at <strong>+91 33 6543 0005</strong> or write us at <strong><a href="mailto:gfs@globsyn.com">gfs@globsyn.com</a></strong> in order to cancel your account with us. NOTE: We will NOT process any other requests submitted outside the mentioned step herein. A Rs. 1000.00 re-activation fee will apply to all suspended users due to non-payments of due fees. There will be a Rs. 1000.00 reinstating fee for any cancelled account.</p>
	<p>You must notify Globsyn Skills formally to cancel your account with Globsyn Skills to avoid further charges.</p>
    <p><strong>REFUND</strong></p>
    <p>Within the 5 days as a Globsyn Skills customer, if for any reason you are not completely satisfied with our services, we will cancel your account and refund your money. After 5 days, you can opt out to cancel your account, and regardless of your commitment. There is no refund after 5 days of registration.</p>
</div>

<div class="fl black" id="pp">
    <p><strong>PRIVACY POLICY</strong></p>
    <p>Information Collection and Use</p>
	<p>Entire contents Copyright Â© 2013-2014 Globsyn Skills. All rights reserved.</p>
	<p>Globsyn Skills is the sole owner of the information collected on this site. We will not sell, share, or rent this information to others in ways different from what is disclosed in this statement. Globsyn Skills collects information from our users at several different points on our web site. We may use the information we collect from you when you register, make a purchase, sign up for our newsletter, respond to a survey or marketing communication, surf the website, or use certain other site features in the following ways: (1) To personalize your site experience and to allow us to deliver the type of content and product offerings in which you are most interested; (2) To allow us to better service you in responding to your customer service requests; (3) To quickly process your transactions; (4) To administer a contest, promotion, survey or other site feature.</p>
	<p>Globsyn Skills may email its monthly newsletter to the primary contact email on file, but customers are able to opt out of the newsletter at any time by contacting our support or by clicking the Unsubscribe button in the newsletter itself. Globsyn Skills may also occasionally send emails covering recent changes, company news, promotions or any additional guides in attempt to improve its services.</p>
	<p>Protection</p>
	<p>This web site takes every precaution to protect our users' information. When users submit sensitive information via the web site, your information is protected both online and off-line.</p>
	<p>Furthermore, ALL employees are kept up-to-date on our security and privacy practices. Every quarter, as well as any time new policies is added, our employees are notified and/or reminded about the importance we place on privacy, and what they can do to ensure our customers' information is protected.</p>
</div>

</div>



</body>
</html>
