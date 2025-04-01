package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelInformation {

    private static String testDataDir = System.getProperty("info.dir")+"src/test/java/TestData/data.xlsx";


    static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream(testDataDir);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;

    static {
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void ReadFromExcel() throws IOException {
    }


    static XSSFSheet sheetLogD =workbook.getSheet("Login Details");

    public static String username=sheetLogD.getRow(1).getCell(0).getStringCellValue();
    public static String password=sheetLogD.getRow(1).getCell(1).getStringCellValue();

    static XSSFSheet sheetInfPag =workbook.getSheet("User Information");

    public static String firstname=sheetInfPag.getRow(0).getCell(1).getStringCellValue();
    public static String lastName=sheetInfPag.getRow(0).getCell(1).getStringCellValue();
    public static String postalCode=sheetInfPag.getRow(0).getCell(1).getStringCellValue();

}

