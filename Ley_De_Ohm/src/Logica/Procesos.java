
package Logica;

import Almacenamiento.Datos;

public class Procesos {
    
    public String Usu, Cos;
    public String UsuarioGG, ContraseñaGG, PreguntaG, PalabraGG;
    public String PClaveL;
    public String Usup;
    public String Usupr,Palr,Pregr;



    public Procesos(String Usuario, String Contraseña) {
       Usu = Usuario;
        Cos = Contraseña;
    }

    public Procesos(String RUsuario, String RContraseña, String Preg, String RPalabra) {
        UsuarioGG = RUsuario;
        ContraseñaGG = RContraseña;
        PreguntaG = Preg;
        PalabraGG = RPalabra;
    }

    public Procesos(String Usuario,String RrPalabra, String RrPregunta) {
        Usupr = Usuario;
        Palr = RrPalabra;
        Pregr = RrPregunta;
    }

    public Procesos(String Usuario) {
       Usup = Usuario;
    }
    
  

   
    
    public String guardar() {
        String respuesta = "";
        
       if(UsuarioGG.equals("")){
       return "1-Ingrese Usuario";
       }
       if(ContraseñaGG.equals("")){
       return "1-Ingrese Contraseña";
       }
        if(PreguntaG.equals("Seleccionar")){
       return "1-Ingrese Pregunta de seguridad";
       }
       if(PalabraGG.equals("")){
       return "1-Ingrese Palabra de Seguridad";
       }
        Datos U = new Datos();
        U.UsuarioG = UsuarioGG;
        U.ContraseñaG = ContraseñaGG;
        U.PreguntaA = PreguntaG;
        U.PalabraG = PalabraGG;
        respuesta = U.guardar();
        return respuesta;

    }
    
      public String Buscar() {
        if (Usu.equals("")) {
            return "1-Nombre de Usuario Vacio";
        }
        if (Cos.equals("")) {
            return "1-Campo de Clave vacia";
        }
        String respuesta = "";

        Datos L = new Datos();
        L.UsuG = Usu;
        L.CosG = Cos;
        respuesta = L.Buscar();

        return respuesta;
    }
      
      public String BuscarUP() {
        if (Usup.equals("")) {
            return "1-Nombre de Usuario Vacio";
        }
        String respuesta = "";

        Datos L = new Datos();
        L.Us = Usup;
        respuesta = L.BuscarUp();

        return respuesta;
    }
      
       public String BuscarUPR() {
//        if (Usupr.equals("")) {
//            return "1-Nombre de Usuario Vacio";
//        }
        String respuesta = "";

        Datos L = new Datos();
          L.UsuR = Usupr;
          L.PregR = Pregr;
          L.PalR =  Palr;
        respuesta = L.BuscarUpr();

        return respuesta;
    }
       
       public String Val() {
       String Re = null;
       
       
       return Re;
       }

}
