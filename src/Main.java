//Integrantes: Patricio Ponce, Richard Padilla, Jose Pila, Ariel Sánchez
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----PLANTEAMIENTO DEL PROBLEMA-----\n" +
                "Se patea un balon desde el suelo a un angulo determinado y con una velocidad inicial" +
                "\n¿Cual es el alcance horizontal del balon?");

        //Instancia de clases
        Scanner ingresar = new Scanner(System. in);
        CalcularAlcanceH calculo1 = new CalcularAlcanceH();

        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());

        //INGRESO DE DATOS
        double velocidadInicialF = 0; //Para almacenar los valores en double que
        double anguloF = 0; //se vinculan con las variables de las clases

        boolean ingresarValido = false; //Para pedirle hasta que ingrese bien
        while (!ingresarValido) {
            try {
                System.out.println("Ingrese la velocidad inicial del objeto: ");
                String velocidadInicial = ingresar.nextLine(); //Esta no es la misma de la clase (ya que esta es STR)
                Number numero = format.parse(velocidadInicial); //Esto es un objeto de la libreria que devuelve un valor tipo numero
                velocidadInicialF = numero.doubleValue(); //Contenedor = objetoNumero.doubleValue()
                calculo1.setVelocidadInicial(velocidadInicialF); //usando los sets de las variables de la clase
                //seteamos este valor con el del contenedor

                System.out.println("Ingrese el angulo del objeto: ");
                String angulo = ingresar.nextLine(); //Lo mismo de arriba
                Number numero2 = format.parse(angulo);
                anguloF = numero2.doubleValue();
                calculo1.setAngulo(anguloF);

                ingresarValido = true;
            } catch (ParseException e) {
                System.out.print("Datos ingresados incorrectamente, vuelve a ingresarlos\n");
            }
        }

        //Imprimir resultados
        System.out.println(calculo1.VelocidadInicialX(calculo1.getVelocidadInicial(), calculo1.getAngulo()));
        System.out.println(calculo1.VelocidadInicialY(calculo1.getVelocidadInicial(), calculo1.getAngulo()));
        System.out.println(calculo1.TiempoDeVuelo());
        System.out.println(calculo1.AlcanceHorizontal());

    }
}