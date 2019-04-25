package org.kale.auction.Test_Cases_Modules;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.kale.auction.TestDataReaders.ExcelFileReader;
import org.kale.auction.TestDataReaders.PropertiesFileReader;
import org.kale.auction.TestDataReaders.TestDataCollection;
import org.kale.auction.TestDataReaders.TestDataReader;
import org.kale.auction.TestDataReaders.TestDataReaderFactory;
import org.kale.auction.pages.LineNoDetails_Page;
import org.kale.auction.pages.LoginPage;
import org.kale.auction.pages.NOC_1_Page;
import org.kale.auction.pages.NOC_2_Page;
import org.kale.auction.pages.NOC_Page;
import org.kale.auction.sdk.BaseClass;
import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.WriteExcel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NOC extends BaseClass
{
	Variables_Declaration vd=new Variables_Declaration();
	WriteExcel rw = new WriteExcel();
	LoginPage lp=new LoginPage(driver);
	
	@BeforeClass
	public void ReadData_UserDetails() throws Exception
	{
		TestDataReader tdr=TestDataReaderFactory.getInstance().open("test_data\\user-accounts.yml");
		TestDataCollection tdc=tdr.getCollection("login_cfsuser");
		vd.username_cfs=tdc.getString("email");
		vd.password_cfs=tdc.getString("password");
		
		TestDataCollection tdc1=tdr.getCollection("login_customuser");
		vd.username_custom=tdc1.getString("email_custom");
		vd.password_custom=tdc1.getString("password_custom");
		
		TestDataCollection tdc2=tdr.getCollection("login_groupuser");
		vd.username_group=tdc2.getString("email_group1");
		vd.password_group=tdc2.getString("password_group1");
		
		PropertiesFileReader pfr=new PropertiesFileReader();
		pfr.loadPropertiesFile();
		vd.s = new SimpleDateFormat("dd.MM.yyyy").format(Calendar.getInstance().getTime());
		vd.folderpath = pfr.getPropertyValue("Report_folder_path") +vd.s;
        vd.ExcelSavePath = rw.foldercreate(vd.folderpath);        
	}	
	
	@BeforeMethod
	public void ReadData_LineNoDetails() throws Exception
	{
		PropertiesFileReader pfr=new PropertiesFileReader();
		pfr.loadPropertiesFile();
		String TestDataExcel=pfr.getPropertyValue("testdata_path");
		vd.Notice1_UploadFilePath=pfr.getPropertyValue("Notice1_UploadFilePath");
		ExcelFileReader efr=new ExcelFileReader(TestDataExcel);
		String SheetName="NOC";
		vd.i++;
		vd.SC_ID=efr.getCellData(SheetName, "Test_Scenario_No",vd.i);
		vd.Description=efr.getCellData(SheetName, "Test_Scenario_Description",vd.i);
		vd.IGM_No=efr.getCellData(SheetName, "IGM_No",vd.i);
		vd.IGM_Date=efr.getCellData(SheetName, "IGM_Date",vd.i);
		vd.Arrival_Date=efr.getCellData(SheetName, "Arrival_Date",vd.i);
		vd.Line_No_Status=efr.getCellData(SheetName, "Line_No_Status",vd.i);
		vd.Line_No=efr.getCellData(SheetName, "Line_No",vd.i);
		vd.Sub_Line_No=efr.getCellData(SheetName, "Sub_Line_No",vd.i);
		vd.MBL_No=efr.getCellData(SheetName, "MBL_No",vd.i);
		vd.HBL_No=efr.getCellData(SheetName, "HBL_No",vd.i);
		vd.Vessel_Name=efr.getCellData(SheetName, "Vessel_Name",vd.i);
		vd.Load_Type=efr.getCellData(SheetName, "Load_Type",vd.i);
		vd.BOE_No=efr.getCellData(SheetName, "BOE_No",vd.i);
		vd.BOE_Date=efr.getCellData(SheetName, "BOE_Date",vd.i);
		vd.ShippingLine_Name=efr.getCellData(SheetName, "ShippingLine_Name",vd.i);
		vd.Cargo_Description=efr.getCellData(SheetName, "Cargo_Description",vd.i);
		vd.Cargo_Commodity=efr.getCellData(SheetName, "Cargo_Commodity",vd.i);
		vd.Crgo_Type=efr.getCellData(SheetName, "Cargo_Type",vd.i);
		vd.Importer_Name=efr.getCellData(SheetName, "Importer_Name",vd.i);
		vd.Address_Line1=efr.getCellData(SheetName, "Address_Line1",vd.i);
		vd.Address_Line2=efr.getCellData(SheetName, "Address_Line2",vd.i);
		vd.Address_Line3=efr.getCellData(SheetName, "Address_Line3",vd.i);
		vd.Cargo_Status=efr.getCellData(SheetName, "Cargo_Status",vd.i);
		vd.Gross_Wt=efr.getCellData(SheetName, "Gross_Wt",vd.i);
		vd.Pkg_Count=efr.getCellData(SheetName, "Pkg_Count",vd.i);
		vd.Container_No=efr.getCellData(SheetName, "Container_No",vd.i);
		vd.Container_Size=efr.getCellData(SheetName, "Container_Size",vd.i);
		vd.Container_Arrival_Date=efr.getCellData(SheetName, "Container_Arrival_Date",vd.i);
		
		/**
		 * Notice_001 Test Data
		 */
		vd.Sent_Date=efr.getCellData(SheetName,"Sent_Date",vd.i);
		vd.File_Name=efr.getCellData(SheetName, "File_Name",vd.i);
		vd.Remarks=efr.getCellData(SheetName, "Remarks",vd.i);
		vd.Importer_Reply_Date=efr.getCellData(SheetName, "Importer_Reply_Date",vd.i);
		vd.Importer_remark=efr.getCellData(SheetName, "Importer_remark",vd.i);
		vd.trial_Sent_Date=efr.getCellData(SheetName, "trial_Sent_Date",vd.i);
		
		/**
		 * Notice_002 Test Data
		 */
		vd.N2_Sent_Date=efr.getCellData(SheetName,"N2_Sent_Date",vd.i);
		vd.N2_File_Name=efr.getCellData(SheetName, "File_Name",vd.i);
		vd.N2_Remarks=efr.getCellData(SheetName, "Remarks",vd.i);
		vd.N2_Importer_Reply_Date=efr.getCellData(SheetName, "N2_Importer_Reply_Date",vd.i);
		vd.N2_Importer_remark=efr.getCellData(SheetName, "Importer_remark",vd.i);
		vd.N2_trial_Sent_Date=efr.getCellData(SheetName, "N2_trial_Sent_Date",vd.i);
		
		
	}

	/**
	 * TC_42
	 * Verify that CFS user is able to submit NOC Request
	 * @throws Exception 
	 */
	@Test
	public void NOC_SubmitNOC_Request() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_cfs, vd.password_cfs);
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);		
		lndp.LineNoDetails_save(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.IGM_No, vd.IGM_Date,vd.Arrival_Date, vd.Line_No_Status, vd.Line_No,
				vd.Sub_Line_No, vd.MBL_No,	vd.HBL_No, vd.Vessel_Name, vd.Load_Type, vd.BOE_No, vd.BOE_Date, vd.ShippingLine_Name, 
				vd.Cargo_Description, vd.Cargo_Commodity, vd.Crgo_Type, vd.Importer_Name, vd.Address_Line1, vd.Address_Line2, vd.Address_Line3,
				vd.Cargo_Status, vd.Gross_Wt, vd.Pkg_Count, vd.Container_No, vd.Container_Size, vd.Container_Arrival_Date);
		
		NOC_1_Page cunp=new NOC_1_Page(driver);
		cunp.NOC1_Save(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.Notice1_UploadFilePath,vd.Sent_Date,vd.File_Name,vd.Remarks,
				vd.Importer_Reply_Date,vd.Importer_remark);
		
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.NOC2_Save_After_60_Days_GeneralCargo(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.Notice1_UploadFilePath, vd.N2_Sent_Date, vd.File_Name, vd.Remarks, vd.N2_Importer_Reply_Date, vd.Importer_remark);
		
		NOC_Page NOC=new NOC_Page(driver);
		NOC.CFS_Login_SubmitNOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath,vd.IGM_No );
		
		NOC.Logout();
		
		System.out.println("TC_42");
	}
	
	/**
	 * TC_43
	 * Verify that the Customs user can Reject NOC request
	 * @throws Exception 
	 */
	 @Test(dependsOnMethods="NOC_SubmitNOC_Request")
	 public void NOC_CustomLogin_Reject_NOC_Request() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_custom, vd.password_custom);
		 
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.Custom_Login_NOC_Reject(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		 NOC.Logout();
		 System.out.println("TC_43");
	 }
		
	/**
	 * TC_44
	 * Verify that the CFS user can Revoke NOC request
	 * @throws Exception 
	 */
	 @Test(dependsOnMethods="NOC_CustomLogin_Reject_NOC_Request")
	 public void NOC_RevokeNOC_Request() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_cfs, vd.password_cfs);
		 
		 NOC_Page NOC=new NOC_Page(driver);		
		 NOC.CFS_Login_RevokeNOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		 NOC.Logout();
		 System.out.println("TC_44");
	 }
	 
	 /**
	  * TC_45
	  * Verify that the customs user is able to  Accessing Group
	 * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_RevokeNOC_Request")
	 public void NOC_CustomLogin_Accessing_Group() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_custom, vd.password_custom);
		 
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_CustomLogin_Accessing_Group(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		
		 System.out.println("TC_45");
	 }
	 
	 /**
	  * TC_46
	  * Verify that the customs user is able to  Accessing Group
	 * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_CustomLogin_Accessing_Group")
	 public void NOC_CustomLogin_HOLD_NOC_Request() throws Exception
	 {
		 NOC_Page NOC=new NOC_Page(driver);
	   	 NOC.NOC_CustomLogin_HOLD_NOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);			
			
		 System.out.println("TC_46");
	 }
	 
	 /**
	  * TS_47
	  * Verify that the Customs user is able to Accept NOC request
	  * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_CustomLogin_HOLD_NOC_Request")
	 public void NOC_CustomLogin_ACCEPT_NOC_Request() throws Exception
	 {	 
		 NOC_Page NOC=new NOC_Page(driver);
	   	 NOC.NOC_CustomLogin_ACCEPT_NOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);			
			
		 System.out.println("TC_47");
	 }
	 
	 /**
	  * TS_48
	  * Verify that Customs user is able redirct to the NOC Dashboard from NOC Details
	 * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_CustomLogin_ACCEPT_NOC_Request")
	 public void NOC_CustomLogin_Redirect_NOCDashboard_To_NOCDetails() throws Exception
	 {
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_CustomLogin_Redirect_NOCDashboard_To_NOCDetails(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);			
			
		 System.out.println("TC_48");
	 }
	 
	 /**
	  * TS_49
	  * "Verify that Customs user is not able to edit the NOC details from UCC Dashboard
	  * OR
	  * Verify that Customs user is able to only view the NOC details from UCC Dashboard
	 * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_CustomLogin_Redirect_NOCDashboard_To_NOCDetails")
	 public void NOC_CustomOnlyView_NOCDetails_FromUCCDashboard() throws Exception
	 {
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_CustomOnlyView_NOCDetails_FromUCCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		
		 System.out.println("TC_49");
	 }
	 
	 /**
	  * TS_50
	  * Verify that Customs user is able redirect to the UCC Dashboard from NOC Details
	  */
	 @Test(dependsOnMethods="NOC_CustomOnlyView_NOCDetails_FromUCCDashboard")
	 public void NOC_CustomLogin_Redirect_UCCDashboard_From_NOCDetails() throws Exception
	 {
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_CustomLogin_Redirect_UCCDashboard_From_NOCDetails(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		 NOC.Logout();
		 System.out.println("TC_50");
	 }
	 
	 /**.
	  * TS_51
	  * Verify that the Group user can Hold the Assigned Group Request
	  */
	 @Test(dependsOnMethods="NOC_CustomLogin_Redirect_UCCDashboard_From_NOCDetails")
	 public void NOC_GroupLogin_HOLD_NOC_Request() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_group, vd.password_group);
		 
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_GroupLogin_HOLD_NOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		 NOC.Logout();
		 System.out.println("TC_51");		 
	 }
	  
	 /**
	  * TS_52
	  * Verify that the Group user can Reject the Assigned Group Request
	 * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_GroupLogin_HOLD_NOC_Request")
	 public void NOC_GroupUser_REJECT_NOC_Request() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_group, vd.password_group);
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_GroupUser_REJECT_NOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
			
		 NOC.Logout();
		 System.out.println("TS_52");
	 }
	 
	 /**
	  * TS_53
	  * Verify that the Group user can Accept the Assigned Group Request
	  * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_GroupUser_REJECT_NOC_Request")
	 public void NOC_GroupUser_ACCEPT_NOC_Request() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_group, vd.password_group);
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_GroupUser_ACCEPT_NOC_Request(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
			
		 NOC.Logout();
		 System.out.println("TS_53");
	 }
	 
	 /**
	  * TS_54
	  * Verify that Group User is able redirect to the Group NOC Dashboard from NOC Details
	 * @throws Exception 
	  */
	 @Test(dependsOnMethods="NOC_GroupUser_ACCEPT_NOC_Request")
	 public void NOC_GroupUser_Redirect_NOCDetails_To_GroupNOCDashboard() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_group, vd.password_group);
		 
		 NOC_Page NOC=new NOC_Page(driver);
		 NOC.NOC_GroupUser_Redirect_NOCDetails_To_GroupNOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
			
		 NOC.Logout();
		 driver.close();
		 driver.quit();
		 System.out.println("TS_547");
		 
	 }
}























