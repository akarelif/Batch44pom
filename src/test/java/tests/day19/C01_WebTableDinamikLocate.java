package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDinamikLocate {

    // 3 test method'u olusturalim

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        // 1.Method satir numarasi verdigimde bana o satirdaki datalari yazdirsin

        // 2.satiri yazdir //tbody//tr[2]
        // 7.satiri yazdir //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();
        WebElement ucuncuSatirElementi=hmcWebTablePage.satirGetir(4);
        System.out.println(ucuncuSatirElementi.getText());

        Driver.closeDriver();
    }
    @Test
    public void hucreGetirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hotelMyCampPage=new HotelMyCampPage();

        // 2.method satir no ve data numarasi girdiginde verdigin datayi yazdirsin
        hmcWebTablePage=new HMCWebTablePage();

        // 2.satirin datasi  //tbody//tr[2]//td[4]
        // 4.satirin datasi  //tbody//tr[4]//td[5]

        System.out.println("girdiginiz hucredeki element : " + hmcWebTablePage.hucreWebElementGetir(3,5));

        Driver.closeDriver();
        }
    @Test
    public void sutunYazdir(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hotelMyCampPage=new HotelMyCampPage();

        // 3.sutun numarasi verdigimde bana tum sutunu yazdirsin
        hmcWebTablePage=new HMCWebTablePage();
        hmcWebTablePage.sutunYazdir(4);

    Driver.closeDriver();
    }

    }











