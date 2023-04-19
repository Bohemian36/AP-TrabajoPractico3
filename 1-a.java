//Ejercicio 1(a)

public class 1-a {
    public static void main (String [] args) {
        
       String z = "Bohemian Rapsody";
       int contador = 0;
       int lugar = 0;
       char caracter = 'a';
          lugar = z.indexOf(caracter);

      while (lugar != -1 ) {
         contador++;
         lugar = z.indexOf(caracter,lugar+1);
     }
       System.out.println("En el título \"Bohemian Rapsody\", la letra 'a' aparece " + contador +" veces.");
 }
}
