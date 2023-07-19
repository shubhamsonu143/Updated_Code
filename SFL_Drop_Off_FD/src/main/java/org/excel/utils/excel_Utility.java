package org.excel.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel_Utility {

	static Read_Excel reader;

	public static ArrayList<Object[]> getDataFromexcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			String s = "C:\\Users\\m1077\\GIT_HUB\\SFL_TESTING\\SFL_Drop_Off_FD\\src\\main\\java\\Documents\\FDTestData.xlsx";
			System.out.println(s);
			reader = new Read_Excel(s);

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

			String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
			String mobile = reader.getCellData("Sheet1", "mobile", rowNum);
			String pincode = reader.getCellData("Sheet1", "pincode", rowNum);
			String otp_code = reader.getCellData("Sheet1", "otp_code", rowNum);
			String pan = reader.getCellData("Sheet1", "pan", rowNum);
			String email = reader.getCellData("Sheet1", "email", rowNum);
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

			Object ob[] = { INDEX, mobile, pincode, otp_code, pan, email, DocumentNo, frontimg, backimg, investorphoto,
					address1, address2, accNo, confirmacc, ifscode, accountType, accName, cheque, OccupationType,
					maritalstatus, fathername };
			myData.add(ob);
		}
		return myData;

	}

	public static void writeinexcel(String value, int INDEX) throws Exception {
		System.out.println("XCEL WRITING");
		File fis = new File("C:\\Users\\m1077\\GIT_HUB\\SFL_TESTING\\SFL_Drop_Off_FD\\src\\main\\java\\Documents\\FDTestData.xlsx");
		FileInputStream excelloc = new FileInputStream(fis);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(excelloc);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow row = s.getRow(INDEX);
		XSSFCell c = row.createCell(14);
		c.setCellValue(value);
		FileOutputStream out = new FileOutputStream(fis);
		wb.write(out);
		out.close();
	}

}
