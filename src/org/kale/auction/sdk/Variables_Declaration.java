package org.kale.auction.sdk;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Variables_Declaration 
{
	 public int i=0;
	
	 public String folderpath,s,ExcelSavePath;
	 public long second = 1000l;
	 public long minute = 60l * second;
	 public long hour = 60l * minute;
	 public long diff;
	 public SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
	 public  String currentdate = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
	
	 /**
	  * @category Variables of Validate_Elements Class
	  */
	 
	public String StartTime, EndTime, ScreenShotName, ScreenShotPath, ExptResult, ActResult_FALSE, ChkType, Element, ActResult_TRUE,
	Status, ActResult, Duration, Statement_end_word, ActualResult, SC_ID,Description,Id, ExpectedResult, ActualResultTrue,
	ActualResultFalse, filename;
	public int Srno=1,r=1;
		
	/**
	 * @category   Variables of LineNoDetails Page
	 */
	
	public String username_cfs,password_cfs,username_custom,password_custom,IGM_No,IGM_Date,Arrival_Date,Line_No_Status,Line_No,Sub_Line_No,MBL_No,HBL_No,Vessel_Name,Load_Type,BOE_No,
	BOE_Date,ShippingLine_Name,Cargo_Description,Cargo_Commodity,Crgo_Type,Importer_Name,Address_Line1,Address_Line2,
	Address_Line3,Cargo_Status,Gross_Wt,Pkg_Count,Container_No,Container_Size,Container_Arrival_Date,Save_Message,Container_alertMsg,Detain_alertMsg;; 
	public boolean Enable_ContainerNo,Detain,QuickSearch;
	
	/**
	 * @category   WebElements of LineNoDetails Page
	 */
	
	public WebElement WebEle_IGM_No, 
	WebEle_IGM_Date, WebEle_Arrival_Date, WebEle_Line_No_Status, WebEle_Line_No, WebEle_Sub_Line_No, 
	WebEle_MBL_No, WebEle_HBL_No, WebEle_Vessel_Name, WebEle_Load_Type, WebEle_BOE_No, WebEle_BOE_Date,	WebEle_ShippingLine_Name,
	WebEle_Cargo_Description, WebEle_Cargo_Commodity, WebEle_Crgo_Type, WebEle_Importer_Name, WebEle_Address_Line1,
	WebEle_Address_Line2, WebEle_Address_Line3, WebEle_Cargo_Status,	WebEle_Gross_Wt, WebEle_Pkg_Count, WebEle_Container_No,
	WebEle_Container_Size, WebEle_Container_Arrival_Date,WebEle_Abandon_CheckBox;

	/**
	 * @category Variables for Custom Login
	 */	
	public boolean Detain_dropdown,IGM_NO_TextBox;
	
	/**
	 * @category Variables for Group Login
	 */
	public String username_group,password_group;
	
	/**
	 * @category Variables for CFS Login & NOC1 page
	 */
	public WebElement Choose_file,WESent_Date,WEFile_Name,WERemarks,WEImporter_Reply_Date,WEImporter_remark;
	public String Notice1_UploadFilePath,Sent_Date,File_Name,Remarks,Importer_Reply_Date,Importer_remark,trial_Sent_Date,NOC1_Alert_Message;
	public boolean FileName;
	
	/**
	 * @category Variables for CFS Login & NOC2 page
	 */
	public WebElement N2_Choose_file,N2_WESent_Date,N2_WEFile_Name,N2_WERemarks,N2_WEImporter_Reply_Date,N2_WEImporter_remark;
	public String N2_UploadFilePath,N2_Sent_Date,N2_File_Name,N2_Remarks,N2_Importer_Reply_Date,N2_Importer_remark,N2_trial_Sent_Date;
	public boolean N2_FileName;
	
	/**
	 * @category Variables for NOC page
	 */
	public boolean WebElement_PreAbs;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
