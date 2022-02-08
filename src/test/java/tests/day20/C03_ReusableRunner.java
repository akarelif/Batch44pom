package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {

    @Test
    public void test01(){

        // Ulkeler excelindeki Sayfa1'de
        // 11. indexdeki satirin, 2.indexdeki hucrenin Azerbaycan oldugunu test edelim

        String path="src/test/java/rescurces/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData= reusableMethodsExcel.hucreGetir(path, "Sayfa1", 11, 2).toString();
        Assert.assertEquals(actualData,expectedData);
    }
}
