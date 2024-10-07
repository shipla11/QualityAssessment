package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelHelper {

    FileInputStream fis;
    public XSSFWorkbook workbook;
    public XSSFSheet worksheet;
    public XSSFRow row;

    public ExcelHelper(String path) {
        try {
            fis = new FileInputStream(path);
            workbook = new XSSFWorkbook(fis);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getCellData(String sheetName, String columnName, int rowNum){
        int index = workbook.getSheetIndex(sheetName);
        worksheet = workbook.getSheetAt(index);
        row = worksheet.getRow(rowNum);
        XSSFRow columnHeaderRow = worksheet.getRow(0);
        int colNum=0;

        for (int i = 0; i < columnHeaderRow.getLastCellNum(); i++) {
            if (columnHeaderRow.getCell(i).getStringCellValue().trim().equalsIgnoreCase(columnName.trim())){
                colNum=i;
                break;
            }
        }

        return row.getCell(colNum).getStringCellValue();
    }

}