public class Main1_4{
  public static void main(String[] args){
    double tax=1.08;
    int fax=5;
    System.out.println("５万円から４万円に値上げします");
    fax=4;
    System.out.println("FAXの新価格（税込み）");
    System.out.println(fax*tax+"万円");
  }
}
