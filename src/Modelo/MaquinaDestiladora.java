package Modelo;

public class MaquinaDestiladora {

    private double[][] grados;
    private LiquidoAlcoholico liquido;
    private AlcoholEtilico alcohol;

    public MaquinaDestiladora(LiquidoAlcoholico l, AlcoholEtilico a) {
        this.grados = new double[][]{{0.0, 1.0000}, {1.0, 0.99851},
        {2.0, 0.99704}, {3.0, 0.99560},
        {4.0, 0.99419}, {5.0, 0.99281},
        {6.0, 0.99149}, {7.0, 0.98820},
        {8.0, 0.98494}, {9.0, 0.98271},
        {9.5, 0.97811}, {10.0, 0.97350},
        {10.5, 0.96990}, {11.0, 0.96530},
        {11.5, 0.96271}, {12.0, 0.95812},
        {13.0, 0.95397}, {14.0, 0.94982},
        {15.0, 0.94471}, {16.0, 0.94060},
        {17.0, 0.93750}, {18.0, 0.93243},
        {19.0, 0.92938}, {20.0, 0.92445},
        {21.0, 0.91825}, {22.0, 0.91318},
        {23.0, 0.90812}, {24.0, 0.90000}};
        this.alcohol = a;
        this.liquido = l;
        a.setGrado(CalcularGrado(l));

    }

    private double CalcularGrado(LiquidoAlcoholico d) {
        double r = 0;
        for (int i = 0; i < 28; i++) {
            if (d.getDensidad() >= grados[0][1]) {
                r = grados[0][0];
            } else if (d.getDensidad() >= grados[i][1] && d.getDensidad() < grados[i - 1][1] && i != 0) {
                r = grados[i][0];
            }
        }
        return r;
    }
}
