
package Modelo;

public class AlcoholEtilico {
    private LiquidoAlcoholico densidad_liq;
    private double grado;
    
    public AlcoholEtilico(LiquidoAlcoholico d){
        this.densidad_liq = d;
    }

    public double getGrado(){
        return this.grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }
    
    public LiquidoAlcoholico getDensidadLiquido(){
        return this.densidad_liq;
    }

    @Override
    public String toString() {
        if(grado<10)
        return "El grado alcoholico es de: "+grado+
               "\nEl grado alcoholico debe aumentar en almenos " + (10 - grado)
               + "\npara estar dentro del estandar";
        else
            if(grado<16)
                return "\nEl grado alcoholico del liquido es de "+grado+
                "\nEl liquido cumple el estandar alcoholico";
            else
                return "El grado alcoholico es de: "+grado+
                       "\nEl grado alcoholico debe disminuirse en almenos " + (grado - 16)
                    + "\n para estar dentro del estandar";
    }
    
    
    
}
