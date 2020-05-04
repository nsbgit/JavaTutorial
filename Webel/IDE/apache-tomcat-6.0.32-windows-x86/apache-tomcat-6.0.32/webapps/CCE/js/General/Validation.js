﻿﻿﻿﻿﻿﻿﻿﻿
function validateDecimal(ctrlID)//fun 1
{

    var varValue = document.getElementById(ctrlID).value;
    if (isNaN(varValue)) {
        //alert("Enter numeric data");
        
        return false;
    }
    else if (varValue == 0.00) {
        document.getElementById(ctrlID).value = 0; document.getElementById(ctrlID).focus();
        return false;
    }
    else {
        var arrParts = varValue.split('.');
        if (arrParts.length > 1) {
            if (arrParts[1].length < 1) {
                varValue = arrParts[0];
            }
        }
       // document.getElementById(ctrlID).value = format_number(varValue, 2);
        return true;
    }
    
}

//Allow only numeric/integer
function validateListBoxSelectionCount(listbox) {
    
    var selected = 0;
    if (listbox != null) {
        for (var i = 0; i < listbox.length; i++) {
            if (listbox.options[i].selected) {
                selected++;
             }
            
           }
        if (selected > 0) {
            return true;
           
        }
    }
    return false;
   
} 

function isNumberKey(evt) {
    var charCode = (evt.which) ? evt.which : event.keyCode
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;

    return true;
}
function selectDropdownList(sender, args) {
    if (args.Value == 0)
        args.IsValid = false;
    else
        args.IsValid = true;
}
function selectComputelist(sender, args) {
    var e = document.getElementById("ddlCalType");
    if (e.options[e.selectedIndex].value == 1) {
        if (args.Value == 0)
            args.IsValid = false;
        else
            args.IsValid = true;
    }
    else {
        args.IsValid = true;
    }


}
function custtxtFlatValueOperation(sender, args) {
    var ddlCalType = document.getElementById("ddlCalType");
    if (ddlCalType.options[ddlCalType.selectedIndex].value == 3) {
        if (!validateDecimal("txtFlatValue")) {
            args.IsValid = false;
        }
    }

}
function custVisualBasicOperation(sender, args) {
    
    var ddlCalType = document.getElementById("ddlCalType");
    var ddlCompute = document.getElementById("ddlCompute");
     if (ddlCalType.options[ddlCalType.selectedIndex].value == 1) {
        if (ddlCompute.options[ddlCompute.selectedIndex].value == 1) {
            if (args.Value == "") {
                args.IsValid = false;
            }
            else if (!validateDecimal("txtValueBasis")) {
                args.IsValid = false;
            }

        }
    }

}
function custlistboxSpecifiedFormulaOperation(sender, args) {
    var ddlCalType = document.getElementById("ddlCalType");
    var ddlCompute = document.getElementById("ddlCompute");
    var listboxSpecifiedFormula = document.getElementById("listboxSpecifiedFormula");
    if (ddlCalType.options[ddlCalType.selectedIndex].value == 1) {
        if (ddlCompute.options[ddlCompute.selectedIndex].value == 1) {
            if (!validateListBoxSelectionCount(listboxSpecifiedFormula)) {
                args.IsValid = false;
            }
           
        }
    }
}
function OpenPopup(title, id) {

    window.open("DetailsView.aspx?id=" + id + "", ""+title+" Details", "menubar=1,resizable=1,width=350,height=250");
}
function confirm_delete() {
    msg = 'Are you sure to delete this record?';
    if (confirm(msg))
        return true;
    else
        return false;
}

