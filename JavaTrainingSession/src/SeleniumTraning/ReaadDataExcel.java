package SeleniumTraning;

public class ReaadDataExcel {

	public static void main(String[] args) {
	
		ExcelRefer excelpath;//here we have declared a Variable for Class ExcelRefer
		
		excelpath=new ExcelRefer("C:\\Users\\shubhava\\Desktop\\Automation Sanity\\Selenium\\Book2.xlsx");//(Here we have assigned an object to Variable
		System.out.println(excelpath.getData(1, 0, 1));
		
					
				
	}

}
