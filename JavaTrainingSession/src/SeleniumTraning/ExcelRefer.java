package SeleniumTraning;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRefer {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public  ExcelRefer(String excelpath) {/// Method with same class name is called constructor.
		
		try 
		{
			File src=new File(excelpath);
			FileInputStream File = new FileInputStream(src);
			wb=new XSSFWorkbook(File);		
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			
		}
		
		}
	
	public String getData(int sheetnumber,int row,int column) 
		{
		
		sheet=wb.getSheetAt(sheetnumber);
		String data=sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
		}
	
	
		}
