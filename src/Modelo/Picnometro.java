package Modelo;

public class Picnometro {

    private LiquidoAlcoholico liquido;
    private double densidad_agua;
    private double masa_agua;
    private double resultado;

    public Picnometro(LiquidoAlcoholico l, double m) {
        this.liquido = l;
        GenerarDensidadAgua(liquido.getTemperatura());
        this.masa_agua= m;
        this.resultado = CalcularDensidadLiquido(l,densidad_agua,masa_agua);
    }
    
    public Picnometro(){
        this.liquido = null;
        this.densidad_agua = 0;
        this.masa_agua = 0;
    }

    public double getDensidad_agua() {
        return densidad_agua;
    }

    public double getMasa_agua() {
        return masa_agua;
    }
            

    public double CalcularDensidadLiquido(LiquidoAlcoholico l,double DensidadAgua, double MasaAgua) {
        double r;
        double masaDelLiquido = l.getMasa_liq();
        r = DensidadAgua * (masaDelLiquido / MasaAgua);
        return r;
    }
    
    public void GenerarDensidadAgua(int t){
        double d;
        switch(t){
            case 0: d=0.99982;break;
            case 1: d=0.99989;break;
            case 2: d=0.99994;break;
            case 3: d=0.99998;break;
            case 4: d=1.00000;break;
            case 5: d=1.00000;break;
            case 6: d=0.99999;break;
            case 7: d=0.99996;break;
            case 8: d=0.99991;break;
            case 9: d=0.99985;break;
            case 10: d=0.99977;break;
            case 11: d=0.99968;break;
            case 12: d=0.99958;break;
            case 13: d=0.99946;break;
            case 14: d=0.99933;break;
            case 15: d=0.99919;break;
            case 16: d=0.99903;break;
            case 17: d=0.99886;break;
            case 18: d=0.99868;break;
            case 19: d=0.99849;break;
            case 20: d=0.99829;break;
            case 21: d=0.99808;break;
            case 22: d=0.99786;break;
            case 23: d=0.99762;break;
            case 24: d=0.99738;break;
            case 25: d=0.99713;break;
            case 26: d=0.99686;break;
            case 27: d=0.99659;break;
            case 28: d=0.99631;break;
            case 29: d=0.99602;break;
            case 30: d=0.99571;break;
            case 31: d=0.99541;break;
            case 32: d=0.99509;break;
            default: d=-1;  
        }  
       this.densidad_agua = d;
    }
    
    public double ObtenerResultado() {
        return resultado;
    }

}
