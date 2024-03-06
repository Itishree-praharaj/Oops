class Dimensions {
   int height;
   int width;
   int length;

   Dimensions() {

   }

   Dimensions(int h, int w, int l) {
      height = h;
      width = w;
      length = l;  
   }

   Dimensions(int n) {
      this(n, n, n);
   }

   void displayDimensions() {
      System.out.println("Height = " + height);
      System.out.println("Width = " + width);
      System.out.println("Length = " + length);
   }
}

class Test4 {
   public static void main(String[] args) {
      Dimensions d1 = new Dimensions();
      d1.displayDimensions();
      System.out.println("********************");
      Dimensions d2 = new Dimensions(20);
      d2.displayDimensions();
      System.out.println("********************");
      Dimensions d3 = new Dimensions(10, 20, 30);
      d3.displayDimensions();
   }
}
