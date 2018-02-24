package start_June_06;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class TC04 {
	
	@Test
	public void readDataFrmXL() throws Exception{
		
		String filePath = "D:\\Selenium_Files\\TestData\\tData.xls";
		File file = new File(filePath);
		
		FileInputStream fIP = new FileInputStream(file);
		
		HSSFWorkbook wb = new HSSFWorkbook(fIP);
		
		HSSFSheet sheet = wb.getSheetAt(0);
		
		int xRow = sheet.getLastRowNum() + 1;
		System.out.println("Rows are : " + xRow);
		
		int xCol = sheet.getRow(0).getLastCellNum();
		System.out.println("Cols are : " + xCol);
		
		String[][] xData = new String[xRow][xCol];
		
		for(int i = 0; i<xRow; i++){           //row
			HSSFRow row = sheet.getRow(i);
			
			for(int j = 0; j<xCol; j++){          //Col
				HSSFCell cell = row.getCell(j);
				
			String value = cellToString(cell);
			
			 xData[i][j] = value; 
			 
			 System.out.print(value); //Print data in console
             System.out.print("##");
			}
			 System.out.println("@");
		}
	}

	public String cellToString(HSSFCell cell) {

		int type = cell.getCellType();
		System.out.println("First Type" + type);
		Object result;
		
		switch(type){
		
		case HSSFCell.CELL_TYPE_BLANK:
			result = "";
			System.out.println(type);
			break;
		
		case HSSFCell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
			System.out.println(type);
			break;
		
		case HSSFCell.CELL_TYPE_ERROR:
			System.out.println(type);
			throw new RuntimeException("There is some error in cell.");
		
		case HSSFCell.CELL_TYPE_FORMULA:
			System.out.println(type);
			throw new RuntimeException("We dont handle formula.");
		
		case HSSFCell.CELL_TYPE_NUMERIC:
			System.out.println(type);
			result = cell.getNumericCellValue();
			break;
			
		case HSSFCell.CELL_TYPE_STRING:
			System.out.println(type);
			result = cell.getStringCellValue();
			break;
		
		default:
			throw new RuntimeException("Out of world");
		}
		
		return result.toString();
	}

}
