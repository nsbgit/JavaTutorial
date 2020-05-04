/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.academica.controller;

import com.academica.dao.DBConnect;
import com.academica.dao.ReadSql;
import com.consultancy.logic.AssetLogic;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author AIMPL
 */
public class uploadAsset extends HttpServlet {
    final int UPLOAD_SERVICE_FILE=1;
    final int UPLOAD_ASSET_ATTACH=2;
   
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        int link=Integer.parseInt(request.getParameter("link"));
        int res=0;
        switch(link){

            case UPLOAD_SERVICE_FILE:

        try
        {
            PrintWriter out = response.getWriter();
            Date d=new Date();
            SimpleDateFormat sys=new SimpleDateFormat("ddMMyyyyhhmmss");
            String id=sys.format(d);
            String code=request.getParameter("code");
            String serviceId=request.getParameter("serviceId");
            String assetNo=request.getParameter("assetNo");
            String file_name=code+id;
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload1 = new ServletFileUpload(factory);
            List items = null;
            String finalimage="";
             if(false)
             {

             }
             else
             {
             boolean isMultipart = ServletFileUpload.isMultipartContent(request);
             if(!isMultipart)
             {

             }
             else
             {
             try
                {
                    items = upload1.parseRequest(request);

                }
                catch (FileUploadException e)
                {
                    e.printStackTrace();
                }
                Iterator itr = items.iterator();
                while (itr.hasNext())
                {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField())
                    {
                        String name = item.getFieldName();


                     }
                    else
                    {
                        //try
                        //{
                            String itemName = item.getName();
                            String reg = "[.*]";
                            String replacingtext = "";

                            Pattern pattern = Pattern.compile(reg);
                            Matcher matcher = pattern.matcher(itemName);
                            StringBuffer buffer = new StringBuffer();

                            while (matcher.find())
                            {
                                matcher.appendReplacement(buffer, replacingtext);
                            }
                            int IndexOf = itemName.indexOf(".");
                            String domainName = itemName.substring(IndexOf);
                            String filePath = getServletContext().getRealPath("/");
                            finalimage =file_name+domainName;
                            File savedFile = new File(filePath+"/upload/Asset/"+finalimage);
                        try
                        {
                            item.write(savedFile);
                            /*Connection con=DBConnect.getConnect();
                            PreparedStatement ps;
                            try{
                                String sql=ReadSql.read(reg);
                            }catch(Exception e){
                                e.toString();
                            }*/
                            AssetLogic al=new AssetLogic();
                            res=al.insertServiceAttach(finalimage,code,id,itemName,serviceId);
                            response.sendRedirect("Asset/servicFileAttach.jsp?accCode="+code+"&assetNo="+assetNo+"&serviceId="+serviceId);
                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                }
             }
             }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        break;

            case UPLOAD_ASSET_ATTACH:
        try
        {
            PrintWriter out = response.getWriter();
            String acc_code=request.getParameter("acc_code");
            String sysDate=request.getParameter("sysDate");
            String assetno=request.getParameter("assetNo");
            String file_name=acc_code+sysDate;
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload1 = new ServletFileUpload(factory);
            List items = null;
            String finalimage="";
             if(false)
             {

             }
             else
             {
             boolean isMultipart = ServletFileUpload.isMultipartContent(request);
             if(!isMultipart)
             {

             }
             else
             {
             try
                {
                    items = upload1.parseRequest(request);

                }
                catch (FileUploadException e)
                {
                    e.printStackTrace();
                }
                Iterator itr = items.iterator();
                while (itr.hasNext())
                {
                    FileItem item = (FileItem) itr.next();
                    if (item.isFormField())
                    {
                        String name = item.getFieldName();


                     }
                    else
                    {
                        //try
                        //{
                            String itemName = item.getName();
                            String reg = "[.*]";
                            String replacingtext = "";

                            Pattern pattern = Pattern.compile(reg);
                            Matcher matcher = pattern.matcher(itemName);
                            StringBuffer buffer = new StringBuffer();

                            while (matcher.find())
                            {
                                matcher.appendReplacement(buffer, replacingtext);
                            }
                            int IndexOf = itemName.indexOf(".");
                            String domainName = itemName.substring(IndexOf);
                            String filePath = getServletContext().getRealPath("/");
                            finalimage =file_name+domainName;
                            File savedFile = new File(filePath+"/upload/Asset/"+finalimage);
                        try
                        {
                            item.write(savedFile);
                            AssetLogic al=new AssetLogic();
                            res=al.insertAssetAttach(acc_code,sysDate,finalimage,itemName,assetno);
                            response.sendRedirect("Asset/assetEdit_attachment.jsp?accCode="+acc_code+"&assetNo="+assetno);
                        }
                        catch (Exception ex)
                        {
                            ex.printStackTrace();
                        }

                    }
                }
             }
             }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        break;
    }
   }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
