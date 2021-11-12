package DiccionarioESPIN;
import java.io.*;
public class EscribirDiccionario {

    public void Escribir(File nombreArchivo,String significado)
    {
        try{
            if (!nombreArchivo.exists()){
                nombreArchivo.createNewFile();
            }
            BufferedWriter archivoEsribir=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreArchivo,true),"utf-8"));
            archivoEsribir.write(significado+"\r\n");
            archivoEsribir.close();
        }catch (Exception e){System.out.println("Error");}
    }
}
