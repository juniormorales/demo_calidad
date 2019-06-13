import Modelo.MaquinaDestiladora;
import Modelo.AlcoholEtilico;
import Modelo.LiquidoAlcoholico;
import Modelo.Picnometro;

public class prueba {
    
    public static void main(String[] args) {

        LiquidoAlcoholico d_liq = new LiquidoAlcoholico(0.98399,20);
        Picnometro c= new Picnometro(d_liq,0.997);
        d_liq.setDensidad(c.ObtenerResultado());
        AlcoholEtilico alcohol = new AlcoholEtilico(d_liq);
        MaquinaDestiladora alambique = new MaquinaDestiladora(d_liq,alcohol);
        System.out.println(alcohol.toString());
    }
}
