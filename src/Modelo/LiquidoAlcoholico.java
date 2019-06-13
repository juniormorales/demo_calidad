package Modelo;

public class LiquidoAlcoholico {

    private double masa_liq;
    private int temperatura;
    private double densidad;

    public LiquidoAlcoholico(double ml, int t) {
        this.masa_liq = ml;
        this.temperatura = t;
    }

    public double getMasa_liq() {
        return masa_liq;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------------------"
                +"\nLa masa del liquido alcoholico es de " + masa_liq + "gramos"
                + "\nLa temperatura es de " + temperatura + "°"
                + "\nSu densidad es de: " + densidad + " gr/L"
                + "\n-----------------------------------------------------------------";
    }

}
