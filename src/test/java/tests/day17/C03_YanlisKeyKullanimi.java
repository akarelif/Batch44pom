package tests.day17;


import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanimi {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //Eger key olarak girdigimiz String configuration.properties dosyasinda yoksa
        //ornegin HMCUrl yerine HMCurl yazarsak
        //ConfiReader.getProperty() o key'i bulamaz
        //ve nullPointerException firlatir

    }
}
