package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYukleme {

    @Test
    public void test01(){

        // Dosya yolu ve sayfa isimi verilen bir excel sheet'in map olarak kaydeden
        // Reusable bit method olusturalim

        String path="src/test/java/rescurces/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        System.out.println(reusableMethodsExcel.mapOlustur(path, sayfaAdi));

        // Olusturdugumuz map'i kullanarak Turkey'in bilgilerini yazdirin

        Map<String,String> ulkelrMap= reusableMethodsExcel.mapOlustur(path, sayfaAdi);
        System.out.println(ulkelrMap.get("Turkey"));

        // Listede Netherlands oldugunu test edin

        Assert.assertTrue(ulkelrMap.containsKey("Netherlands"));


    }
}
