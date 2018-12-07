package SeleniumTraning;

import java.io.IOException;

public class ExcelPractiseTwo {

	public static void main(String[] args) throws IOException {
		
		ExcelPractiseone excelpath=new ExcelPractiseone("C:\\Users\\shubhava\\Desktop\\Automation Sanity\\Selenium\\Book2.xlsx");
		System.out.println(excelpath.getdata(0, 1, 0));
		

	}

}
