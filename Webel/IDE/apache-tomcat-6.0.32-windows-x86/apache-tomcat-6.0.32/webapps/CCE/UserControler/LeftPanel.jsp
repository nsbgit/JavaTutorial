<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="leftside">
					<div class="profileimage">
					<s:iterator value="userDetailsList" >	
						<s:if test="(sixVal != null || !sixVal.equals(''))">			
							<s:hidden value="%{firstVal}" name="employeeImage"></s:hidden><img id="userimage"  alt=""  src="../Upload/Employee/<s:property value="sixVal"/>"/>
						</s:if>
						<s:else>
							<s:hidden value="%{firstVal}" name="employeeImage"></s:hidden><img id="userimage"  alt=""  src="../images/image.jpg"/>
						</s:else>					
					</s:iterator>						
						<div class="imagetext"><span>&nbsp;</span><s:a action="../Common/editEmployeeImage" >Edit</s:a></div></div>
					<div class="leftnav">
						<div class="arrowlistmenu">						
                             <s:set name="flag" value="false"/>
                         <s:set name="menuHead" value="null"/>                              
                         <s:iterator  value="menuList" >                           
                                                                                                                         
                         		<s:if test="#menuHead!=firstVal">
                         		</ul>
                         			      
                         			<h3 class="menuheader expandable"><s:property value="firstVal" />   </h3> 
                         			<s:if test="#flag=='false'">
                         				
                         			</s:if>
                         	          <ul class="categoryitems"> 
                         	          <li><a href="<s:property value="thredVal" />"><s:property value="secondVal" /> </a></li>
                         	          <s:set name="flag" value="false"/>
                         		</s:if>
                         		<s:else>
                         			 <li><a href="<s:property value="thredVal" />"><s:property value="secondVal" /> </a></li>
                         			 <s:set name="flag" value="true"/>
                         		</s:else> 
                         		<s:set name="menuHead" value="firstVal"/> 
                         	            	    
                         </s:iterator>      		  		
					   
						</div>
					</div>
					</div>