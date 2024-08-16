package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadRecordsFromExcel {

	public static void main(String[] args) {
String filePath = "C:/Users/niksahay.CORP.000/Downloads/Paket18_1C_Gemeinde_PLZ_Automate.csv";
        
        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            
            // Create Workbook instance for xlsx/xls file
            Workbook workbook = WorkbookFactory.create(file);
            
            // Get the first sheet of the workbook
            Sheet sheet = workbook.getSheetAt(0);
            
            // Create a list to store the records
            List<Row> records = new ArrayList<>();
            
            // Iterate through each row in the sheet
            for (Row row : sheet) {
                records.add(row);
            }
            
            // Close the workbook and file streams
            workbook.close();
            file.close();
            
            // Print the number of records
            System.out.println("Number of records: " + records.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
