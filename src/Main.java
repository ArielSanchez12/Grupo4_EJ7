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
        double vel_x,vel_y,tiempo;
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
            vel_x=calculo1.VelocidadInicialX(velocidad,angulo);
            vel_y=calculo1.VelocidadInicialY(velocidad,angulo);
            tiempo = calculo1.TiempoDeVuelo();
            calculo1.AlcanceHorizontal();
            calculo1.setTiempoVuelo(tiempo);
        //impresion de resultados
            System.out.println("----------RESOLUCION----------");
            System.out.println("----------DATOS----------");
            System.out.println("v="+velocidad+"m/s\nθ="+angulo+"°\ng=-9,81 m/s^2");
            System.out.println("----------PASOS----------");
            System.out.println("1. Descomponemos la velocidad en funcion del angulo θ");
            System.out.println("Vx = v*cos(θ)\t\tVy= v*sen(θ)");
            System.out.println("Vx = "+velocidad+"m/s * cos("+angulo+"°)\t\tVy= "+velocidad+"m/s * sen("+angulo+"°)");
            System.out.println("Vx = "+vel_x+"m/s\t\t\t Vy="+vel_y+"m/s");
            System.out.println("2. Calculamos el tiempo de vuelo");
            System.out.println("yf = yo + vy*t +1/2 g*t^2");
            System.out.println("0=0* "+vel_y+"m/s*t + 1/2 * 9,81 m/s^2 * t^2");
            System.out.println ("t ="+tiempo+"s");
            System.out.println("3. Calculamos el desplazamiento horizontal");
            System.out.println("xf = xo + vx*t +1/2 g*t^2");
            System.out.println("xf = 0 m + "+vel_x+"m/s * "+tiempo+"s + 1/2 * 0m/s^2 * ("+tiempo+")^2");
            System.out.println("xf = "+calculo1.AlcanceHorizontal());




    }
}