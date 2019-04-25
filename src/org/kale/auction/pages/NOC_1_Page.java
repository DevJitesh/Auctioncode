package org.kale.auction.pages;

import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.General_Methods;
import org.kale.auction.utils.Validate_Elements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NOC_1_Page 
{
WebDriver driver;
	
	Variables_Declaration vd=new Variables_Declaration();
	General_Methods gm=new General_Methods();
	Validate_Elements ve=new Validate_Elements();
	
	public NOC_1_Page(WebDriver dr)
	{
		driver=dr;
	}
	
	public void NOC1_Save(String SC_ID,String Description,String ExcelSavePath, String Notice1_UploadFilePath,String Sent_Date,String File_Name, 
			String Remarks,String Importer_Reply_Date,String Importer_remark) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_fileupload1")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnNotice1Upload")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtsentdate")).sendKeys(Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtfilename")).sendKeys(File_Name);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"File _Name", "ctl00_hldPage_txtfilename", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtremarknotice1")).sendKeys(Remarks);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Remark", "ctl00_hldPage_txtremarknotice1", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtimporterreplydate")).sendKeys(Importer_Reply_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer Reply Date", "ctl00_hldPage_txtimporterreplydate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_txtimporterremark")).sendKeys(Importer_remark);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer remark", "ctl00_hldPage_txtimporterremark", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_fctup_reply")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnUploadImpReplyNotice1")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();	
		
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
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status,"Record Updated Successfully", driver, ExcelSavePath, vd.StartTime);	
		
	}
	
	public void NOC1_Save_Abandon(String SC_ID,String Description,String ExcelSavePath, String Notice1_UploadFilePath,String Sent_Date,String File_Name, 
			String Remarks,String Importer_Reply_Date,String Importer_remark) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_fileupload1")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnNotice1Upload")).click();
		
		vd.WESent_Date=driver.findElement(By.id("ctl00_hldPage_txtsentdate"));	            vd.WESent_Date.sendKeys(Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WEFile_Name=driver.findElement(By.id("ctl00_hldPage_txtfilename"));				vd.WEFile_Name.sendKeys(File_Name);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"File _Name", "ctl00_hldPage_txtfilename", driver, ExcelSavePath, vd.StartTime);
		
		vd.WERemarks=driver.findElement(By.id("ctl00_hldPage_txtremarknotice1"));			vd.WERemarks.sendKeys(Remarks);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Remark", "ctl00_hldPage_txtremarknotice1", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_chkNotic1abdnonflag")).click();
		
		vd.WEImporter_Reply_Date=driver.findElement(By.id("ctl00_hldPage_txtimporterreplydate"));	vd.WEImporter_Reply_Date.sendKeys(Importer_Reply_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer Reply Date", "ctl00_hldPage_txtimporterreplydate", driver, ExcelSavePath, vd.StartTime);
		
		vd.WEImporter_remark=driver.findElement(By.id("ctl00_hldPage_txtimporterremark"));			vd.WEImporter_remark.sendKeys(Importer_remark);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Importer remark", "ctl00_hldPage_txtimporterremark", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_fctup_reply")).sendKeys(Notice1_UploadFilePath);
		
		driver.findElement(By.id("ctl00_hldPage_btnUploadImpReplyNotice1")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();
		
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
	
	public void NOC1_Save_Before30Days_NotAllow(String SC_ID,String Description,String ExcelSavePath,
			String Sent_Date,String trial_Sent_Date) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.WESent_Date=driver.findElement(By.id("ctl00_hldPage_txtsentdate"));	     vd.WESent_Date.clear();       vd.WESent_Date.sendKeys(trial_Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();		
	
		Alert alert=driver.switchTo().alert();
		vd.NOC1_Alert_Message=alert.getText();
		
		if(vd.NOC1_Alert_Message.equals("Notice 1 can be sent only after 30 days from Container Arrival date"))
		{
			vd.Status="PASS";
			alert.accept();
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Notice 1 can be sent only after 30 days from Container Arrival date",
				driver, ExcelSavePath, vd.StartTime);
		
		vd.WESent_Date=driver.findElement(By.id("ctl00_hldPage_txtsentdate"));	     vd.WESent_Date.clear();       vd.WESent_Date.sendKeys(Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();
		
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
	
	public void NOC1_SaveNOC1_PerishableCargo_Before_7_Days(String SC_ID,String Description,String ExcelSavePath,
			String Sent_Date,String trial_Sent_Date) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.WESent_Date=driver.findElement(By.id("ctl00_hldPage_txtsentdate"));	     vd.WESent_Date.clear();       vd.WESent_Date.sendKeys(trial_Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();		
	
		Alert alert=driver.switchTo().alert();
		vd.NOC1_Alert_Message=alert.getText();
		
		if(vd.NOC1_Alert_Message.equals("Notice 1 can be sent only after 7 days from Container Arrival date"))
		{
			vd.Status="PASS";
			alert.accept();
		}
		else
		{
			vd.Status="FAIL";
		}
		ve.Alert_handling(SC_ID, Description, vd.Srno, vd.r, vd.Status, "Notice 1 can be sent only after 7 days from Container Arrival date",
				driver, ExcelSavePath, vd.StartTime);
		
		vd.WESent_Date=driver.findElement(By.id("ctl00_hldPage_txtsentdate"));	     vd.WESent_Date.clear();       vd.WESent_Date.sendKeys(Sent_Date);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"Sent_ Date", "ctl00_hldPage_txtsentdate", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();
		
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
	
	public void NOC1_Edit(String SC_ID,String Description,String ExcelSavePath,String File_Name) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		vd.WEFile_Name=driver.findElement(By.id("ctl00_hldPage_txtfilename"));		vd.WEFile_Name.clear();		vd.WEFile_Name.sendKeys(File_Name);
		ve.Data_TextBox(SC_ID, Description, vd.Srno, vd.r,"File _Name", "ctl00_hldPage_txtfilename", driver, ExcelSavePath, vd.StartTime);
		
		driver.findElement(By.id("ctl00_hldPage_btnsavenextnotice1")).click();
		
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
	
	public void NOC1_Redirect_NOC1_to_UCCDashboard(String SC_ID,String Description,String ExcelSavePath) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
		
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
	
	public void NOC1_CustomUser_OnlyView_NOC1_UCCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.id("ctl00_hldPage_txtCuHome")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_GridCuHome_ctl02_lbIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
	
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
	
	public void NOC1_CustomUser_Redirect_Notice01_To_UCCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
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
	
	public void NOC1_CustomUser_OnlyViewNotice01_From_NOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'NOC DashBoard')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtNOCCuGroup")).sendKeys(IGM_No);
		driver.findElement(By.id("ctl00_hldPage_Button1")).click();
		
		driver.findElement(By.id("ctl00_hldPage_NocCuGroup_ctl02_LbIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
	
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
	
	public void NOC1_CustomUser_Redirect_Notice01_To_NOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
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
	
	public void Notice1_GroupUser_OnlyView_Notice1_GroupNOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
	{
//		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
//		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[contains(.,'Notice 1 (30 Days)')]")).click();
	
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
	
	public void NOC1_GroupUser_Redirect_Notice01_To_GroupNOCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
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
