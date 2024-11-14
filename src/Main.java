//Integrantes: Patricio Ponce, Richard Padilla, Jose Pila, Ariel Sánchez
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----PLANTEAMIENTO DEL PROBLEMA-----\n" +
                "Se patea un balon desde el suelo a un angulo determinado y con una velocidad inicial" +
                "\n¿Cual es el alcance horizontal del balon?");

        //Instancia de clases
        Scanner ingresar = new Scanner(System. in);
        CalcularAlcanceH calculo1 = new CalcularAlcanceH();

        //INGRESO DE DATOS
        boolean ingresarValido = false;
        while (!ingresarValido) {
            try {
                System.out.println("Ingrese la velocidad inicial del objeto: ");
                double velocidadInicial = ingresar.nextDouble();
                calculo1.setVelocidadInicial(velocidadInicial);
                System.out.println("Ingrese el angulo del objeto: ");
                double angulo = ingresar.nextDouble();
                calculo1.setAngulo(angulo);

                ingresarValido = true;
            } catch (InputMismatchException e) {
                System.out.print("Datos ingresados incorrectamente, vuelve a ingresarlos\n");
                ingresar.nextLine();
            }
        }

        //Imprimir resultados
        System.out.println(calculo1.VelocidadInicialX(calculo1.getVelocidadInicial(), calculo1.getAngulo()));
        System.out.println(calculo1.VelocidadInicialY(calculo1.getVelocidadInicial(), calculo1.getAngulo()));
        System.out.println(calculo1.TiempoDeVuelo());
        System.out.println(calculo1.AlcanceHorizontal());

    }
}