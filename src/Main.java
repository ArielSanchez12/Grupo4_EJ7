//Pongan sus nombres aquí: Ariel Sánchez
//Integrantes: Patricio Ponce, Richard Padilla, Jose Pila
import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----PLANTEAMIENTO DEL PROBLEMA-----\n" +
                "Se patea un balón desde el suelo a un ángulo determinado y con una velocidad inicial." +
                "\n¿Cuál es el alcance horizontal del balón?");
        //Variables
        int angulo=0, velocidad=0;
        //Instancia de clases
        Scanner ingresar = new Scanner(System. in);
        CalcularAlcanceH calculo1 = new CalcularAlcanceH();

        //INGRESO DE DATOS
            try {
                System.out.print("Ingrese la velocidad inicial del balon: ");
                velocidad = ingresar.nextInt();
                System.out.print("Ingrese el angulo de direccion: ");
                angulo = ingresar.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Datos ingresados incorrectamente....");
            }
        //OBJETO DONDE SE GUARDARA LOS RESULTADOS
            calculo1.setAngulo((double)angulo);
            calculo1.setVelocidadInicial((double)velocidad);
            calculo1.VelocidadInicialX(velocidad,angulo);
            calculo1.VelocidadInicialY(velocidad,angulo);
        // PARTE DEL INSERTAR, AQUI...


    }
}