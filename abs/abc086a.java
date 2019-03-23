import java.util.*;
public class abc086a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // スペース区切りの整数の入力
    int a=sc.nextInt();
    int b=sc.nextInt();
    // 両方奇数ならOdd、その他はEven
    if(a%2!=0&&b%2!=0){
      System.out.println("Odd");
    }
    else{
      System.out.println("Even");
    }
  }
}
