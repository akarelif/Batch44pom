package tests.day20;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {

    @Test
    public void test01() throws IOException {

        // Ulkeler exceline 5.sutun olarak NUFUS sutunu ekleyelim
        // 3.satirdaki ulkenin nufusunu 1000000 yapalim

        // 1-Dosyaya ulasalim

        String path="src/test/java/rescurces/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        // 2-Class'da calismak icin dosyanin bir kopyasi olan workbook olusturalim
        Workbook workbook= WorkbookFactory.create(fis);
        // 3-Dosyada yapmak istedigimiz degisiklikleri
        // kopya workbook'da yapalim

        // Ilk satirin 5.hucresine NUFUS basligini yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        //3.satirdaki ulkenin nufusunu 1000000 yapalim
        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("1000000");

        // 4-Kopyada yaptigimiz degisiklikleri ana dosyaya kaydedelim
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
    }
}
