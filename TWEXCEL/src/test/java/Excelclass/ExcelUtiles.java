package Excelclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtiles {

	 static ExcelReader reader;

	    public static ArrayList<Object[]> getDataFromexcel() {
	        ArrayList<Object[]> myData = new ArrayList<Object[]>();
	        try {

	            String s="C:\\Users\\v802\\eclipse-workspace\\TWEXCEL\\Data1\\excel1.xlsx";
	            reader = new ExcelReader(s);
	            System.out.println(s);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

	           
	            String mobNo = reader.getCellData("Sheet1", "mobNo", rowNum);
	            String otp1 = reader.getCellData("Sheet1", "otp1", rowNum);
	            String otp2 = reader.getCellData("Sheet1", "otp2", rowNum);
	            String otp3 = reader.getCellData("Sheet1", "otp3", rowNum);
	            String otp4 = reader.getCellData("Sheet1", "otp4", rowNum);
	            String otp5 = reader.getCellData("Sheet1", "otp5", rowNum);
	            String otp6 = reader.getCellData("Sheet1", "otp6", rowNum);
	            String pincode = reader.getCellData("Sheet1", "pincode", rowNum);
	            String panNo = reader.getCellData("Sheet1", "panNo", rowNum);
	            String Username = reader.getCellData("Sheet1", "Username", rowNum);
	            String Years = reader.getCellData("Sheet1", "Years", rowNum);
	            String Months = reader.getCellData("Sheet1", "Months", rowNum);
	            String Gender = reader.getCellData("Sheet1", "Gender", rowNum);
	            String TWFatherName = reader.getCellData("Sheet1", "TWFatherName", rowNum);
	            String TWEmailId = reader.getCellData("Sheet1", "TWEmailId", rowNum);
	            String residentType = reader.getCellData("Sheet1", "residentType", rowNum);
	            String duration = reader.getCellData("Sheet1", "duration", rowNum);
	            String employmentType = reader.getCellData("Sheet1", "employmentType", rowNum);
	            String monthSalary = reader.getCellData("Sheet1", "monthSalary", rowNum);
	            String VehicalMaf = reader.getCellData("Sheet1", "VehicalMaf", rowNum);
	            String VehicalMod = reader.getCellData("Sheet1", "VehicalMod", rowNum);
//	            String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
//	            String Iterations = reader.getCellData("Sheet1", "Iterations", rowNum);

	      Object ob[] = { mobNo,  otp1,  otp2,  otp3, otp4,  otp5,  otp6,  pincode,  panNo, 
	        			 Username, Years,Months, Gender, TWFatherName,  TWEmailId,  residentType,
	        			 duration,  employmentType,  monthSalary,VehicalMaf ,VehicalMod };
	            myData.add(ob);
	        }
	        return myData;
	    }

	    public static void writeinexcel(String value, int INDEX) throws Exception {
	        File fis = new File("C:\\Users\\v802\\eclipse-workspace\\TWEXCEL\\Data1\\excel1.xlsx");
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

	    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
	        File fis = new File("C:\\Users\\v802\\eclipse-workspace\\TWEXCEL\\Data1\\excel1.xlsx");
	        FileInputStream excelloc = new FileInputStream(fis);
	        @SuppressWarnings("resource")
	        XSSFWorkbook wb = new XSSFWorkbook(excelloc);
	        XSSFSheet s = wb.getSheetAt(0);
	        XSSFRow row = s.getRow(INDEX);
	        XSSFCell c = row.createCell(21);
	        c.setCellValue(value);
	        FileOutputStream out = new FileOutputStream(fis);
	        wb.write(out);
	        out.close();
	    }

	}
	
	

