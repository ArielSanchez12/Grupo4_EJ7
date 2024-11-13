//Pongan sus nombres aquí: Ariel Sánchez
//Integrante 1: Patricio Ponce


import javax.lang.model.element.VariableElement;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Se patea un balón desde el suelo a un ángulo de 45°  y
// con velocidad inicial de 17 m/s. ¿Cuál es el alcance horizontal del balón?
public class Main {
    public static void main(String[] args) {
        int velocidad = 0, grados=0;
        double angulo = 0,vel_x,vel_y;
        Scanner scan = new Scanner(System.in);
        //Planteo del problema
        System.out.println("------PLANTEAMIENTO DEL PROBLEMA------");
        System.out.println("Se patea un balón desde el suelo a un ángulo determinado y con una velocidad inicial." +
                "\n¿Cuál es el alcance horizontal del balón?");
        //Ingreso de datos con excepcion de que sea entero
        try {
            System.out.print("Ingrese la velocidad inicial del balon: ");
            velocidad = scan.nextInt();
            System.out.print("Ingrese el angulo que ira el balon: ");
            grados = scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Error al ingresar el valor numerico.");
        }
        //Conversion de grados a radianes para uso de seno y coseno
        angulo = (double) grados * Math.PI/180;
        //Parametro que descompone la velocidad en Vx y Vy
        vel_x=(double) velocidad * Math.cos((double) angulo);
        vel_y=(double) velocidad * Math.sin((double) angulo);
        System.out.println("COMPONENTES DE LA VELOCIDAD EN X Y Y");
        System.out.println("x: "+vel_x+"\ty: "+vel_y);
        //Creacion de instancias y envio de parametros
        Componente_x x = new Componente_x(vel_x,angulo);
        Componente_y y = new Componente_y(vel_y, angulo);
        //Llamado de funciones

    }
}