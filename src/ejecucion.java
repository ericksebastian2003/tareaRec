import java.util.Scanner;

////"En el contexto deportivo, diseñar un sistema con una clase principal y dos clases hijas,
//// cada una con atributos encapsulados. Implementar un mecanismo try-catch para gestionar errores en la entrada de datos.
//// Desarrollar métodos para validar la mayoría de edad de los participantes y evaluar su aptitud en una disciplina específica.
//// Definir atributos pertinentes, considerando el tipo de disciplina. Para ser aceptado en el registro,
//// se requiere carecer de sanciones recientes y haberse sometido a exámenes médicos en diciembre de 2023."
class ejecucion {

    public static void main(String[] args) {

        Main p1 = new Main("Joel",0);
        try {
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Ingrese la edad del jugador : ");
            int edadJugador = scanner1.nextInt();
            p1.comprobarEdad(edadJugador);


        } catch (Exception e) {
            System.out.println("El valor ingresado es incorrecto...");
        }

    }
}