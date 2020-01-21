public class Main5_3{
  public static void methodA(){
    System.out.println("meghodA");
    methodB();
  }
  public static void methodB(){
    System.out.println("methodB");
  }
  public static void main(String[] args){
    methodA();
  }
}
