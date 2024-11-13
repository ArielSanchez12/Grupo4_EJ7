public class Componente_x {
    private double velocidadInicial;
    private double angulo;

    public Componente_x(double velocidadInicial, double angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
}