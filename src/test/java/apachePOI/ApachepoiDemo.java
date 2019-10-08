package apachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class ApachepoiDemo {
    public static void main(String[] args) throws Exception {
        String path = "src/test/resources/data/poidemo.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        int numberOfRows=row.getPhysicalNumberOfCells();
        System.out.println(numberOfRows);
        for (int i=0;i<numberOfRows;i++){
            System.out.println(row.getCell(i));
        }
//        Cell cell = row.getCell(0);
//        System.out.println(cell);

    }
}
