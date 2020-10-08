
package Almacenamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;



public class Datos {
     public String UsuG, CosG;
    public String UsuarioG, ContraseñaG,PreguntaA,PalabraG;
    public String Clave;
    public String Us;
     public String UsuR,PregR,PalR;
  
    
     
    

    
    public String guardar() {
        try {
            File asd = new File("C:\\Privado");
            if (!asd.exists()) {
                asd.mkdirs();
            }
            FileWriter fl = new FileWriter("C:\\Privado\\Confidencial.txt", true);
            BufferedWriter Bf = new BufferedWriter(fl);
            Bf.write(UsuarioG + ";" + ContraseñaG + ";" +PreguntaA + ";" + PalabraG + ";" );
            Bf.newLine();
            Bf.close();
        } catch (Exception e) {
            return "1-Error cath";
        }
        return "2-Guardado Correctamente";

    }
    
     public String Buscar() {
        try {
            String retornar;
            File as = new File("C:\\Privado\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 3);
                if (Line[0].equals(UsuG)) {
                    if (Line[1].equals(CosG)) {
                        retornar = ("Correcto" + ";" + Line[0] + ";" + Line[1] + ";" + Line[2] );
                        File.close();
                        return retornar;

                    }

                    return "1-Clave incorrecta";
                }
            }

        } catch (Exception e) {
        }
        return "1-No existe en la Base de Datos";
    }
     
      public String BuscarUp() {
        try {
            String retornar;
            File as = new File("C:\\Privado\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 3);
                if (Line[0].equals(Us)) {
                   
                        retornar =  ("Correcto" + ";" + Line[0] + ";" + Line[1] + ";" + Line[2] );
                        File.close();
                        return retornar;
                }
            }

        } catch (Exception e) {
        }
        return "1-No existe en la Base de Datos";
    }
      
      public String BuscarUpr() {
        try {
            String retornar;
            File as = new File("C:\\Privado\\Confidencial.txt");
            BufferedReader File = new BufferedReader(new FileReader(as));
            String Linea;

            while ((Linea = File.readLine()) != null) {
                String[] Line = Linea.split(";", 5);
                 if (Line[0].equals(UsuR)) {
                    
                if (Line[2].equals(PregR)) {  
                   
                if (!Line[3].equals(PalR+";")) {
                        retornar = ("Correcto"+";"+Line[0] + ";" + Line[1] + ";" + Line[2]+ ";" + Line[3] + ";" + Line[4] + ";");
                        File.close();
                        return retornar;
                    } 

                    
                }
             return "0-Palabra incorrecta";
            }
                 
            }

        } catch (Exception e) {
        }
        return "1-No existe en la Base de Datos";
    }

}
