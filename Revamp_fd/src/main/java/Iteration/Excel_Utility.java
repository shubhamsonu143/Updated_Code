package Iteration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {
	
	
	 static Read_Excel reader;

	    public static ArrayList<Object[]> getDataFromexcel() {
	        ArrayList<Object[]> myData = new ArrayList<Object[]>();
	        try {
	            String s = "C:\\Users\\s2605\\Desktop\\jar and exe\\SingleData.xlsx";
	            System.out.println(s);
	            reader = new Read_Excel(s);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {

	            String INDEX = reader.getCellData("Sheet1", "INDEX", rowNum);
	            String Iteration = reader.getCellData("Sheet1", "Iteration", rowNum);
	            String MobileNo = reader.getCellData("Sheet1", "MobileNo", rowNum);
	            String PinCode = reader.getCellData("Sheet1", "PinCode", rowNum);
	            String EmailID = reader.getCellData("Sheet1", "EmailID", rowNum);
	            String VerifyOtp = reader.getCellData("Sheet1", "VerifyOtp", rowNum);
	            String Amount_input_fd = reader.getCellData("Sheet1", "Amount_input_fd", rowNum);
	            String Tenure_input_fd = reader.getCellData("Sheet1", "Tenure_input_fd", rowNum);
	            String Select_Interest_Payout = reader.getCellData("Sheet1", "Select_Interest_Payout", rowNum);
	            String S1_depositorPAN = reader.getCellData("Sheet1", "S1_depositorPAN", rowNum);
	            String S1_depositorMName = reader.getCellData("Sheet1", "S1_depositorMName", rowNum);
	            String S1_depositorEmail = reader.getCellData("Sheet1", "S1_depositorEmail", rowNum);
	            String S1_depositorGuardianPAN = reader.getCellData("Sheet1", "S1_depositorGuardianPAN", rowNum);
	            String S1_depositorGuardianMName = reader.getCellData("Sheet1", "S1_depositorGuardianMName", rowNum);
	            String S1_depositorGuardianEmail = reader.getCellData("Sheet1", "S1_depositorGuardianEmail", rowNum);
	            String Documenttype = reader.getCellData("Sheet1", "Documenttype", rowNum);
	            String DocumentNo = reader.getCellData("Sheet1", "DocumentNo", rowNum);
	            String ckyc_frontpic = reader.getCellData("Sheet1", "ckyc_frontpic", rowNum);
	            String ckyc_backpic = reader.getCellData("Sheet1", "ckyc_backpic", rowNum);
	            String Guard_Documenttype = reader.getCellData("Sheet1", "Guard_Documenttype", rowNum);
	            String Guard_DocumentNo = reader.getCellData("Sheet1", "Guard_DocumentNo", rowNum);
	            String Guard_up_ckyc_frontpic = reader.getCellData("Sheet1", "Guard_up_ckyc_frontpic", rowNum);
	            String Guard_up_ckyc_backpic = reader.getCellData("Sheet1", "Guard_up_ckyc_backpic", rowNum);
	            String S3_addrline1 = reader.getCellData("Sheet1", "S3_addrline1", rowNum);
	            String S3_addrline2 = reader.getCellData("Sheet1", "S3_addrline2", rowNum);
	            String S3_pincode = reader.getCellData("Sheet1", "S3_pincode", rowNum);
	            String Profie_Upload = reader.getCellData("Sheet1", "Profie_Upload", rowNum);
	            String S3_guard_addrline1 = reader.getCellData("Sheet1", "S3_guard_addrline1", rowNum);
	            String S3_guard_addrline2 = reader.getCellData("Sheet1", "S3_guard_addrline2", rowNum);
	            String S3_guard_pincode = reader.getCellData("Sheet1", "S3_guard_pincode", rowNum);
	            String Guardian_photo = reader.getCellData("Sheet1", "Guardian_photo", rowNum);
	            String S4_accountno = reader.getCellData("Sheet1", "S4_accountno", rowNum);
	            String S4_confaccountno = reader.getCellData("Sheet1", "S4_confaccountno", rowNum);
	            String Banknn = reader.getCellData("Sheet1", "Banknn", rowNum);
	            String Bal = reader.getCellData("Sheet1", "Bal", rowNum);
	            String Ifsccodes = reader.getCellData("Sheet1", "Ifsccodes", rowNum);
	            String S4_acctype = reader.getCellData("Sheet1", "S4_acctype", rowNum);
	            String S4_accholdername = reader.getCellData("Sheet1", "S4_accholdername", rowNum);
	            String OcrChkUpload = reader.getCellData("Sheet1", "OcrChkUpload", rowNum);
	            String S5_Occupation = reader.getCellData("Sheet1", "S5_Occupation", rowNum);
	            String Others = reader.getCellData("Sheet1", "Others", rowNum);
	            String Marital_Click = reader.getCellData("Sheet1", "Marital_Click", rowNum);
	            String S5_othersNmae = reader.getCellData("Sheet1", "S5_othersNmae", rowNum);
	            String S5_Marital = reader.getCellData("Sheet1", "S5_Marital", rowNum);
	            String S5_Maturity_ins = reader.getCellData("Sheet1", "S5_Maturity_ins", rowNum);
	            String Marital_Status = reader.getCellData("Sheet1", "Marital_Status", rowNum);
	            String Spouse = reader.getCellData("Sheet1", "Spouse", rowNum);
	            String S5_spouseName = reader.getCellData("Sheet1", "S5_spouseName", rowNum);
	            String S5_fatherName = reader.getCellData("Sheet1", "S5_fatherName", rowNum);
	            String TDS_Certificate = reader.getCellData("Sheet1", "TDS_Certificate", rowNum);
	            String S5_FinancialYear = reader.getCellData("Sheet1", "S5_FinancialYear", rowNum);
	            String S5_EstimatedIncome = reader.getCellData("Sheet1", "S5_EstimatedIncome", rowNum);
	            String S5_esttotincome = reader.getCellData("Sheet1", "S5_esttotincome", rowNum);
	            String S5_formsfilled = reader.getCellData("Sheet1", "S5_formsfilled", rowNum);
	            String S5_AggregateAmount = reader.getCellData("Sheet1", "S5_AggregateAmount", rowNum);
	            String Add_Nominee = reader.getCellData("Sheet1", "Add_Nominee", rowNum);
	            String S5_nomineeRelation = reader.getCellData("Sheet1", "S5_nomineeRelation", rowNum);
	            String S5_nomineetitle = reader.getCellData("Sheet1", "S5_nomineetitle", rowNum);
	            String s5_nomineeFname = reader.getCellData("Sheet1", "s5_nomineeFname", rowNum);
	            String S5_nomineeMname = reader.getCellData("Sheet1", "S5_nomineeMname", rowNum);
	            String S5_nomineeLname = reader.getCellData("Sheet1", "S5_nomineeLname", rowNum);
	            String S5_nomineeDOB = reader.getCellData("Sheet1", "S5_nomineeDOB", rowNum);
	            String Nominee_address_same_as_Applicant_address = reader.getCellData("Sheet1", "Nominee_address_same_as_Applicant_address", rowNum);
	            String S5_nomadd1 = reader.getCellData("Sheet1", "S5_nomadd1", rowNum);
	            String S5_nomadd2 = reader.getCellData("Sheet1", "S5_nomadd2", rowNum);
	            String S5_nomarea = reader.getCellData("Sheet1", "S5_nomarea", rowNum);
	            String S5_nomcity = reader.getCellData("Sheet1", "S5_nomcity", rowNum);
	            String S5_nomstate = reader.getCellData("Sheet1", "S5_nomstate", rowNum);
	            String S5_nompincode = reader.getCellData("Sheet1", "S5_nompincode", rowNum);

	            Object ob[] = { INDEX,  Iteration,  MobileNo,  PinCode,  EmailID,
	                     VerifyOtp,  Amount_input_fd,  Tenure_input_fd,
	                     Select_Interest_Payout,  S1_depositorPAN,  S1_depositorMName,
	                     S1_depositorEmail,  Documenttype,  DocumentNo,  ckyc_frontpic,
	                     ckyc_backpic,  S3_addrline1,  S3_addrline2,  S3_pincode,
	                     Profie_Upload, S1_depositorGuardianPAN,  S1_depositorGuardianMName,
	                     S1_depositorGuardianEmail,  Guard_Documenttype,  Guard_DocumentNo,
	                     Guard_up_ckyc_frontpic,  Guard_up_ckyc_backpic,  S3_guard_addrline1,
	                     S3_guard_addrline2,  S3_guard_pincode,  Guardian_photo, S4_accountno,
	                    S4_confaccountno,  Banknn, Bal,  Ifsccodes,  S4_acctype,  S4_accholdername,
	                     OcrChkUpload,  S5_Occupation,  Others,  S5_othersNmae,Marital_Click,
	                     S5_Marital,  S5_Maturity_ins,  Marital_Status,Spouse,  S5_spouseName,  S5_fatherName,
	                     TDS_Certificate,  S5_FinancialYear,  S5_EstimatedIncome,
	                     S5_esttotincome,  S5_formsfilled,  S5_AggregateAmount,
	                     Add_Nominee,  S5_nomineeRelation,  S5_nomineetitle,
	                     s5_nomineeFname,  S5_nomineeMname,  S5_nomineeLname,
	                     S5_nomineeDOB,  Nominee_address_same_as_Applicant_address,
	                     S5_nomadd1,  S5_nomadd2,  S5_nomarea,  S5_nomcity,
	                     S5_nomstate,  S5_nompincode};
	            myData.add(ob);
	        }
	        return myData;

	    }

	    public static void writeinexcel(String value, int INDEX) throws Exception {
	        File fis = new File("C:\\Users\\s2605\\Desktop\\jar and exe\\Four_Data.xlsx");
	        FileInputStream excelloc = new FileInputStream(fis);
	        @SuppressWarnings("resource") XSSFWorkbook wb = new XSSFWorkbook(excelloc);
	        XSSFSheet s = wb.getSheetAt(0);
	        XSSFRow row = s.getRow(INDEX);
	        XSSFCell c = row.createCell(78);
	        c.setCellValue(value);
	        FileOutputStream out = new FileOutputStream(fis);
	        wb.write(out);
	        out.close();
	    }

	    public static void writeinexcelForReasons(String value, int INDEX) throws Exception {
	        File fis = new File("C:\\Users\\s2605\\Desktop\\jar and exe\\Four_Data.xlsx");
	        FileInputStream excelloc = new FileInputStream(fis);
	        @SuppressWarnings("resource") XSSFWorkbook wb = new XSSFWorkbook(excelloc);
	        XSSFSheet s = wb.getSheetAt(0);
	        XSSFRow row = s.getRow(INDEX);
	        XSSFCell c = row.createCell(79);
	        c.setCellValue(value);
	        FileOutputStream out = new FileOutputStream(fis);
	        wb.write(out);
	        out.close();
	    }

	
}
