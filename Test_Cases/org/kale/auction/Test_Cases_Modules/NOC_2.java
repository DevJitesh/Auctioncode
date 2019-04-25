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
import org.kale.auction.sdk.BaseClass;
import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.WriteExcel;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NOC_2 extends BaseClass
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
		String SheetName="Notice_2";
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
		
		vd.Sent_Date=efr.getCellData(SheetName,"Sent_Date",vd.i);

		vd.File_Name=efr.getCellData(SheetName, "File_Name",vd.i);
		vd.Remarks=efr.getCellData(SheetName, "Remarks",vd.i);
		vd.Importer_Reply_Date=efr.getCellData(SheetName, "Importer_Reply_Date",vd.i);
		vd.Importer_remark=efr.getCellData(SheetName, "Importer_remark",vd.i);
		vd.trial_Sent_Date=efr.getCellData(SheetName, "trial_Sent_Date",vd.i);
		
		vd.N2_Sent_Date=efr.getCellData(SheetName, "N2_Sent_Date",vd.i);
		vd.N2_Importer_Reply_Date=efr.getCellData(SheetName, "N2_Importer_Reply_Date",vd.i);
		vd.N2_trial_Sent_Date=efr.getCellData(SheetName, "N2_trial_Sent_Date",vd.i);
	}


	/**
	 * TS_31
	 * Verify that CFS user is able to enter & save Notice2 Details after 60 days of Arrival Date or
	 *  after 30 days of notice 1 date for General Cargo.
	 * @throws Exception 
	 */
	@Test
	public void NOC2_Save_After_60_Days_GeneralCargo() throws Exception
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
		Not2.NOC2_Save_After_60_Days_GeneralCargo(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.Notice1_UploadFilePath, vd.N2_Sent_Date,
				vd.File_Name, vd.Remarks, vd.N2_Importer_Reply_Date, vd.Importer_remark);
		Not2.Logout();
		System.out.println("TS_31");
	}
	
	/**
	 * TS_32
	 *Verify that CFS user is able to enter & save Notice2 Details with Abandon 
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="NOC2_Save_After_60_Days_GeneralCargo")
	public void NOC2_Save_Abandon_GeneralCargo() throws Exception
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
		Not2.NOC2_Save_Abandon_GeneralCargo(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.Notice1_UploadFilePath, vd.N2_Sent_Date,
				vd.File_Name, vd.Remarks, vd.N2_Importer_Reply_Date, vd.Importer_remark);
		
		System.out.println("TS_32");
	}
		
	/**
	 * TS_33
	 *Verify that the CFS user is not able to send  notice 2 before 30 days of Notice 1 for General Cargo"
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="NOC2_Save_Abandon_GeneralCargo")
	public void Before_30Days_Notice_2_NotPossible() throws Exception
	{
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.Before_30Days_Notice_2_NotPossible(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.N2_Sent_Date,
				vd.N2_trial_Sent_Date);
		System.out.println("TS_33");
	}

	/**
	 * TS_34
	 *Verify that user is able to Redirect to the UCC Dashboard
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="Before_30Days_Notice_2_NotPossible")
	public void Redirect_NOC2_to_UCCDashboard() throws Exception
	{
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.Redirect_NOC2_to_UCCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath);
		
		Not2.Logout();
		System.out.println("TS_34");
	}
	
	/**
	 * TS_35
	 * Verify that the CFS user is not able to save Notice 2 details for the Perishable Cargo
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="Redirect_NOC2_to_UCCDashboard")
	public void NOC2_For_Perishable_NOC2_NotRequirred() throws Exception
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
		Not2.NOC2_For_Perishable_NOC2_NotRequirred(vd.SC_ID, vd.Description, vd.ExcelSavePath);
		
		Not2.Logout();
		System.out.println("TS_35");
	}
	
	/**
	 * TS_36
	 * Verify that Customs user is not able to edit the Notice 2 details from UCC Dashboard
	 * OR
	 * Verify that Customs user is able to only view the Notice 2 details from UCC Dashboard
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="NOC2_For_Perishable_NOC2_NotRequirred")
	public void NOC2_CustomUser_OnlyViewNotice01_From_UCCDashboard() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_custom, vd.password_custom);
		
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.NOC2_CustomOnlyView_From_UCCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TS_36");
	}

	/**
	 * TS_37
	 *Verify that Customs user is able redirect to the UCC Dashboard from Notice 2 Details 
	 */
	@Test(dependsOnMethods="NOC2_CustomUser_OnlyViewNotice01_From_UCCDashboard")
	public void NOC2_CustomUser_Redirect_Notice02_To_UCCDashboard() throws Exception
	{		
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.NOC2_CustomUser_Redirect_Notice02_To_UCCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		
		System.out.println("TS_37");
	}
	
	/**
	 * TS_38
	 * "Verify that Customs user is not able to edit the Notice 2 details from NOC Dashboard
	 * OR
	 * Verify that Customs user is able to only view the Notice 2 details from NOC Dashboard
	 */
	@Test(dependsOnMethods="NOC2_CustomUser_Redirect_Notice02_To_UCCDashboard")
	public void NOC2_CustomUser_OnlyViewNotice02_From_NOCDashboard() throws Exception
	 {
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.NOC2_CustomUser_OnlyViewNotice02_From_NOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		 System.out.println("TS_38");
	 }
	
	/**
	 * TS_39
	 * Verify that Customs user is able redirct to the NOC Dashboard from Notice 2 Details
	 */
	@Test(dependsOnMethods="NOC2_CustomUser_OnlyViewNotice02_From_NOCDashboard")
	public void NOC2_CustomUser_Redirect_Notice02_To_NOCDashboard() throws Exception
	 {		
		NOC_2_Page Not2=new NOC_2_Page(driver);
		Not2.NOC2_CustomUser_Redirect_Notice02_To_NOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		Not2.Logout();
		System.out.println("TS_39");
	 }
	
	/**
	 * TS_40
	 * "Verify that Group User is not able to edit the Notice 2 details from Group NOC Dashboard
	 * OR
	 * Verify that Group user is able to only view the Notice 2 details from Group NOC Dashboard
	 */
	@Test(dependsOnMethods="NOC2_CustomUser_Redirect_Notice02_To_NOCDashboard")
	 public void NOC2_GroupUser_OnlyViewNotice02_From_GroupNOCDashboard() throws Exception
	 {
		 LoginPage lp=new LoginPage(driver);
		 lp.login(vd.username_group, vd.password_group);
		 
		 NOC_2_Page Not2=new NOC_2_Page(driver);
		 Not2.Notice2_GroupUser_OnlyView_Notice2_GroupNOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);	 		 
		 System.out.println("TS_40");
	 }
	
	/**
	 * TS_41
	 * Verify that Group User is able to redirect to the Group NOC Dashboard from Notice 2. Details
	 */
	@Test(dependsOnMethods="NOC2_GroupUser_OnlyViewNotice02_From_GroupNOCDashboard")
	public void NOC2_GroupUser_Redirect_Notice02_To_GroupNOCDashboard() throws Exception
	 {
		 NOC_2_Page Not2=new NOC_2_Page(driver);
		 Not2.NOC2_GroupUser_Redirect_Notice02_To_GroupNOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);	 		 
		 System.out.println("TS_41");
		 driver.close();
		 driver.quit();
	 }
	
	
	
	
	
	
	
	
	
//	/**
//	 * TS_37
//	 * "Verify that Customs user is not able to edit the Notice 2 details from NOC Dashboard
//	 * OR
//	 * Verify that Customs user is able to only view the Notice 2 details from NOC Dashboard
//	 */
//	 

}
