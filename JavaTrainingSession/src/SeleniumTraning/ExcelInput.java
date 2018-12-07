package SeleniumTraning;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelInput {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		File sv=new File("C:\\Users\\shubhava\\Desktop\\Automation Sanity\\Selenium\\Sheet 1.xlsx");
		
		XSSFWorkbook wbb=new XSSFWorkbook(sv);
		
		XSSFSheet sh= wbb.getSheetAt(0);
		
		int RowLength= sh.getLastRowNum();
		System.out.println("last Row Num"+RowLength);
		for (int k=0;k<=RowLength;k++)
		{	
		int LastCell=sh.getRow(k).getLastCellNum();
		System.out.println("Last Column Num"+LastCell);
		for(int i=0;i<LastCell;i++)
		{
		String Data=sh.getRow(k).getCell(i).getStringCellValue();
		System.out.println("The Value of Cell is"+Data);
		
		}

		}
	}

}
