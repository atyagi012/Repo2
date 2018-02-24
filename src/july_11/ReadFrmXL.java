package july_11;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.management.RuntimeErrorException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

public class ReadFrmXL {

	static int xRows;
	static int xCols;
	 
	public static String[][] readXL() throws Exception{
	        String sPath = "D:\\abc\\testData.xls"; //This is excel file path
	        File myFile = new File(sPath);  //Pass this file path to myFile
	        FileInputStream myStream = new FileInputStream(myFile);  //Declare a input stream and pass myFile in it
	       
	        HSSFWorkbook myWB = new HSSFWorkbook(myStream); //Declare work book and pass myStream in it
	        HSSFSheet mySheet = myWB.getSheetAt(2); //Go to the sheet at index 0 i.e. First One
	       
	        xRows = mySheet.getLastRowNum() + 1; //Get rows number
	        xCols = mySheet.getRow(0).getLastCellNum(); //Get column number
	       
	        System.out.println("Number of rows are : " + xRows);
	        System.out.println("Number of columns are : " + xCols);
	       
	        String[][] xData = new String[xRows][xCols]; //Declare an array of string type which will hold values
	       
	        for(int i=0; i<xRows; i++){
	            HSSFRow row = mySheet.getRow(i); //Pointing to the row from we need to read data; it will be first row at first iteration
	           
	            for(int j=0; j<xCols; j++){
	                HSSFCell cell = row.getCell(j);  //Pointing to the cell of the row
	               
	                String value = cellToString(cell); //Getting value of the cell and put it into a variable "value"; Here cellToString() is a user define function which will convert cell value in string.  
	               
	                xData[i][j] = value;   //Store that value in to array
	               
	                System.out.print(value); //Print data in console
	                System.out.print("##");
	            }
	            System.out.println("@");
	        }
			return xData;
	    }
	   
	    
	//Section 4: This method will convert object of type cell into String
	public static String cellToString(HSSFCell cell){//Declare a method "cellToString()" which will convert an object of type cell into string
	        int type = cell.getCellType();// This method "getCellType()" will return an integer which is 0-5 and on the basis of this integer value we will use SWITCH
	       
	        Object result; // Its an temporary object which will hold value in switch statement
	       
	        switch(type){
	       
	        case HSSFCell.CELL_TYPE_NUMERIC: // If a cell contain numeric value then it will return 0
	            result = cell.getNumericCellValue();
	            System.out.println("Value of type is : " +type);
	            break;
	           
	        case HSSFCell.CELL_TYPE_STRING: // If a cell string value then it will return 1
	            result = cell.getStringCellValue();
	            break;
	           
	        case HSSFCell.CELL_TYPE_FORMULA:  // If a cell contain formula then it will return 2
	            System.out.println("Can not eveulate formila in JAVA");
	            throw new RuntimeException("Can not eveulate formila in JAVA");
	           
	        case HSSFCell.CELL_TYPE_BLANK: // If a cell contain blank value then it will return 3
	            result = "";
	            break;
	           
	        case HSSFCell.CELL_TYPE_BOOLEAN: // If a cell contain boolean value then it will return 4
	            result = cell.getBooleanCellValue();
	            break;
	           
	        case HSSFCell.CELL_TYPE_ERROR:// If a cell contain error then it will return 5
	            System.out.println("Can not eveulate formila in JAVA");
	            throw new RuntimeException("This cell has an error");
	           
	        default:
	            throw new RuntimeException("We dont support this cell type : " +type);
	        }
	        return result.toString();   //Here "toString()" method will convert result object to string; Here question may arise i.e why convert value into string...? This is so because we already have an array[xData] in which we will put this value and that is declared as STRING.
	       
	    }
}

