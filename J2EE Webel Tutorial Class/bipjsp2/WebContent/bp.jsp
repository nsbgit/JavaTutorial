<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">

	function validation()
	{
		if(document.getElementById("namej").value=="")
		{
			alert("please enter name:");
			document.getElementById("namej").focus();
			return false;
		}
		if(document.getElementById("addj").value=="")
		{
			alert("please enter address");
		document.getElementById("addj").focus();
			return false;
		}
		if(document.getElementById("gen").checked==false &&document.getElementById("gen1").checked==false) 
	    {
		alert("please enter gender");
			document.getElementById("addj").focus();
			return false;
	    }
		if(document.getElementById("selectj").value=="")
		{
			alert("please enter standard");
			document.getElementById("selectj").focus();
		}
		
	}

</script>
<style type="text/css">
.lbl{
	font-family:"Times New Roman", Times, serif;
	font-weight:bold;
	color:#C6F;
	}
.header
{
	color:#C00;
	background-color:#CF3;
	font-size:25px;
}
.body{
	background-color:#FCF;
}
.box
{

background-color:#FF6;
}
.div{
	background-color:#FCC;
}
.btn{
	background-color:#3FC;
	color:#C03;
	fond-weight=bold";
	font-size:20px;
	border-image-outset:#0FF;
}
</style>
</head>

<body class="body">
<form action="<%= request.getContextPath() %>/Myfirst.do" method="post">
<div class="div">
<table width="400px" align="center" cellpadding="0" class="box" >
<tr><th colspan="2" class="header">Student Registration</th></tr>

 
  <tr>
    <td width=50% class="lbl">Name</td>
    <td><input type="text" name="names" id="namej"/></td>
  </tr>
  <tr>
    <td width=50% class="lbl">Address</td>
    <td><textarea rows="4" cols="20" name="adds" id="addj"></textarea></td>
  </tr>
  <tr>
    <td width=50% class="lbl">Gender</td>
    <td><input type="radio" value="m" name="gen" id="gen" />MALE
         <input type="radio" value="f" name="gen" id="gen1"/>FEMALE
     </td>
  </tr>
  <tr>
    <td width=50% class="lbl">Standard</td>
    <td><select name="selects" id="selectj">
    <option value="">select</option>
     <option value="s1">standard1</option>
      <option value="s2">standard2</option>
      </select></td>
  </tr>
  <tr><th colspan="2" ><input type="submit"class="btn" name="submit" id="submit" value="save" onclick="return validation()"/>
  <input type="reset"class="btn" name="submit" id="submit" value="reset" onclick="return validation()" /></th></tr>
</table>
</div>
</form>
</body>
</html>