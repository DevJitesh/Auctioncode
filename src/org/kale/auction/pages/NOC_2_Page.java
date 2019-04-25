package org.kale.auction.pages;

import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.General_Methods;
import org.kale.auction.utils.Validate_Elements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NOC_2_Page 
{
WebDriver driver;
	
	Variables_Declaration vd=new Variables_Declaration();
	General_Methods gm=new General_Methods();
	Validate_Elements ve=new Validate_Elements();
	
	public NOC_2_Page(WebDriver dr)
	{
		driver=dr;
	}
	
	public void NOC2_Save_After_60_Days_GeneralCargo(String SC_ID,String Description,String ExcelSavePath, String Notice1_UploadFilePath,String N2_Sent_Date,String File_Name, 
			String Remarks,String N2_Importer_Reply_Date,String Importer_remark) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_fileupload2")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnNotice2Upload")).click();
		
		driver.findElement(By.id("ctl00_hldPage_TextBox2")).sendKeys(N2_Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtfilenamenotice2")).sendKeys(File_Name);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"File _Name", "ctl00_hldPage_txtfilename", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtremarknotice2")).sendKeys(Remarks);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Remark", "ctl00_hldPage_txtremarknotice1", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtyimporterreplydate2")).sendKeys(N2_Importer_Reply_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer Reply Date", "ctl00_hldPage_txtimporterreplydate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtimporterremark2")).sendKeys(Importer_remark);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer remark", "ctl00_hldPage_txtimporterremark", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_fuctnotic2rply")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnUploadnotice2reply")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice2")).click();	
		
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
	
	public void NOC2_Save_Abandon_GeneralCargo(String SC_ID,String Description,String ExcelSavePath, String Notice1_UploadFilePath,String N2_Sent_Date,String File_Name, 
			String Remarks,String N2_Importer_Reply_Date,String Importer_remark) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_fileupload2")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnNotice2Upload")).click();
		
		driver.findElement(By.id("ctl00_hldPage_TextBox2")).sendKeys(N2_Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtfilenamenotice2")).sendKeys(File_Name);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"File _Name", "ctl00_hldPage_txtfilename", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtremarknotice2")).sendKeys(Remarks);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Remark", "ctl00_hldPage_txtremarknotice1", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_chkabandonNotice2")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtyimporterreplydate2")).sendKeys(N2_Importer_Reply_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer Reply Date", "ctl00_hldPage_txtimporterreplydate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtimporterremark2")).sendKeys(Importer_remark);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer remark", "ctl00_hldPage_txtimporterremark", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_fuctnotic2rply")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnUploadnotice2reply")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice2")).click();	
		
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
	
	public void Before_30Days_Notice_2_NotPossible(String SC_ID,String Description,String ExcelSavePath,
			String N2_Sent_Date,String N2_trial_Sent_Date) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Notice 2 (60 Days)')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.N2_WESent_Date=driver.findElement(By.id("ctl00_hldPage_TextBox2"));	     vd.N2_WESent_Date.clear();       vd.N2_WESent_Date.sendKeys(N2_trial_Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice2")).click();		
	
		Alert alert=driver.switchTo().alert();
		vd.NOC1_Alert_Message=alert.getText();
		
		if(vd.NOC1_Alert_Message.equals("Notice 2 can be sent only after 30 days from Notice 1 Sent date"))
		{
			vd.Status="PASS";
			alert.accept();
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Notice 2 can be sent only after 30 days from Notice 1 Sent date",
				driver, ExcelSavePath, vd.StartTime);
		
		vd.N2_WESent_Date=driver.findElement(By.id("ctl00_hldPage_TextBox2"));	     vd.N2_WESent_Date.clear();       vd.N2_WESent_Date.sendKeys(N2_Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice2")).click();
		
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
	
	public void Redirect_NOC2_to_UCCDashboard(String SC_ID,String Description,String ExcelSavePath) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Notice 2 (60 Days)')]")).click();
		
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
		
	}
	
	public void NOC2_For_Perishable_NOC2_NotRequirred(String SC_ID,String Description,String ExcelSavePath) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		Alert alert=driver.switchTo().alert();
		vd.NOC1_Alert_Message=alert.getText();
		
		if(vd.NOC1_Alert_Message.equals("Notice 2 not Required"))
		{
			vd.Status="PASS";
			alert.accept();
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Notice 2 not Required",
				driver, ExcelSavePath, vd.StartTime);		
	}
	
	public void NOC2_CustomOnlyView_From_UCCDashboard(String SC_ID, String Description, String ExcelSavePath,
			String IGM_No) throws Exception 
	{
		driver.findElement(By.id("ctl00_hldPage_txtCuHome")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_GridCuHome_ctl02_lbIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 2 (60 Days)')]")).click();
	
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
	
	public void NOC2_CustomUser_Redirect_Notice02_To_UCCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
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
	
	public void NOC2_CustomUser_OnlyViewNotice02_From_NOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'NOC DashBoard')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtNOCCuGroup")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_Button1")).click();
		
		driver.findElement(By.id("ctl00_hldPage_NocCuGroup_ctl02_LbIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 2 (60 Days)')]")).click();
	
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
	
	public void NOC2_CustomUser_Redirect_Notice02_To_NOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnback")).click();
		
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
	
	public void Notice2_GroupUser_OnlyView_Notice2_GroupNOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
//		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
//		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 2 (60 Days)')]")).click();
	
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
	
	public void NOC2_GroupUser_Redirect_Notice02_To_GroupNOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnback")).click();
		
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
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_lnkSignout")).click();
		Thread.sleep(1000);
	}

	
}
