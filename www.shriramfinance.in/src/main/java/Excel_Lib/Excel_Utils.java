package Excel_Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utils {
	
	static Read_Excel reader;

	public static ArrayList<Object[]> getDataFromexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			String s = "Test_Datas\\SFL_Automation.xlsx";
			System.out.println(s);
			reader = new Read_Excel(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

			Object ob[] = {};
			myData.add(ob);
		}
		return myData;

	}

	public static ArrayList<Object[]> getDataFromTWexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			String s = "TestDatas\\TW_TestData.xlsx";
			System.out.println(s);
			reader = new Read_Excel(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			
			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			
			String tw_cus_mobile = reader.getCellData("Sheet1", "tw_cus_mobile", rowNum);
			
			String tw_input_field = reader.getCellData("Sheet1", "tw_input_field", rowNum);
			
			String tw_residence_pincode = reader.getCellData("Sheet1", "tw_residence_pincode", rowNum);
			
			String tw_pan_number = reader.getCellData("Sheet1", "tw_pan_number", rowNum);
			
			String tw_father_name = reader.getCellData("Sheet1", "tw_father_name", rowNum);
			
			String tw_cust_email = reader.getCellData("Sheet1", "tw_cust_email", rowNum);
			
			

			Object ob[] = {INDEX,tw_cus_mobile,tw_input_field,tw_residence_pincode,tw_pan_number,tw_father_name,tw_cust_email};
			myData.add(ob);
		}
		return myData;

	}
	public static void writeinexcelTW(String value, int INDEX) throws Exception {
		File fis = new File("TestDatas\\TW_TestData.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(20);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}
	
	public static void writeinexcel(String value, int INDEX) throws Exception {
		File fis = new File("Test_Datas\\SFL_Automation.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(78);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

	public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
		File fis = new File("Test_Datas\\SFL_Automation.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(79);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

	

}
