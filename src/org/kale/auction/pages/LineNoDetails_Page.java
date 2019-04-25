package org.kale.auction.pages;

import java.awt.RenderingHints.Key;

import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.General_Methods;
import org.kale.auction.utils.Validate_Elements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class LineNoDetails_Page 
{
	WebDriver driver;
	
	Variables_Declaration vd=new Variables_Declaration();
	General_Methods gm=new General_Methods();
	Validate_Elements ve=new Validate_Elements();
	
	public LineNoDetails_Page(WebDriver dr)
	{
		driver=dr;
	}
	
	/**
	 * @category Save Line No Details
	 * 
	 */
	
	public void LineNoDetails_save(String SC_ID,String Description,String ExcelSavePath, String IGM_No, String IGM_Date,String Arrival_Date, String Line_No_Status,String Line_No, 
			String Sub_Line_No,String MBL_No, String HBL_No,String Vessel_Name, String Load_Type,String BOE_No, String BOE_Date,
			String ShippingLine_Name,String Cargo_Description, String Cargo_Commodity,String Cargo_Type, String Importer_Name,
			String Address_Line1, String Address_Line2,String Address_Line3, String Cargo_Status,String Gross_Wt,
			String Pkg_Count,String Container_No, String Container_Size,String Container_Arrival_Date) throws Exception
	{
		driver.findElement(By.id("ctl00_LstSubMenu_ctrl1_lbtidsdttle")).click();
	
		vd.StartTime=gm.GetStartTime();	
		
		vd.WebEle_IGM_No=driver.findElement(By.id("ctl00_hldPage_txtigmno"));		vd.WebEle_IGM_No.sendKeys(IGM_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"IGM No","ctl00_hldPage_txtigmno", driver, ExcelSavePath, vd.StartTime);
		Reporter.log("IGM NO entered successfully");
				
		vd.WebEle_IGM_Date=driver.findElement(By.id("ctl00_hldPage_txtigmDate"));		vd.WebEle_IGM_Date.sendKeys(IGM_Date);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"IGM Date","ctl00_hldPage_txtigmDate", driver, ExcelSavePath, vd.StartTime);
		Reporter.log("IGM Date entered successfully");
		
		vd.WebEle_Arrival_Date=driver.findElement(By.id("ctl00_hldPage_txtarrivaldate"));		vd.WebEle_Arrival_Date.sendKeys(Arrival_Date);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Arrival Date","ctl00_hldPage_txtarrivaldate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Line_No=driver.findElement(By.id("ctl00_hldPage_txtlineno"));		vd.WebEle_Line_No.sendKeys(Line_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Line No","ctl00_hldPage_txtlineno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Sub_Line_No=driver.findElement(By.id("ctl00_hldPage_txtsublineno"));		vd.WebEle_Sub_Line_No.sendKeys(Sub_Line_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Sub Line No","ctl00_hldPage_txtsublineno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_MBL_No=driver.findElement(By.id("ctl00_hldPage_txtlblno"));		vd.WebEle_MBL_No.sendKeys(MBL_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"MBL No","ctl00_hldPage_txtlblno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_HBL_No=driver.findElement(By.id("ctl00_hldPage_txthblno"));		vd.WebEle_HBL_No.sendKeys(HBL_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"HBL No","ctl00_hldPage_txthblno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Vessel_Name=driver.findElement(By.id("ctl00_hldPage_txtvessalname"));		vd.WebEle_Vessel_Name.sendKeys(Vessel_Name);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Vessel Name","ctl00_hldPage_txtvessalname", driver, ExcelSavePath, vd.StartTime);
		
		org.openqa.selenium.support.ui.Select load=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_DropDownloadtype")));
		load.selectByVisibleText(Load_Type);
		
		vd.WebEle_BOE_No=driver.findElement(By.id("ctl00_hldPage_txtboeno"));		vd.WebEle_BOE_No.sendKeys(BOE_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"BOE No","ctl00_hldPage_txtboeno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_BOE_Date=driver.findElement(By.id("ctl00_hldPage_txtboedate"));		vd.WebEle_BOE_Date.sendKeys(BOE_Date);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"BOE Date","ctl00_hldPage_txtboedate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_ShippingLine_Name=driver.findElement(By.id("ctl00_hldPage_txtshpline"));	vd.WebEle_ShippingLine_Name.sendKeys(ShippingLine_Name);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"ShippingLine Name","ctl00_hldPage_txtshpline", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Cargo_Description=driver.findElement(By.id("ctl00_hldPage_txtcargodescription"));	vd.WebEle_Cargo_Description.sendKeys(Cargo_Description);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Cargo Description","ctl00_hldPage_txtcargodescription", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Cargo_Commodity=driver.findElement(By.id("ctl00_hldPage_txtCargoCommodity"));	vd.WebEle_Cargo_Commodity.sendKeys(Cargo_Commodity);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Cargo Commodity","ctl00_hldPage_txtCargoCommodity", driver, ExcelSavePath, vd.StartTime);
		
		org.openqa.selenium.support.ui.Select CargoType=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_ddlDrpCargoType")));
		CargoType.selectByVisibleText(Cargo_Type);
	
		vd.WebEle_Importer_Name=driver.findElement(By.id("ctl00_hldPage_txtimportername"));		vd.WebEle_Importer_Name.sendKeys(Importer_Name);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Importer Name","ctl00_hldPage_txtimportername", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Address_Line1=driver.findElement(By.id("ctl00_hldPage_txtaddressline1"));		vd.WebEle_Address_Line1.sendKeys(Address_Line1);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Address Line1","ctl00_hldPage_txtaddressline1", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Address_Line2=driver.findElement(By.id("ctl00_hldPage_txtaddressline2"));		vd.WebEle_Address_Line2.sendKeys(Address_Line2);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Address Line2","ctl00_hldPage_txtaddressline2", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Address_Line3=driver.findElement(By.id("ctl00_hldPage_txtaddressline3"));		vd.WebEle_Address_Line3.sendKeys(Address_Line3);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Address Line3","ctl00_hldPage_txtaddressline3", driver, ExcelSavePath, vd.StartTime);
		
		org.openqa.selenium.support.ui.Select CargoStatus=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_DropDowncargostatus")));
		CargoStatus.selectByVisibleText(Cargo_Status);
		
		vd.WebEle_Gross_Wt=driver.findElement(By.id("ctl00_hldPage_txtgrosswt"));		vd.WebEle_Gross_Wt.sendKeys(Gross_Wt);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Gross Wt","ctl00_hldPage_txtgrosswt", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Pkg_Count=driver.findElement(By.id("ctl00_hldPage_txtpkgcount"));		vd.WebEle_Pkg_Count.sendKeys(Pkg_Count);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Pkg Count","ctl00_hldPage_txtpkgcount", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));	vd.WebEle_Container_No.sendKeys(Container_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Container No","ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Container_Size=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtsize")); 	vd.WebEle_Container_Size.sendKeys(Container_Size);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Container Size","ctl00_hldPage_grdAucLineNo_ctl02_txtsize", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Container_Size.sendKeys(Keys.TAB);
//		vd.WebEle_Container_Arrival_Date=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtarrivaldate"));
//		vd.WebEle_Container_Arrival_Date.sendKeys(Container_Arrival_Date);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();	
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();

		if(vd.Save_Message.equals("Record Saved Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Saved Successfully", driver, ExcelSavePath, vd.StartTime);	
		
	}

	/**
	 *@throws Exception 
	 * @category  Edit Line No Details
	 */
	
	public void LineNoDetails_edit(String SC_ID,String Description,String ExcelSavePath,String IGM_No, String IGM_Date,String Arrival_Date, String Line_No_Status,String Line_No, 
			String Sub_Line_No,String MBL_No, String HBL_No,String Vessel_Name, String Load_Type,String BOE_No, String BOE_Date,
			String ShippingLine_Name,String Cargo_Description, String Cargo_Commodity,String Cargo_Type, String Importer_Name,
			String Address_Line1, String Address_Line2,String Address_Line3, String Cargo_Status,String Gross_Wt,
			String Pkg_Count,String Container_No, String Container_Size,String Container_Arrival_Date) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.WebEle_IGM_No=driver.findElement(By.id("ctl00_hldPage_txtigmno"));
		vd.WebEle_IGM_No.clear();		vd.WebEle_IGM_No.sendKeys(IGM_No);		vd.WebEle_IGM_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"IGM No","ctl00_hldPage_txtigmno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_IGM_Date=driver.findElement(By.id("ctl00_hldPage_txtigmDate"));
		vd.WebEle_IGM_Date.clear();     vd.WebEle_IGM_Date.sendKeys(IGM_Date);  vd.WebEle_IGM_Date.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"IGM Date","ctl00_hldPage_txtigmDate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Arrival_Date=driver.findElement(By.id("ctl00_hldPage_txtarrivaldate"));
		vd.WebEle_Arrival_Date.clear(); vd.WebEle_Arrival_Date.sendKeys(Arrival_Date); vd.WebEle_Arrival_Date.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Arrival Date","ctl00_hldPage_txtarrivaldate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Line_No=driver.findElement(By.id("ctl00_hldPage_txtlineno"));
		vd.WebEle_Line_No.clear();      vd.WebEle_Line_No.sendKeys(Line_No);	vd.WebEle_Line_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Line No","ctl00_hldPage_txtlineno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Sub_Line_No=driver.findElement(By.id("ctl00_hldPage_txtsublineno"));
		vd.WebEle_Sub_Line_No.clear();  vd.WebEle_Sub_Line_No.sendKeys(Sub_Line_No); vd.WebEle_Sub_Line_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Sub Line No","ctl00_hldPage_txtsublineno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_MBL_No=driver.findElement(By.id("ctl00_hldPage_txtlblno"));
		vd.WebEle_MBL_No.clear();       vd.WebEle_MBL_No.sendKeys(MBL_No);      vd.WebEle_MBL_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"MBL No","ctl00_hldPage_txtlblno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_HBL_No=driver.findElement(By.id("ctl00_hldPage_txthblno"));
		vd.WebEle_HBL_No.clear();       vd.WebEle_HBL_No.sendKeys(HBL_No);		vd.WebEle_HBL_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"HBL No","ctl00_hldPage_txthblno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Vessel_Name=driver.findElement(By.id("ctl00_hldPage_txtvessalname"));		
		vd.WebEle_Vessel_Name.clear();  vd.WebEle_Vessel_Name.sendKeys(Vessel_Name);  vd.WebEle_Vessel_Name.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Vessel Name","ctl00_hldPage_txtvessalname", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_BOE_No=driver.findElement(By.id("ctl00_hldPage_txtboeno"));
		vd.WebEle_BOE_No.clear();       vd.WebEle_BOE_No.sendKeys(BOE_No);		vd.WebEle_BOE_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"BOE No","ctl00_hldPage_txtboeno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_BOE_Date=driver.findElement(By.id("ctl00_hldPage_txtboedate"));
		vd.WebEle_BOE_Date.clear();     vd.WebEle_BOE_Date.sendKeys(BOE_Date);	vd.WebEle_BOE_Date.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"BOE Date","ctl00_hldPage_txtboedate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_ShippingLine_Name=driver.findElement(By.id("ctl00_hldPage_txtshpline"));
		vd.WebEle_ShippingLine_Name.clear();     vd.WebEle_ShippingLine_Name.sendKeys(ShippingLine_Name);     vd.WebEle_ShippingLine_Name.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"ShippingLine Name","ctl00_hldPage_txtshpline", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Cargo_Description=driver.findElement(By.id("ctl00_hldPage_txtcargodescription"));
		vd.WebEle_Cargo_Description.clear();     vd.WebEle_Cargo_Description.sendKeys(Cargo_Description);     vd.WebEle_Cargo_Description.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Cargo Description","ctl00_hldPage_txtcargodescription", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Cargo_Commodity=driver.findElement(By.id("ctl00_hldPage_txtCargoCommodity"));
		vd.WebEle_Cargo_Commodity.clear();       vd.WebEle_Cargo_Commodity.sendKeys(Cargo_Commodity);		  vd.WebEle_Cargo_Commodity.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Cargo Commodity","ctl00_hldPage_txtCargoCommodity", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Importer_Name=driver.findElement(By.id("ctl00_hldPage_txtimportername"));
		vd.WebEle_Importer_Name.clear();         vd.WebEle_Importer_Name.sendKeys(Importer_Name);     		  vd.WebEle_Importer_Name.getAttribute("value");	
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Importer Name","ctl00_hldPage_txtimportername", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Address_Line1=driver.findElement(By.id("ctl00_hldPage_txtaddressline1"));
		vd.WebEle_Address_Line1.clear();         vd.WebEle_Address_Line1.sendKeys(Address_Line1);		      vd.WebEle_Address_Line1.getAttribute("value");		
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Address Line1","ctl00_hldPage_txtaddressline1", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Address_Line2=driver.findElement(By.id("ctl00_hldPage_txtaddressline2"));
		vd.WebEle_Address_Line2.clear();         vd.WebEle_Address_Line2.sendKeys(Address_Line2);		      vd.WebEle_Address_Line2.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Address Line2","ctl00_hldPage_txtaddressline2", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Address_Line3=driver.findElement(By.id("ctl00_hldPage_txtaddressline3"));
		vd.WebEle_Address_Line3.clear();         vd.WebEle_Address_Line3.sendKeys(Address_Line3);		      vd.WebEle_Address_Line3.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Address Line3","ctl00_hldPage_txtaddressline3", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Gross_Wt=driver.findElement(By.id("ctl00_hldPage_txtgrosswt"));
		vd.WebEle_Gross_Wt.clear(); 	vd.WebEle_Gross_Wt.sendKeys(Gross_Wt);		vd.WebEle_Gross_Wt.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Gross Wt","ctl00_hldPage_txtgrosswt", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Pkg_Count=driver.findElement(By.id("ctl00_hldPage_txtpkgcount"));
		vd.WebEle_Pkg_Count.clear();    vd.WebEle_Pkg_Count.sendKeys(Pkg_Count);	vd.WebEle_Pkg_Count.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Pkg Count","ctl00_hldPage_txtpkgcount", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));
		vd.WebEle_Container_No.clear();	
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		vd.WebEle_Container_No.sendKeys(Container_No);	
		vd.WebEle_Container_No.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Container No","ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Container_Size=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtsize"));
		vd.WebEle_Container_Size.clear();  vd.WebEle_Container_Size.sendKeys(Container_Size);		vd.WebEle_Container_Size.getAttribute("value");
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Container Size","ctl00_hldPage_grdAucLineNo_ctl02_txtsize", driver, ExcelSavePath, vd.StartTime);
		
//		vd.WebEle_Container_Arrival_Date.clear();		vd.WebEle_Container_Arrival_Date.sendKeys(Container_Arrival_Date);
//		vd.WebEle_Container_Arrival_Date.getAttribute("value");
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
	}


	public void LineNoDetails_CargoStatus_Containerized(String SC_ID,String Description,String ExcelSavePath,String Cargo_Status,
			String Container_No, String Container_Size,String Container_Arrival_Date) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		org.openqa.selenium.support.ui.Select CargoStatus=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_DropDowncargostatus")));
		CargoStatus.selectByVisibleText(Cargo_Status);
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));	
		vd.Enable_ContainerNo=vd.WebEle_Container_No.isEnabled();
		if(vd.Enable_ContainerNo==true)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxEnable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "Container No", driver, ExcelSavePath, vd.StartTime);
	
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
	}
	

	public void LineNoDetails_CargoStatus_Destuffed(String SC_ID,String Description,String ExcelSavePath,String Cargo_Status,
			String Container_No, String Container_Size,String Container_Arrival_Date) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		org.openqa.selenium.support.ui.Select CargoStatus=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_DropDowncargostatus")));
		CargoStatus.selectByVisibleText(Cargo_Status);
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));	
		vd.Enable_ContainerNo=vd.WebEle_Container_No.isEnabled();
		if(vd.Enable_ContainerNo==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxEnable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "Container No", driver, ExcelSavePath, vd.StartTime);
	
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
	
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
		
		driver.findElement(By.id("ctl00_LstSubMenu_ctrl0_lbtidsdttle")).click();
		Thread.sleep(1000);
		WebElement logout_mouseover=driver.findElement(By.id("ctl00_Label4"));
		Actions action=new Actions(driver);
		
		action.moveToElement(logout_mouseover).perform();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_lnkSignout")).click();
		Thread.sleep(1000);
	}

	public void LineNoDetails_ContainerSize(String SC_ID,String Description,String ExcelSavePath,String Cargo_Status,
			String Container_No,String Container_Size) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		org.openqa.selenium.support.ui.Select CargoStatus=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_DropDowncargostatus")));
		CargoStatus.selectByVisibleText(Cargo_Status);
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));
		vd.WebEle_Container_No.sendKeys(Container_No);
		
		vd.WebEle_Container_Size=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtsize")); 	
		vd.WebEle_Container_Size.sendKeys(Container_Size);
		vd.WebEle_Container_Size.sendKeys(Keys.TAB);
		vd.Container_alertMsg=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_Fund9RegularExpressionValidator")).getText();
		
		if(vd.Container_alertMsg.equals("Container Size should be 20 or 40 or 45"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.Alert_handling(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "Container Size should be 20 or 40 or 45", driver, ExcelSavePath, vd.StartTime);
		vd.WebEle_Container_Size.clear();
		vd.WebEle_Container_Size.sendKeys("20");
		vd.WebEle_Container_Size.sendKeys(Keys.TAB);
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
		
	}
	
	public void LineNoDetails_BreakBulk(String SC_ID,String Description,String ExcelSavePath) throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_chkBreakBulk")).click();
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));	
		vd.Enable_ContainerNo=vd.WebEle_Container_No.isEnabled();
		if(vd.Enable_ContainerNo==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxDisable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "Container No", driver, ExcelSavePath, vd.StartTime);
	
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
	}

	
	public void LineNoDetails_AddUpdateDeleteContainersize(String SC_ID,String Description,String ExcelSavePath,String Cargo_Status,
			String Container_No,String Container_Size) throws Exception
	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_chkBreakBulk")).click();
		
		vd.WebEle_Container_No=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno"));
		vd.WebEle_Container_No.sendKeys(Container_No);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Container No","ctl00_hldPage_grdAucLineNo_ctl02_txtcontainerno", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_Container_Size=driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_txtsize")); 	
		vd.WebEle_Container_Size.sendKeys(Container_Size);
		ve.Data_TextBox(SC_ID,Description, vd.Srno++, vd.r++,"Container Size","ctl00_hldPage_grdAucLineNo_ctl02_txtsize", driver, ExcelSavePath, vd.StartTime);
		vd.WebEle_Container_Size.sendKeys(Keys.TAB);
		
		driver.findElement(By.id("ctl00_hldPage_grdAucLineNo_ctl02_btndelete")).click();
		
		driver.findElement(By.id("ctl00_hldPage_chkBreakBulk")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
	}

	
	public void LineNoDetails_LineNoStatus(String SC_ID, String Description, String ExcelSavePath) throws Exception

	{
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		String StatusLineNo=driver.findElement(By.id("ctl00_hldPage_txtlinenostatus")).getAttribute("value");
		
		//System.out.println(StatusLineNo);
		
		if(StatusLineNo.equals("Un-cleared/Un-claimed"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxExpectedText(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Line No Status", "Un-cleared/Un-claimed", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
		
	}
	
	public void LineNoDetails_DetainedByFlag(String SC_ID, String Description, String ExcelSavePath) throws Exception
	{

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_chkDetained")).click();
		
		Select DetainBy=new Select(driver.findElement(By.id("ctl00_hldPage_drpDetained")));
		DetainBy.selectByVisibleText("DRI");
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		Thread.sleep(1000);
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
		vd.Status="FAIL";
		}
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);
		
		
	}
	
	public void LineNoDetails_DetainedByFlag_NotAllowtoEdit(String SC_ID, String Description, String ExcelSavePath) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		General_Methods gm=new General_Methods();
		vd.Detain=gm.isAlertPresent(driver);
		
		if(vd.Detain=true)
		{
			vd.Status="PASS";
			Alert alert=driver.switchTo().alert();
			vd.Detain_alertMsg=driver.switchTo().alert().getText();
			alert.accept();
			
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, vd.Detain_alertMsg, driver, ExcelSavePath, vd.StartTime);
		driver.findElement(By.id("ctl00_LstSubMenu_ctrl0_lbtidsdttle")).click();
		
	}
	
	public void LineNoDetails_SaveWithNonMadatoryDeatils(String SC_ID, String Description, String ExcelSavePath) throws Exception
	{
		driver.findElement(By.id("ctl00_LstSubMenu_ctrl1_lbtidsdttle")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();	
		
		Alert alert=driver.switchTo().alert();
			
		String AlertMessage=alert.getText();
		//System.out.println(AlertMessage);
		if(AlertMessage.contains("- Please enter IGM No."))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter IGM No.", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter IGM Date"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter IGM Date", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter Arrival Date"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter Arrival Date", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter Line No."))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter Line No.", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter Vessel Name"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter Vessel Name", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please select Load Type"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please select Load Type", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter Cargo Description"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter Cargo Description", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter Importer Name"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter Importer Name", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please enter Address Line1"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please enter Address Line1", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		if(AlertMessage.contains("- Please select Cargo Status"))
		{
			vd.Status="PASS";
			ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "- Please select Cargo Status", driver, ExcelSavePath, vd.StartTime);
		}
		else
		{
			vd.Status="FAIL";
		}
		alert.accept();
		driver.close();
	}
		
	public void LineNoDetails_Edit_After_CustomLogin(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(2000);
				
		driver.findElement(By.id("ctl00_hldPage_txtsrch")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionHome_ctl02_lbigmno")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.WebEle_IGM_No=driver.findElement(By.id("ctl00_hldPage_txtigmno"));
		vd.IGM_NO_TextBox=vd.WebEle_IGM_No.isEnabled();
		if(vd.IGM_NO_TextBox==true)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxDisable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "IGM No", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		driver.findElement(By.id("ctl00_LstSubMenu_ctrl0_lbtidsdttle")).click();
		
 	}	
	
	public void LineNoDetails_Edit_From_UCCDashBoard(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(2000);
				
		driver.findElement(By.id("ctl00_hldPage_txtsrch")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionHome_ctl02_lbigmno")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.IGM_NO_TextBox=gm.TryFindElement_id(driver,"ctl00_hldPage_txtigmno");
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		if(vd.IGM_NO_TextBox==true)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.webElement_Present(SC_ID, Description, vd.Srno, vd.r, vd.Status, "IGM No", driver, ExcelSavePath, vd.StartTime);
	}

	public void CFSuser_Redirect_LineNoDetails_To_UCCDashboard(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(2000);
				
		
		driver.findElement(By.id("ctl00_hldPage_btnback")).click();
		
		vd.QuickSearch=gm.TryFindElement_id(driver,"ctl00_hldPage_txtsrch");
		
		if(vd.QuickSearch==true)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.webElement_Present(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Quick Search", driver, ExcelSavePath, vd.StartTime);
	
		//driver.findElement(By.id("ctl00_LstSubMenu_ctrl0_lbtidsdttle")).click();
	}

	public void LineNoDetails_CustomEdit(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_txtCuHome")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_GridCuHome_ctl02_lbIGMNo")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_chkDetained")).click();
		
		vd.Detain_dropdown=gm.TryFindElement_id(driver, "ctl00_hldPage_drpDetained");
		if(vd.Detain==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.webElement_absent(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Detain Dropdown", driver, ExcelSavePath, vd.StartTime);
		
		vd.WebEle_IGM_No=driver.findElement(By.id("ctl00_hldPage_txtigmno"));
		vd.IGM_NO_TextBox=vd.WebEle_IGM_No.isEnabled();
		if(vd.IGM_NO_TextBox==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxDisable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "IGM No", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		vd.Save_Message=driver.findElement(By.id("ctl00_hldPage_DivMessage")).getText();
		
		if(vd.Save_Message.equals("Record Updated Successfully"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
		
	}
	
	public void LineNoDetails_CustomOnlyView(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_txtCuHome")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_GridCuHome_ctl02_lbIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
	
		vd.WebEle_IGM_No=driver.findElement(By.id("ctl00_hldPage_txtfilename"));
		vd.IGM_NO_TextBox=vd.WebEle_IGM_No.isEnabled();
		if(vd.IGM_NO_TextBox==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxDisable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "File Name", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();
		
		
	}
	
	public void CUSTOMuser_Redirect_LineNoDetails_To_UCCDashboard(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(2000);
				
		
		driver.findElement(By.id("ctl00_hldPage_btnback")).click();    
		
		vd.QuickSearch=gm.TryFindElement_id(driver,"ctl00_hldPage_txtCuHome");
		
		if(vd.QuickSearch==true)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.webElement_Present(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Quick Search", driver, ExcelSavePath, vd.StartTime);
	
	
	}
	
	public void LineNoDetails_GroupOnlyView(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='ctl00_hldPage_txtnoccudash']")).sendKeys(IGM_No);;
		
		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.WebEle_IGM_No=driver.findElement(By.id("ctl00_hldPage_txtigmno"));
		vd.IGM_NO_TextBox=vd.WebEle_IGM_No.isEnabled();
		if(vd.IGM_NO_TextBox==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.TextBoxDisable(SC_ID, Description,vd.Srno++, vd.r++, vd.Status, "IGM No", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenext")).click();
		
		Thread.sleep(1000);
		
		WebElement logout_mouseover=driver.findElement(By.id("ctl00_Label4"));
		Actions action=new Actions(driver);
		
		action.moveToElement(logout_mouseover).perform();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_lnkSignout")).click();
		Thread.sleep(1000);
			
	}
	
	public void LND_CustomUser_OnlyView_LND_NOCDashboard(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'NOC DashBoard')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtNOCCuGroup")).sendKeys(IGM_No);
		
		driver.findElement(By.id("ctl00_hldPage_Button1")).click();
		
		driver.findElement(By.id("ctl00_hldPage_NocCuGroup_ctl02_LbIGMNo")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]")).click();;
	
		Thread.sleep(2000);	
		vd.WebElement_PreAbs=gm.TryFindElement_id(driver, "ctl00_hldPage_btnedit");
		
		if(vd.WebElement_PreAbs==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.webElement_absent(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Edit Button", driver, ExcelSavePath, vd.StartTime);
	
	}
	
	public void LND_CustomUser_Redirect_LND_To_NOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnback")).click();
		
		 Thread.sleep(1000);
			
	     vd.QuickSearch=gm.TryFindElement_id(driver,"ctl00_hldPage_txtNOCCuGroup");
			
		 if(vd.QuickSearch==true)
		 {
		 	vd.Status="PASS";
		 }
		 else
		 {
			vd.Status="FAIL";
		 }
		 ve.webElement_Present(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Quick Search", driver, ExcelSavePath, vd.StartTime);		
	}
	
	public void LND_CustomUser_OnlyView_LND_GroupNOCDashboard(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Group NOC DashBoard')]")).click();
		
//		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
//		
//		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'Line No. Details')]"));
	
		Thread.sleep(2000);	
		
		driver.findElement(By.xpath(".//*[@id='tabs']/ul/li[4]/a")).click();
		vd.WebElement_PreAbs=gm.TryFindElement_id(driver, "ctl00_hldPage_btnedit");
		
		if(vd.WebElement_PreAbs==false)
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.webElement_absent(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Edit Button", driver, ExcelSavePath, vd.StartTime);
	
	}
	
	public void LND_CustomUser_Redirect_LND_To_GroupNOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnback")).click();
		
		 Thread.sleep(1000);
			
	     vd.QuickSearch=gm.TryFindElement_id(driver,"ctl00_hldPage_txtnoccudash");
			
		 if(vd.QuickSearch==true)
		 {
		 	vd.Status="PASS";
		 }
		 else
		 {
			vd.Status="FAIL";
		 }
		 ve.webElement_Present(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Quick Search", driver, ExcelSavePath, vd.StartTime);		
	}
	
	public void Logout() throws Exception
	{
		Thread.sleep(1000);
		WebElement logout_mouseover=driver.findElement(By.id("ctl00_Label4"));
		Actions action=new Actions(driver);
		
		action.moveToElement(logout_mouseover).perform();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_lnkSignout")).click();
		Thread.sleep(1000);
	}

}
