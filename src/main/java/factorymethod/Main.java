package factorymethod;

public class Main {

    /*
    Factory Method: Liitteenä on factorymethod.zip, joka sisältää koodia, jossa AterioivaOtus aterioi.
    Esimerkkiohjelman Juoma luodaan AterioivanOtuksen Opettaja-aliluokassa. Juomanluontimetodi on tehdasmetodi.
    Kirjoita Opettaja-luokalle kaksi rinnakkaista luokkaa, joissa kummassakin luodaan sopiva juoma.

    Luo testiohjelmassasi jokaista otustyyppiä oleva olio ja laita ne aterioimaan.
    */
    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        AterioivaOtus rehtori = new Rehtori();
        rehtori.aterioi();
        AterioivaOtus oppilas = new Oppilas();
        oppilas.aterioi();
        
    }
}
