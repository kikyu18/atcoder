import java.util.*;
public class b120{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    ArrayList<Integer> divisor  = new ArrayList<Integer>();
    for(int i= a;i>0;i--){
      if(a%i==0 && b%i==0){
        divisor.add(i);
      }
    }

    // 出力
    System.out.println(divisor.get(k-1));
  }
}
