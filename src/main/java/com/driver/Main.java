package com.driver;

public class Main {
   public void main(String[] args) {
         Product p = new Product();
         p.product(0,0);
         p.product(0,0,0);
         p.product(0.0,0.0);

   }
   class Product{
      public int product(int x, int y) {return 0;}
      public int product(int x, int y, int z) {return 0;}
      public double product(double x, double y) {return 0;}
   }
}
