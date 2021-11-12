package DiccionarioESPIN;
import java.io.File;
import java.util.Scanner;

public class Diccionario {

    public static void main(String[] args)
    {
        int opcion=1;
        File archivo= new File("C:/Users/Julian/Desktop/SOFKA/Cursos_plataforma_Sofka_U/Mentorias/TallerMentoria4/Diccionario.txt");
        String pEspanol="";
        String pIngles="";
        String sGuardar="";
        while(opcion!=4) {
            System.out.println("\nBievenido a tu Diccionario Español / Ingles en JAVA");
            System.out.println("\nEste diccionario presenta 4 opciones de trabajo");
            System.out.println("1. Añadir una palabra y su significado al diccionario.");
            System.out.println("2. Impimir el diccionario.");
            System.out.println("3. Buscar una palabra del diccionario.");
            System.out.print("4. Salir de la aplicación.");
            System.out.print("\nFavor digite la opción a trabajar: ");
            Scanner leerOpciones = new Scanner(System.in);
            opcion = Integer.parseInt(leerOpciones.nextLine());

            switch (opcion) {
                case 4:
                    System.out.println("\nEstas saliendo del diccionario. Muchas gracias :D ");
                    break;
                case 1:
                    System.out.println("Ingrese la palabra en español y su significado en ingles");
                    System.out.print("Ingresa la palabra en español :");
                    pEspanol = leerOpciones.nextLine();
                    System.out.print("\nLa palabra ingresada fue: " + pEspanol);
                    pEspanol = pEspanol.toLowerCase();
                    System.out.print("\nIngresa su significado en ingles :");
                    pIngles = leerOpciones.nextLine();
                    System.out.print("\nLa palabra ingresada fue: " + pIngles);
                    pIngles = pIngles.toLowerCase();
                    sGuardar = sGuardar.concat(pEspanol + " " + pIngles);
                    EscribirDiccionario es = new EscribirDiccionario();
                    es.Escribir(archivo, sGuardar);
                    break;
                case 2:
                    System.out.println("\nDiccionario de significados \n");
                    LeerDiccionario d = new LeerDiccionario();
                    d.leer("Diccionario.txt");
                    break;
                case 3:
                    System.out.println("\nIngresa la palabra en español de la cual deseas conocer su significado: ");
                    String palabraBuscada = leerOpciones.nextLine();
                    palabraBuscada = palabraBuscada.toLowerCase();
                    buscarSignificado b = new buscarSignificado();
                    b.buscar("Diccionario.txt", palabraBuscada);
                    break;
            }
        }
    }
}
