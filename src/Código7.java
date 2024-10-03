import java.util.HashMap;//importar el jashmap
import java.util.Scanner;//importar el scanner

public class Código7 {
    public static void main(String[] args) {//colocar el mainstring

    Scanner s = new Scanner(System.in);//completar el java.lang

    HashMap<String, String> capitales = new HashMap<>();//definir de manera correcta el tipo de dato y evitar conflicto de nombres

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El salvador", "El Salvador");// faltaba el valor de la capital
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String pais = "";//definir correctamente el tipo de dato
    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: ");//la impresion out
      pais = s.nextLine();//corregir ya que es cadena de texto
      
      if (!pais.equals("salir")) {//La forma correcta es equals con s
        if (capitales.containsKey(pais)) {// evitar conflicto de nombres
          System.out.print("La capital de " + pais);
          System.out.println(" es " + capitales.get(pais));//cambio a get
        } else {
          System.out.print("No conozco la capital de " + pais);
          System.out.print("¿cuál es la capital de " + pais + "?: ");
          String ncapital = s.nextLine();//corregi nombre para mayor entendimiento
          capitales.put(pais, ncapital);//agregar la asignacion de nombres correcta
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!pais.equals("salir"));//correccion de while y falta de parentesis
    s.close();//cierre del scanner
  }
}