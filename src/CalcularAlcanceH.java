public class CalcularAlcanceH {
    private double velocidadInicial; // Ingresada por el usuario
    private double angulo; // Ingresada por el usuario
    private static double acelVerti = 9.8; //a sub y
    private double tiempoVuelo; //y sub f
    private double velocidadInicialX; //v sub 0 x
    private double velocidadInicialY; //v sub 0 y
    private double alcanceH; //x sub f

    //Constructor vacio
    public CalcularAlcanceH() {
    }

    //Setters y getters

    public double getTiempoVuelo() {
        return tiempoVuelo;
    }

    public void setTiempoVuelo(double tiempoVuelo) {
        this.tiempoVuelo = tiempoVuelo;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getVelocidadInicialX() {
        return velocidadInicialX;
    }

    public void setVelocidadInicialX(double velocidadInicialX) {
        this.velocidadInicialX = velocidadInicialX;
    }

    public double getVelocidadInicialY() {
        return velocidadInicialY;
    }

    public void setVelocidadInicialY(double velocidadInicialY) {
        this.velocidadInicialY = velocidadInicialY;
    }

    // METODOS DE CALCULO
    public double VelocidadInicialX(double velocidadInicial, double angulo) {
        return velocidadInicialX = velocidadInicial * Math.cos(Math.toRadians(angulo));
    }


    public double VelocidadInicialY(double velocidadInicial, double angulo) {
        return velocidadInicialY = velocidadInicial * Math.sin(Math.toRadians(angulo));
    }


    public double TiempoDeVuelo() {
        return tiempoVuelo = (2 * velocidadInicialX) / acelVerti;
    }

    public double AlcanceHorizontal() {
        return alcanceH = (velocidadInicialX * tiempoVuelo);
    }
}
