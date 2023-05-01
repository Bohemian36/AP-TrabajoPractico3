public class 2 {
    public static void main (String [] args) {
       String z = "Bink 182;Twenty one pilots;Paramore;My chemical romance;Bob Marley;Charly Garcia;Nirvana;Queen;Lana del Rey;Pink Floyd;";
       String split [] = z.split(";");
         for (String elemento : split) {
          System.out.println(elemento);
       }
     }
   }
