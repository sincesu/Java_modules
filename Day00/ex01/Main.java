public class Main {
   public Main() {
   }

   static int topla(int var0, int var1) {
      return var0 + var1;
   }

   static void selamVer(String var0) {
      System.out.println("Selam " + var0 + ", Java'ya hoş geldin!");
   }

   public static void main(String[] args) {
      System.out.println(topla(3, 5));
      String var1 = Integer.toString(10);
      selamVer(var1);
   }
}
