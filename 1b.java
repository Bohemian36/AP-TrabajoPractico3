public class 1b {
    public static void main (String [] args) {
     int [] z = new int [3];
      z[0] =27;
      z[1] =90;
      z[2] =36;
        System.out.println ("Lo números elegidos son: " + z[0]+"-"+z[1]+"-"+z[2]);
        System.out.println ("Y su decreciente es: ");
       if (((z[0]>z[1]) && (z[0]>z[2])) && ((z[1]<z[0]) && (z[1]>z[2]))) {
        System.out.print(z[0]+" "+z[1]+" "+z[2]);
      }else if ((z[0]>z[1] && z[0]>z[2]) && (z[2]<z[0] && z[2]>z[1])) {
        System.out.print(z[0]+" "+z[2]+" "+z[1]);
      }else if ((z[1]>z[0] && z[1]>z[2]) && (z[0]<z[1] && z[0]>z[2])) {
        System.out.print(z[1]+" "+z[0]+" "+z[2]);
      }else if ((z[1]>z[0] && z[1]>z[2]) && (z[2]<z[1] && z[2]>z[0])) {
        System.out.print(z[1]+" "+z[2]+" "+z[0]);
      }else if ((z[2]>z[0] && z[2]>z[1]) && (z[1]<z[2] && z[1]>z[0])) {
        System.out.print(z[2]+" "+z[1]+" "+z[0]);
      }else{
        System.out.print(z[2]+" "+z[0]+" "+z[1]);
      }  
    }
  }
