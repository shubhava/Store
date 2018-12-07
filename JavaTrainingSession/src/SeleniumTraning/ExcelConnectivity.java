package SeleniumTraning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectivity {

	public static void main(String[] args) throws IOException {
		
	File src=new File("C:\\Users\\shubhava\\Desktop\\Automation Sanity\\Selenium\\Book2.xlsx");
	//Create Input file stream Object
	FileInputStream file=new FileInputStream(src);
	
	
	//Get MAIN Sheet from Workbook
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
	//Note to Read XLS File,an HSSF Implmentation is provided by POI
	
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	String Data= sheet1.getRow(0).getCell(0).getStringCellValue();
	String Data1= sheet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("Data from Excel"+Data+"-"+Data1);
	wb.close();
	 
	 
		

	}

}
