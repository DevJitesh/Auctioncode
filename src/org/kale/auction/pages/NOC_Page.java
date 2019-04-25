package org.kale.auction.pages;

import org.kale.auction.sdk.Variables_Declaration;
import org.kale.auction.utils.General_Methods;
import org.kale.auction.utils.Validate_Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NOC_Page 
{
	WebDriver driver;	
	Variables_Declaration vd=new Variables_Declaration();
	General_Methods gm=new General_Methods();
	Validate_Elements ve=new Validate_Elements();
	
	public NOC_Page(WebDriver dr)
	{
		driver=dr;
	}
	
	public void CFS_Login_SubmitNOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(1000);
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnsubmit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtsrch")).sendKeys(IGM_No);
		
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		Thread.sleep(1000);
		
		Actions NOCStatus = new Actions(driver);
    	WebElement WEB_NOCStatus = driver.findElement(By.id("ctl00_hldPage_grdAuctionHome_ctl02_ImgNOC"));
    	Thread.sleep(2000);
    	NOCStatus.clickAndHold(WEB_NOCStatus).perform();
    	Thread.sleep(1000);
    	String NOC_Status = WEB_NOCStatus.getAttribute("title");
    	
    	if(NOC_Status.equals("NOC Requested"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
    	
    	driver.findElement(By.id("ctl00_hldPage_txtsrch")).click();
    	
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status, "NOC Requested", driver, ExcelSavePath, vd.StartTime);			
	}		
	
	public void Custom_Login_NOC_Reject(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		driver.findElement(By.xpath("//a[contains(.,'NOC DashBoard')]")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtNOCCuGroup")).sendKeys(IGM_No);
		
		driver.findElement(By.id("ctl00_hldPage_Button1")).click();
		
		driver.findElement(By.id("ctl00_hldPage_NocCuGroup_ctl02_LbIGMNo")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnCusReject")).click();
		
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
	
	public void CFS_Login_RevokeNOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	{
		Thread.sleep(1000);
		
//		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
//		
//		driver.findElement(By.id("ctl00_hldPage_btnsubmit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_txtsrch")).sendKeys(IGM_No);
		
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		
		driver.findElement(By.id("ctl00_hldPage_grdAuctionHome_ctl02_lbigmno")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'NOC')]")).click();
    	
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		
		driver.findElement(By.id("ctl00_hldPage_btnrevoke")).click();
		
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
	
		driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		driver.findElement(By.id("ctl00_hldPage_btnsubmit")).click();
	}
	
	 public void NOC_CustomLogin_Accessing_Group(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.xpath("//a[contains(.,'NOC DashBoard')]")).click();
			
		 driver.findElement(By.id("ctl00_hldPage_txtNOCCuGroup")).sendKeys(IGM_No);
			
		 driver.findElement(By.id("ctl00_hldPage_Button1")).click();
			
		 driver.findElement(By.id("ctl00_hldPage_NocCuGroup_ctl02_LbIGMNo")).click();
			
		 driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		 org.openqa.selenium.support.ui.Select load=new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("ctl00_hldPage_GridAssesingDetail_ctl02_DropDownGname")));
		 load.selectByVisibleText("GROUP01");
		 
		 driver.findElement(By.id("ctl00_hldPage_btnAssignGrp")).click();
		 
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
	
	 public void NOC_CustomLogin_HOLD_NOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnCusHoldCustom")).click();
		 
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
	 
	 public void NOC_CustomLogin_ACCEPT_NOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnCusAccept")).click();
		 
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
	 
	 public void NOC_CustomLogin_Redirect_NOCDashboard_To_NOCDetails(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
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
	 
	 
	 public void NOC_CustomOnlyView_NOCDetails_FromUCCDashboard(String SC_ID, String Description, String ExcelSavePath,String IGM_No) throws Exception
		{
		 	driver.findElement(By.xpath("//a[contains(.,'UCC DashBoard')]")).click();
		 	Thread.sleep(1000);	
		 	
			driver.findElement(By.id("ctl00_hldPage_txtCuHome")).sendKeys(IGM_No);
			driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
						
			driver.findElement(By.id("ctl00_hldPage_GridCuHome_ctl02_lbIGMNo")).click();
			
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
			
	 public void NOC_CustomLogin_Redirect_UCCDashboard_From_NOCDetails(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 	Thread.sleep(1000);
		 	

			
			Thread.sleep(1000);
			
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
	 
	 public void NOC_GroupLogin_HOLD_NOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		 
		 driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		 driver.findElement(By.id("ctl00_hldPage_btnHold")).click();
		 
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
		
		driver.findElement(By.id("ctl00_hldPage_btnback")).click(); 
		 
		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		Thread.sleep(1000);
		
		Actions NOCStatus = new Actions(driver);
    	WebElement WEB_NOCStatus = driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_ImgGrpStatus"));
    	Thread.sleep(2000);
    	NOCStatus.clickAndHold(WEB_NOCStatus).perform();
    	Thread.sleep(1000);
    	String NOC_Status = WEB_NOCStatus.getAttribute("title");
    	
    	if(NOC_Status.equals("NOC Hold"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
    	driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).click();
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status, "NOC Hold", driver, ExcelSavePath, vd.StartTime);			
			
		 
	 }
	 
	 public void NOC_GroupUser_REJECT_NOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		 
		 driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		 driver.findElement(By.id("ctl00_hldPage_btnReject")).click();
		 
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
		
		driver.findElement(By.id("ctl00_hldPage_btnback")).click(); 
		 
		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		Thread.sleep(1000);
		
		Actions NOCStatus = new Actions(driver);
    	WebElement WEB_NOCStatus = driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_ImgGrpStatus"));
    	Thread.sleep(2000);
    	NOCStatus.clickAndHold(WEB_NOCStatus).perform();
    	Thread.sleep(1000);
    	String NOC_Status = WEB_NOCStatus.getAttribute("title");
    	
    	if(NOC_Status.equals("NOC Rejected"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
    	driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).click();
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status, "NOC Rejected", driver, ExcelSavePath, vd.StartTime);			
			
		 
	 }
	
	 public void NOC_GroupUser_ACCEPT_NOC_Request(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		 
		 driver.findElement(By.id("ctl00_hldPage_btnedit")).click();
		 
		 driver.findElement(By.id("ctl00_hldPage_btnAccept")).click();
		 
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
		
		 driver.findElement(By.id("ctl00_hldPage_btnback")).click(); 
		 
		 driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		 Thread.sleep(1000);
		
		 Actions NOCStatus = new Actions(driver);
		 WebElement WEB_NOCStatus = driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_ImgGrpStatus"));
		 Thread.sleep(2000);
		 NOCStatus.clickAndHold(WEB_NOCStatus).perform();
		 Thread.sleep(1000);
    	 String NOC_Status = WEB_NOCStatus.getAttribute("title");
    	
    	if(NOC_Status.equals("NOC Accepted"))
		{
			vd.Status="PASS";
		}
		else
		{
			vd.Status="FAIL";
		}
		driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).click();
		
		ve.Message(SC_ID, Description, vd.Srno, vd.r, vd.Status, "NOC Accepted", driver, ExcelSavePath, vd.StartTime);			
	 }
	 
	 public void NOC_GroupUser_Redirect_NOCDetails_To_GroupNOCDashboard(String SC_ID,String Description,String ExcelSavePath,String IGM_No) throws Exception
	 {
		 driver.findElement(By.id("ctl00_hldPage_txtnoccudash")).sendKeys(IGM_No);
		 
		 driver.findElement(By.id("ctl00_hldPage_btnSrch")).click();
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("ctl00_hldPage_grdAuctionNOCHome_ctl02_lblIGMNo")).click();
		 
		 
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
//			Thread.sleep(1000);
			WebElement LogBtn=driver.findElement(By.id("ctl00_lnkSignout"));
			LogBtn.click();
		}
}
