
package com.sample.app;

public class Main {

      public static void demoFunction(){
      var a = 10;

      var var = 11; // You can use var as a variable name

      System.out.println("a : " + a);
      System.out.println("var : " + var);

      //You can use var in a for loop.
      for(var i = 0; i < 10; i++){
            System.out.print(i + " ");
      }
      System.out.println();

      //You can use var while defining array
      var primes = new int[] {2, 3, 5, 7};
      for(var i : primes){
                  System.out.print(i + " ");
      }
      System.out.println();

   }

      public static void main(String args[]) {

            demoFunction();

      }
}

