public class test {

   public static void main(String[] args) {

      for (int i = 1; i < 10; i++) {

          for (int j = 1; j < 10; j++) {

             if (i * j < 10) {

                System.out.print(i + "x" + j + "=" + i * j + "  ");

             } 
	     else {

                System.out.print(i + "x" + j + "=" + i * j + "  ");

             }

          }

         System.out.print("\n");
      }
    }
}