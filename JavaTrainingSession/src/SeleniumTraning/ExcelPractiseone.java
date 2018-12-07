package SeleniumTraning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractiseone {

	XSSFWorkbook wb;
	XSSFSheet Sheet;
	

	public ExcelPractiseone(String excelpath) throws IOException 
	{
		
		File sv=new File(excelpath);
		FileInputStream File=new FileInputStream(sv);
		wb=new XSSFWorkbook(File);
		
	}
	
	public String getdata(int sheetnumber,int row,int column)
	{
	
		Sheet=wb.getSheetAt(sheetnumber);
		String data=Sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
		
		
	}
	
	
	
}
