package tests.day20;


import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    @Test
    public void test01() throws IOException {

        String path="src/test/java/rescurces/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        // Biz FİS ile okudugumuz excwll dosyasını projemiz icerisinde kullanabilmek icin
        // Apachi POI depenceny yardimi ile bir Workbook olusturduk
        // Bu workbook bizim projemizin icerisinde ulkeler excelinin bir koyasini kullanmamizi sagliyor
        // Excelin yapisi geregi bir hücreye (cell) ulasabilmek icin workbookdan baslayarak
        // Sirasiyla sheet, row ve cell objeleri olusturmamiz gerekiyor

        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row=sheet.getRow(4);
        Cell cell=row.getCell(2);

        System.out.println(cell);

        // indexi 4 olan satirdaki, indexi 2 olan hucrenin Andorra oldugunu test edelim

        String expectedData="Andorra";
        Assert.assertEquals(cell.getStringCellValue(),expectedData);

        //5.indexdeki satirin, 3.indexdeki hucre bilgisini yazdiralim

        row=sheet.getRow(5);
        cell=row.getCell(3);

        System.out.println(cell);

    }
}