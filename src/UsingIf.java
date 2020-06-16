public class UsingIf {
    public static void main(String[] args){
      int i = 0;
      // && both
      if (i>1 && i<100){
          System.out.println("1-100");
        }
      // || = or
      else if (i>=100 || i<=0){
          System.out.println("more than 100 or less than 1");
        }

      String s="bye";
      if(s.equalsIgnoreCase("Hello")){
          System.out.println("Say Hello");
      }
      else if (!s.equalsIgnoreCase("hello")){
          System.out.println("Goodbye");
      }

    }
}
