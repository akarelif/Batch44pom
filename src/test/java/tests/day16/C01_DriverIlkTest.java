package tests.day16;

import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    // Driver class'i sayesinde bizim eski driver was killed
    //artik driver'a ihtiyac varsa Driver.getDriver() yazacagiz

    @Test
    public void test01(){

        //amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //amozan' gittigimizi test edelim
        String actualTitle=Driver.getDriver().getTitle();
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualTitle.contains("Amazon"));

        //Driver.getDriver method'u her calistiginda
        //driver=new ChromeDriver(); komutundan oturu yeni bir driver olusturuyor
        //Biz Driver class'dan getDriver'i ilk calistirdigimizda new atamasi olsun
        //sonraki calismalarda olmasin istiyoruz
        //Bunun icin driver=new ChromeDriver(); satiri bir if blogu iicine alacagiz
        Driver.closeDriver();
    }
    @Test
    public void test02(){

        //bsetbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");
        //bestbyu'a gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }
}
