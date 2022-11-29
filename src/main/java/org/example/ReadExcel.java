package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("C:\\Users\\Neeraj Prasher\\OneDrive\\Documents\\projects\\sampleTest\\src\\main\\resources\\student.xlsx");   //creating a new file instance
            FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file
            //creating Workbook instance that refers to .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
            //iterating over Excel file
            for (Row row : sheet) {
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case STRING ->    //field that represents string cell type
                                System.out.print(cell.getStringCellValue() + "\t\t\t");
                        case NUMERIC ->    //field that represents number cell type
                                System.out.print(cell.getNumericCellValue() + "\t\t\t");
                        default -> {
                        }
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}  