function disableFun(chkId, txtId) {
    document.getElementById(txtId).value = '0';
    if (document.getElementById(chkId).checked == true) {
        document.getElementById(txtId).disabled = false;
    }
    else {
        document.getElementById(txtId).disabled = true;
    }
}
function blank(iid) {
    if (document.getElementById(iid).value == '0.00' || document.getElementById(iid).value=='0')
        document.getElementById(iid).value = '';
}
function fill(iid) {
    if (document.getElementById(iid).value == '')
        document.getElementById(iid).value = '0.00';
}
function fillWithoutDecimal(iid) {
    if (document.getElementById(iid).value == '')
        document.getElementById(iid).value = '0';
}
function checkRange() {
    if (document.getElementById("chkCL").checked) {
         var maxvalCL = 0;
        var applyvalueCL = 0;
        if (document.getElementById("lblCL") != null) {
            maxvalCL = document.getElementById("lblCL").firstChild.data;
        }
        if (document.getElementById("txtCl") != null) {
            applyvalueCL = document.getElementById("txtCl").value;
        }
        if (parseInt(maxvalCL) < parseInt(applyvalueCL)) {
            alert("Exceed frpm the maximum available CL");
            document.getElementById("txtCl").value = "0";
            return;
        }
    }
    if (document.getElementById("chkPL").checked) {
         var maxvalPL = 0;
         var applyvaluePL = 0;
        if (document.getElementById("lblPL") != null) {
            maxvalPL = document.getElementById("lblPL").firstChild.data;
        }
        if (document.getElementById("txtPL") != null) {
            applyvaluePL = document.getElementById("txtPL").value;
        }
        if (parseInt(maxvalPL) < parseInt(applyvaluePL)) {
            alert("Exceed from the maximum available PL");
            document.getElementById("txtPL").value = "0";
            return;
        }
    }

}
function link(url) {    
    window.location.href = url;
}
function delConfirm()
{
	var answer = window.confirm("Delete this record?");  
    if(answer) 
        return true;  
    else return false;
}

function displayWait(txtContent) {
    if (!txtContent) {
        txtContent = "Please wait...";
    }
    txtContent = "/images/ajax-loader.gif\" alt=\"\" /> " + txtContent;
    var thisdialog = new dijit.Dialog({ title: "", content: txtContent });
    dojo.body().appendChild(thisdialog.domNode);
    //thisdialog.closeButtonNode.style.display='none';
    thisdialog.titleBar.style.display='none';
    thisdialog.startup();
    thisdialog.show();
}

