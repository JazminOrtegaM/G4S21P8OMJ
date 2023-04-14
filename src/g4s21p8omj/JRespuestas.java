
package g4s21p8omj;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "Andres Manuel","Lenovo","HTML","Napoles","21"
    };
    
    String[] radioR = {
        "Andres Manuel,Peña Nieto,Vicente Fox, Salinas de Gortari",
        "Lenovo,HP,Toshiba,Acer",
        "HTML,Python,C,JavaScript",
        "Barcelona,Paris,Napoles,Moscow",
        "28,25,20,21"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
