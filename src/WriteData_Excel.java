import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_Excel {
public static void main(String[] args) throws Exception {
	File file=new File("D:\\output.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook();
	XSSFSheet sh=wb.createSheet("output0");
	sh.createRow(0).createCell(0).setCellValue("name");
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	
}
}