function loadNewValue(sourceID,distID,URL) {
	
	 //var dialog=displayWait('');
	
	if(sourceID !='' ){    	
		var targetNode = dojo.byId(distID);
        var xhrArgs = {
            url: URL,
            handleAs: "text",
            preventCache: true,
            load: function(data){
                targetNode.innerHTML =data; 
                //dialog.hide();              
            },
            content: {                    
            	sourceID:sourceID                	
            },
            error: function(error, ioargs,response) {
                var message = "";
                switch (ioargs.xhr.status) {
                    case 404:
                    message = "The requested page was not found";
                    break;
                    case 500:
                    message = "The server reported an error.";
                    break;
                    case 407:
                    message = "You need to authenticate with a proxy.";
                    break;
                    default:
                    message = "Unknown error.";
                }
                targetNode.innerHTML = message;
                //dialog.hide();
            }
        }
        //dialog.show();
        var deferred = dojo.xhrPost(xhrArgs);
    }

}
function loadNewValueFor2(sourceID,sourceID1,distID,URL) {
	
	 //var dialog=displayWait('');	
	if(sourceID !='' && sourceID1 !='' ){  		
		var targetNode = dojo.byId(distID);		
       var xhrArgs = {
           url: URL,
           handleAs: "text",
           preventCache: true,
           load: function(data){
               targetNode.innerHTML =data; 
               //dialog.hide();              
           },
           content: {                    
           	sourceID:sourceID,
        	sourceID1:sourceID1
           },
           error: function(error, ioargs,response) {
               var message = "";
               switch (ioargs.xhr.status) {
                   case 404:
                   message = "The requested page was not found";
                   break;
                   case 500:
                   message = "The server reported an error.";
                   break;
                   case 407:
                   message = "You need to authenticate with a proxy.";
                   break;
                   default:
                   message = "Unknown error.";
               }
               targetNode.innerHTML = message;
               //dialog.hide();
           }
       }
       //dialog.show();
       var deferred = dojo.xhrPost(xhrArgs);
   }

}
function loadNewValueFor4(sourceID,sourceID1,sourceID2,distID,URL) {
	
	 //var dialog=displayWait('');	
	if(sourceID !='' && sourceID1 !='' ){  		
		var targetNode = dojo.byId(distID);		
      var xhrArgs = {
          url: URL,
          handleAs: "text",
          preventCache: true,
          load: function(data){
              targetNode.innerHTML =data; 
              //dialog.hide();              
          },
          content: {                    
          	sourceID:sourceID,
          	sourceID1:sourceID1,
        	sourceID2:sourceID2
          },
          error: function(error, ioargs,response) {
              var message = "";
              switch (ioargs.xhr.status) {
                  case 404:
                  message = "The requested page was not found";
                  break;
                  case 500:
                  message = "The server reported an error.";
                  break;
                  case 407:
                  message = "You need to authenticate with a proxy.";
                  break;
                  default:
                  message = "Unknown error.";
              }
              targetNode.innerHTML = message;
              //dialog.hide();
          }
      }
      //dialog.show();
      var deferred = dojo.xhrPost(xhrArgs);
  }

}
function loadNewValueFor3(sourceID,sourceID1,sourceID2,sourceID3,sourceID4,distID,URL) {
	
	 //var dialog=displayWait('');
	
	if(sourceID !='' && sourceID1 !='' ){    	
		var targetNode = dojo.byId(distID);
      var xhrArgs = {
          url: URL,
          handleAs: "text",
          preventCache: true,
          load: function(data){
              targetNode.innerHTML =data; 
              //dialog.hide();              
          },
          content: {                    
          	sourceID:sourceID,
          	sourceID1:sourceID1,
       		sourceID2:sourceID2,
       		sourceID3:sourceID3,
       		sourceID4:sourceID4
          },
          error: function(error, ioargs,response) {
              var message = "";
              switch (ioargs.xhr.status) {
                  case 404:
                  message = "The requested page was not found";
                  break;
                  case 500:
                  message = "The server reported an error.";
                  break;
                  case 407:
                  message = "You need to authenticate with a proxy.";
                  break;
                  default:
                  message = "Unknown error.";
              }
              targetNode.innerHTML = message;
              //dialog.hide();
          }
      }
      //dialog.show();
      var deferred = dojo.xhrPost(xhrArgs);
  }

}
function searchingBlank(iid){
	 if (document.getElementById(iid).value == 'Enter Searching Keyword Here'){
		 document.getElementById(iid).className='textbox';
	        document.getElementById(iid).value = '';
	 }
}
function searchingFill(iid){
	 if (document.getElementById(iid).value == ''){		
			document.getElementById(iid).className='fed';
	        document.getElementById(iid).value = 'Enter Searching Keyword Here';
	 }
}
function ValidateNumber(field, evt)
{	
    var charCode = (evt.which) ? evt.which : event.keyCode
    var keychar = String.fromCharCode(charCode);    
    if (charCode > 31 && (charCode < 48 || charCode > 57) && keychar != "."  && keychar != "-" )
    {
        return false;
    }

    if (keychar == "." && field.value.indexOf(".") != -1) 
    {
        return false;
    }
        
    if(keychar == "-")
    {
        if (field.value.indexOf("-") != -1 /* || field.value[0] == "-" */) 
        {
            return false;
        }
        else
        {
            //save caret position
            var caretPos = getCaretPosition(field);
            if(caretPos != 0)
            {
                return false;
            }
        }
    }
    function validChkForSearch(iid){
		if(document.getElementById(iid).value=='Enter Searching Keyword Here')
			return false;
	}   

    return true;
}





function checkEmail(email) {
	if(email.value!=''){
	var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
	if (!filter.test(email.value)) {
		alert('Please provide a valid email address');
		email.focus();
		return false;
		}
	}
}
function isAlphaNumeric(e)
{	
   var k;   
   document.all ? k=e.keycode : k=e.which;
   return((k>47 && k<58)||(k>64 && k<91)||(k>96 && k<123)||k==0 || k==8) ;
}

function WindowPrint(iid){
	document.getElementById(iid).style.visibility="hidden";
	window.print();
	document.getElementById(iid).style.visibility="visible";
}
	
function getSelectText(getId,setId){	
	document.getElementById(getId).value=document.getElementById(setId).options[document.getElementById(setId).selectedIndex].text;
}

