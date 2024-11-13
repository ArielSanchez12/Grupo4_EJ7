public class Componente_y {
    private double velocidadInicial;
    private double angulo;

    public Componente_y(double velocidadInicial, double angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    // Setters
    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

}
