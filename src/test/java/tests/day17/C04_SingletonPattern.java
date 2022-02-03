package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {

    @Test
    public void test01(){

        //singleton pattern:bir class'dan birden fazla obje uretilmesine
        //izin vermeyen bir pattern olarak kabul gormustur
        //biz Driver class'ini driver uretmek uzere kullaniyoruz
        //ancak Driver class'inda driver isminde bir instance variable da var
        //ve biz obje ureterek bu instance driver'a ulasabiliriz

        /*
        river driver1=new Driver();
        Driver driver2=new Driver();
        Driver driver3=new Driver();
        */
        // Singleton model kabul gormus bir model'dir
        // amac bir class'dan nesne üretilmemesini saglamaktir
        // içindeki singleton patter'de koruyacagim,iz class'da
        // parametresiz bir kurucu olusturur ve
        // bu yapıcıyı private yapariz
    }
}
