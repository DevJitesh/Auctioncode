package org.kale.auction.Test_Cases_Modules;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import org.junit.Before;
import org.kale.auction.TestDataReaders.ExcelFileReader;
import org.kale.auction.TestDataReaders.PropertiesFileReader;
import org.kale.auction.TestDataReaders.TestDataCollection;
import org.kale.auction.TestDataReaders.TestDataReader;
import org.kale.auction.TestDataReaders.TestDataReaderFactory;


import org.kale.auction.pages.LineNoDetails_Page;
import org.kale.auction.pages.LoginPage;
import org.kale.auction.sdk.BaseClass;
import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.WriteExcel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Line_No_Details extends BaseClass
{
	
	Variables_Declaration vd=new Variables_Declaration();
	WriteExcel rw = new WriteExcel();
	LoginPage lp=new LoginPage(driver);
	LineNoDetails_Page lndp=new LineNoDetails_Page(driver);

	
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
		ExcelFileReader efr=new ExcelFileReader(TestDataExcel);
		String SheetName="Line_No_Details";
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
	}

	 /**
	  * TS_01
	  * Verify that user is able to enter & save Line No. Details with Crgo Type as General Cargo 
	  * and Cargo Status as Containerized.
	  * @throws Exception
	  */
	//@Test(priority=0)
	@Test	
	public void LineNoDetails_save_Cargotype_Containerized() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_cfs, vd.password_cfs);
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_save(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.IGM_No, vd.IGM_Date,vd.Arrival_Date, vd.Line_No_Status, vd.Line_No,
				vd.Sub_Line_No, vd.MBL_No,	vd.HBL_No, vd.Vessel_Name, vd.Load_Type, vd.BOE_No, vd.BOE_Date, vd.ShippingLine_Name, 
				vd.Cargo_Description, vd.Cargo_Commodity, vd.Crgo_Type, vd.Importer_Name, vd.Address_Line1, vd.Address_Line2, vd.Address_Line3,
				vd.Cargo_Status, vd.Gross_Wt, vd.Pkg_Count, vd.Container_No, vd.Container_Size, vd.Container_Arrival_Date);
		
		System.out.println("TC_01");
	}
	
	/**
	 * TS_02
	 * Verify that CFS user is able to save Line No. Details with Break Bulk Condition & 
	 * for Break Bulk, container details are not required.
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_save_Cargotype_Containerized") 
	//@Test(priority=1)
	public void LineNoDetails_BreakBulk() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_BreakBulk(vd.SC_ID,vd.Description,vd.ExcelSavePath);
		System.out.println("TC_02");
	}
	
	/**
	 * TS_03
	 * Verify that CFS user is able to save Line No. Details with Detained By Condition
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_BreakBulk")  
	//@Test(priority=2)
	public void LineNoDetails_DetainedByFlag() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_DetainedByFlag(vd.SC_ID,vd.Description,vd.ExcelSavePath);
		System.out.println("TC_03");
	}
	
	/**
	 * TS_04
	 * Verify that CFS User is not able to perform any operation on Line No. Details 
	 * if Detained By Flag is checked.
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_DetainedByFlag")
	//@Test(priority=3)
	public void LineNoDetails_DetainedByFlag_NotAllowtoEdit() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_DetainedByFlag_NotAllowtoEdit(vd.SC_ID,vd.Description,vd.ExcelSavePath);
		lndp.Logout();
		System.out.println("TC_04");
	}
	
	/**
	 * TS_05
	 *"Verify that Customs User is able to
		1. Edit the Line No. Details until the Detained By Flag is checked.
		2. Uncheck the Detained By flag & not able to edit any other line no. details." 
	 * @throws Exception
	 */	
	@Test(dependsOnMethods="LineNoDetails_DetainedByFlag_NotAllowtoEdit")
	//@Test(priority=4)
	public void LineNoDetails_CustomEdit() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_custom, vd.password_custom);	
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_CustomEdit(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		lndp.Logout();
		System.out.println("TC_05");
	}
	
	/**
	 * TS_06
	 * Verify that after unchecking the Detained By flag by Customs User, 
	 * CFS user is able to perform further operations on the same Line No. Details.
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_CustomEdit")
	//@Test(priority=5)
	public void LineNoDetails_Edit_After_CustomLogin() throws Exception
	{	
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_cfs, vd.password_cfs);
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_Edit_After_CustomLogin(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.IGM_No);
		
		lndp.Logout();
		System.out.println("TC_06");
	}
	
	/**
	 * TS_07
	 * Verify that  CFS user is able to save Line No. Details with Perishable cargo type
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_Edit_After_CustomLogin")
	//@Test(priority=6)
	public void LineNoDetails_save_Cargotype_Perishable() throws Exception
	{		
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_cfs, vd.password_cfs);
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_save(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.IGM_No, vd.IGM_Date,vd.Arrival_Date, vd.Line_No_Status, vd.Line_No,
				vd.Sub_Line_No, vd.MBL_No,	vd.HBL_No, vd.Vessel_Name, vd.Load_Type, vd.BOE_No, vd.BOE_Date, vd.ShippingLine_Name, 
				vd.Cargo_Description, vd.Cargo_Commodity, vd.Crgo_Type, vd.Importer_Name, vd.Address_Line1, vd.Address_Line2, vd.Address_Line3,
				vd.Cargo_Status, vd.Gross_Wt, vd.Pkg_Count, vd.Container_No, vd.Container_Size, vd.Container_Arrival_Date);
		System.out.println("TC_07");
	}
	
	/**
	 * TS_08
	 * Verify that CFS user will able to save Line No. Details with De-Stuffed Cargo status 
	 * & for De-Stuffed Cargo, container details are not required.
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_save_Cargotype_Perishable")
	//@Test(priority=7)
	public void LineNoDetails_CargoStatus_Destuffed() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_CargoStatus_Destuffed(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.Cargo_Status,
				vd.Container_No, vd.Container_Size, vd.Container_Arrival_Date);
		System.out.println("TC_08");
	}
	 
	/**
	 * TS_09
	 * Verify that CFS user is  able to Edit Line No. Details from UCC Dashboard.
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_CargoStatus_Destuffed")
	//@Test(priority=8)
	public void LineNoDetails_Edit_From_UCCDashboard() throws Exception
	{	
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_cfs, vd.password_cfs);
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_Edit_From_UCCDashBoard(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.IGM_No);
		System.out.println("TC_09");
	}
	
	/**
	 * TS_10
	 * Verify that CFS user is able to redirect  to the UCC Dashboard from Line No. Details screen.
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_Edit_From_UCCDashboard")
	//@Test(priority=9)
	public void CFSuser_Redirect_LineNoDetails_To_UCCDashboard() throws Exception
	{	
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.CFSuser_Redirect_LineNoDetails_To_UCCDashboard(vd.SC_ID,vd.Description,vd.ExcelSavePath,vd.IGM_No);
		lndp.Logout();
		System.out.println("TC_10");
	}
	
	/**
	 * TS_11
	 * "Verify that Customs user is not able to edit the Line No. details from UCC Dashboard OR
	 * 	Verify that Customs user is able to only view the Line No. details from UCC Dashboard"
	 */
	@Test(dependsOnMethods="CFSuser_Redirect_LineNoDetails_To_UCCDashboard")
	//@Test(priority=10)
	public void LineNoDetails_CustomUser_OnlyViewLND_UCCDashboard() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.login(vd.username_custom, vd.password_custom);
		
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LineNoDetails_CustomOnlyView(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TC_11");
	}
	
	/**
	 * TS_12
	 * Verify that Customs user is able redirect to the UCC Dash-board from Line No. Details
	 * @throws Exception
	 */
	@Test(dependsOnMethods="LineNoDetails_CustomUser_OnlyViewLND_UCCDashboard")
	//@Test(priority=11)
	public void CUSTOMuser_Redirect_LineNoDetails_To_UCCDashboard() throws Exception
	{	
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.CUSTOMuser_Redirect_LineNoDetails_To_UCCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TC_12");
	}
	
	/**
	 * TS_13
	 * Verify that Customs user is not able to edit the Line No. details from NOC Dashboard
	 * OR
	 * Verify that Customs user is able to only view the Line No. details from NOC Dashboard
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="CUSTOMuser_Redirect_LineNoDetails_To_UCCDashboard")
	//@Test(priority=12)
	public void LND_CustomUser_OnlyView_LND_NOCDashboard() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LND_CustomUser_OnlyView_LND_NOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TC_13");
	}
	
	/**
	 * TS_14
	 * Verify that Customs user is able redirct to the NOC Dashboard from Line No. Details
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="LND_CustomUser_OnlyView_LND_NOCDashboard")
	//@Test(priority=13)
	public void LND_CustomUser_Redirect_LND_To_NOCDashboard() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LND_CustomUser_Redirect_LND_To_NOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TC_14");
	}
	
	/**
	 * TS_15
	 *"Verify that Group User is not able to edit the Line No. details from Group NOC Dashboard
	 *OR
	 *Verify that Group user is able to only view the Line No. details from Group NOC Dashboard
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="LND_CustomUser_Redirect_LND_To_NOCDashboard")
	//@Test(priority=14)
	public void LND_CustomUser_OnlyView_LND_GroupNOCDashboard() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LND_CustomUser_OnlyView_LND_GroupNOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TC_15");
	}
	
	/**
	 * TS_16
	 * Verify that Group User is able to redirect  to the Group NOC Dashboard from Line No. Details
	 * @throws Exception 
	 */
	@Test(dependsOnMethods="LND_CustomUser_OnlyView_LND_GroupNOCDashboard")
	//@Test(priority=15)
	public void LND_CustomUser_Redirect_LND_To_GroupNOCDashboard() throws Exception
	{
		LineNoDetails_Page lndp=new LineNoDetails_Page(driver);
		lndp.LND_CustomUser_Redirect_LND_To_GroupNOCDashboard(vd.SC_ID, vd.Description, vd.ExcelSavePath, vd.IGM_No);
		System.out.println("TC_16");
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
