package DiccionarioESPIN;
import java.io.File;
import java.util.Scanner;

public class buscarSignificado {
    public void buscar(String nombreArchivo, String palabraBuscada){
        Scanner textoIN=null;
        String linea;
        int lineaIni=1;
        boolean comprueba=false;
        try{
            File f= new File("Diccionario.txt");
            textoIN= new Scanner(f);
            while(textoIN.hasNext())
            {
                linea = textoIN.nextLine();
                if (linea.contains(palabraBuscada))
                {
                    String[] separarPalabra = new String[2];
                    separarPalabra = linea.split(" ");
                    System.out.println("La traducción en ingles es: " + separarPalabra[1]);
                    comprueba = true;
                }
                lineaIni++;
            }
            if (!comprueba)
            {
                System.out.println("No se encontro el significado de: " + palabraBuscada);
            }
        }catch (Exception e){System.out.println("Se encontró un error :( ");}

    }
}