function extractNumber(obj, decimalPlaces, allowNegative)
{
	var temp = obj.value;
	
	// avoid changing things if already formatted correctly
	var reg0Str = '[0-9]*';
	if (decimalPlaces > 0) {
		reg0Str += '\\.?[0-9]{0,' + decimalPlaces + '}';
	} else if (decimalPlaces < 0) {
		reg0Str += '\\.?[0-9]*';
	}
	reg0Str = allowNegative ? '^-?' + reg0Str : '^' + reg0Str;
	reg0Str = reg0Str + '$';
	var reg0 = new RegExp(reg0Str);
	if (reg0.test(temp)) return true;

	// first replace all non numbers
	var reg1Str = '[^0-9' + (decimalPlaces != 0 ? '.' : '') + (allowNegative ? '-' : '') + ']';
	var reg1 = new RegExp(reg1Str, 'g');
	temp = temp.replace(reg1, '');

	if (allowNegative) {
		// replace extra negative
		var hasNegative = temp.length > 0 && temp.charAt(0) == '-';
		var reg2 = /-/g;
		temp = temp.replace(reg2, '');
		if (hasNegative) temp = '-' + temp;
	}
	
	if (decimalPlaces != 0) {
		var reg3 = /\./g;
		var reg3Array = reg3.exec(temp);
		if (reg3Array != null) {
			// keep only first occurrence of .
			//  and the number of places specified by decimalPlaces or the entire string if decimalPlaces < 0
			var reg3Right = temp.substring(reg3Array.index + reg3Array[0].length);
			reg3Right = reg3Right.replace(reg3, '');
			reg3Right = decimalPlaces > 0 ? reg3Right.substring(0, decimalPlaces) : reg3Right;
			temp = temp.substring(0,reg3Array.index) + '.' + reg3Right;
		}
	}
	
	obj.value = temp;
}
function blockNonNumbers(obj, e, allowDecimal, allowNegative)
{
	var key;
	var isCtrl = false;
	var keychar;
	var reg;
		
	if(window.event) {
		key = e.keyCode;
		isCtrl = window.event.ctrlKey
	}
	else if(e.which) {
		key = e.which;
		isCtrl = e.ctrlKey;
	}
	
	if (isNaN(key)) return true;
	
	keychar = String.fromCharCode(key);
	
	// check for backspace or delete, or if Ctrl was pressed
	if (key == 8 || isCtrl)
	{
		return true;
	}

	reg = /\d/;
	var isFirstN = allowNegative ? keychar == '-' && obj.value.indexOf('-') == -1 : false;
	var isFirstD = allowDecimal ? keychar == '.' && obj.value.indexOf('.') == -1 : false;
	
	return isFirstN || isFirstD || reg.test(keychar);
}
function disableEnable(iid,disId){
	//alert(iid.value);
	if(iid.value=='1' || iid.value==''){
		document.getElementById(disId).disabled=true;
		document.getElementById(disId).value='0';
	}
	else{
		document.getElementById(disId).disabled=false;
	}
}
function couter(iid,value){		
	var a=iid.options;
	var c=0;
	for(var i=0;i<iid.options.length;i++){
		if(iid.options[i].selected){
			c++;			
		}		
	}
	if(c>value){				
		for(var i=0;i<iid.options.length;i++){
			if(iid.options[i].selected){
				if(value<c){
					iid.options[i].selected=false;						
				}
				c--;
			}
		}						
	}
}
function check(iid,value){		
	var a=iid.options;
	var c=0;
	var posistion;
	var unselectPos;
	for(var i=0;i<iid.options.length;i++){		
		if(iid.options[i].selected){			
			c++;
			posistion=i;
		}
		else{
			unselectPos=i;
		}				
	}
	if(c<value){				
		if(posistion==(i-1))
			posistion=unselectPos;
		else
			posistion++;
		iid.options[posistion].selected=true;		
	}	
}
function Clear(iid){	
	var a=document.getElementById(iid).options;
	var c=0;	
	for(var i=0;i<a.length;i++){
		if(a[i].selected){
			a[i].selected=false;
		}		
	}	
}

function marksChk(marks,totMarks){
	if(marks.value !=''){
		if(parseInt(marks.value)>parseInt(totMarks)){			
			alert(marks.value+' Greater Then  '+totMarks);
			marks.value=totMarks;
			marks.focus();			
		}		
	}
	else{
		marks.value='0';
	}		
}
function clearFun(objVal){		
	if(objVal.value=='0')
		objVal.value='';
}