package com.reusable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.TestBase.DriverFactory4;
import com.TestBase.TestBase4;

public class Utility extends TestBase4 {
	
	public static Workbook book;
	public static Sheet sheet;
	
	public static String takeScreenshot(String methodName) {
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework4\\Screenshots\\"+methodName+".png";
		TakesScreenshot scn=(TakesScreenshot)DriverFactory4.getInstance().getDriver();
		File file=scn.getScreenshotAs(OutputType.FILE);
		File fil=new File(path);
		try {
			FileUtils.copyFile(file, fil);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return path;
	}
	
	
	public static void windowHandle() {
		String mainWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		Iterator itr=allWindows.iterator();
		while(itr.hasNext()) {
			String child=(String) itr.next();
			driver.switchTo().window(child);
			if(!child.equalsIgnoreCase(mainWindow)) {
				
			}
		}
	}
	
	public static void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
	}
	
	public static Object[][] getTestData(String sheetName) {
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework4\\src\\main\\java\\com\\TestData\\testdata.xlsx";
		File file=new File(path);
		try {
			FileInputStream fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book=new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sheet=book.getSheet(sheetName);
		Object [][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	}

}
