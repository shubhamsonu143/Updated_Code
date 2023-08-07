package org.excel.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtils {

	static ReadExcel reader;

	public static ArrayList<Object[]> getDataFromexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			String Excel_Name = "C:\\Users\\m1077\\SFL_TESTING\\revampedfd3.0.xlsx";
			reader = new ReadExcel(Excel_Name);
			System.out.println(Excel_Name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			String mobile = reader.getCellData("Sheet1", "mobile", rowNum);
			String pincode = reader.getCellData("Sheet1", "pincode", rowNum);
			String otp_code = reader.getCellData("Sheet1", "otp_code", rowNum);
			String investAmount = reader.getCellData("Sheet1", "investAmount", rowNum);
			String choosepayout = reader.getCellData("Sheet1", "choosepayout", rowNum);
			String PAN_No = reader.getCellData("Sheet1", "PAN_No", rowNum);
			String FName = reader.getCellData("Sheet1", "FName", rowNum);
			String LName = reader.getCellData("Sheet1", "LName", rowNum);
			String Email = reader.getCellData("Sheet1", "Email", rowNum);
			String DocumentNo = reader.getCellData("Sheet1", "DocumentNo", rowNum);
			String frontimg = reader.getCellData("Sheet1", "frontimg", rowNum);
			String backimg = reader.getCellData("Sheet1", "backimg", rowNum);
			String investorphoto = reader.getCellData("Sheet1", "investorphoto", rowNum);
			String address1 = reader.getCellData("Sheet1", "address1", rowNum);
			String address2 = reader.getCellData("Sheet1", "address2", rowNum);
			String accNo = reader.getCellData("Sheet1", "accNo", rowNum);
			String confirmacc = reader.getCellData("Sheet1", "confirmacc", rowNum);
			String ifscode = reader.getCellData("Sheet1", "ifscode", rowNum);
			String accountType = reader.getCellData("Sheet1", "accountType", rowNum);
			String accName = reader.getCellData("Sheet1", "accName", rowNum);
			String cheque = reader.getCellData("Sheet1", "cheque", rowNum);
			String OccupationType = reader.getCellData("Sheet1", "OccupationType", rowNum);
			String maritalstatus = reader.getCellData("Sheet1", "maritalstatus", rowNum);
			String fathername = reader.getCellData("Sheet1", "fathername", rowNum);
//			

			Object ob[] = { INDEX, mobile, pincode, otp_code, investAmount, choosepayout, PAN_No, FName, LName, Email,
					DocumentNo, frontimg, backimg, investorphoto, address1, address2, accNo, confirmacc, ifscode,
					accountType, accName, cheque, OccupationType, maritalstatus, fathername };
			myData.add(ob);
		}
		return myData;

	}

	public static void writeinexcel(String value, int INDEX) throws Exception {
		Thread.sleep(2000);
		File fis = new File("C:\\Users\\m1077\\SFL_TESTING\\revampedfd3.0.xlsx");
//        String arr[]="https://www.google.com";
//        ArrayList<String> cars = new ArrayList<String>(fis);
		FileInputStream excelloc = new FileInputStream(fis);
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(2);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

	public static void writeinexcel2(String value, int INDEX) throws Exception {
		Thread.sleep(2000);
		File fis = new File("C:\\Users\\m1077\\SFL_TESTING\\revampedfd3.0.xlsx");
//        String arr[]="https://www.google.com";
//        ArrayList<String> cars = new ArrayList<String>(fis);
		FileInputStream excelloc = new FileInputStream(fis);
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(3);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

	public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
		Thread.sleep(2000);
		File fis = new File("C:\\Users\\m1077\\SFL_TESTING\\revampedfd3.0.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(46);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

}
