//"En el contexto deportivo, diseñar un sistema con una clase principal y dos clases hijas,
// cada una con atributos encapsulados. Implementar un mecanismo try-catch para gestionar errores en la entrada de datos.
// Desarrollar métodos para validar la mayoría de edad de los participantes y evaluar su aptitud en una disciplina específica.
// Definir atributos pertinentes, considerando el tipo de disciplina. Para ser aceptado en el registro,
// se requiere carecer de sanciones recientes y haberse sometido a exámenes médicos en diciembre de 2023."

import java.util.Scanner;

class Main {
    private String nombreJugador;
    private int edadJugador;

    public Main(String nombreJugador, int edadJugador) {
        this.nombreJugador = nombreJugador;
        this.edadJugador = edadJugador;
    }

    public int getEdadJugador() {
        return edadJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }
    public void setNombreJugador(String nombreJugador)
    {
        this.nombreJugador=nombreJugador;
    }
    public void setEdadJugador(int edadJugador)
    {
        this.edadJugador=edadJugador;
    }
    public void registroDatos(String nombreJugador,int edadJugador){

        System.out.println("El nombre del jugador es " + nombreJugador );
        System.out.println(nombreJugador+" tiene "+edadJugador+" años...");



    }
    public void comprobarEdad(int edadJugador) {
        Main p2 = new Main("Joel",0);
        if (edadJugador >= 18) {
            System.out.println("Cumple con la mayoría de edad...");

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Ingrese el número de sanciones del jugador : ");
            int numSanciones = scanner2.nextInt();
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("¿Se ha sometido a exámenes médicos en diciembre de 2023...?");
            System.out.println("1. Si 2. No");
            int pregunta = scanner3.nextInt();
            if (numSanciones == 0 && pregunta == 1) {
                System.out.println("Cumple con los dos requisitos...");
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el nombre del jugador : ");
                nombreJugador=scanner.nextLine();

                p2.registroDatos(nombreJugador,edadJugador);
            } else if (numSanciones >= 1 || pregunta == 2) {
                System.out.println("No cumple con los requisitos");
            }

        }
        else {
            System.out.println("No cumple con la edad");
        }

    }

}
class equipo extends Main {
    private String nombreEquipo;
    public equipo(String nombreEquipo,String nombreJugador,int edadJugador) {
        super(nombreJugador,edadJugador);
        this.nombreEquipo=nombreEquipo;
    }
    public String getNombreEquipo()
    {
        return nombreEquipo;
    }
    public void setNombreEquipo(String nombreEquipo)
    {
        this.nombreEquipo=nombreEquipo;
    }


}

class deportes extends Main{
    private String nombreDeporte;
    public deportes(String nombreDeporte,String nombreJugador , int edadJugador)
    {
        super(nombreJugador,edadJugador);
        this.nombreDeporte=nombreDeporte;
    }
    public String getNombreDeporte(){
        return nombreDeporte;
    }
    public void setNombreDeporte(String nombreDeporte)
    {
        this.nombreDeporte=nombreDeporte;
    }



}