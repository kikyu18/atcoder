import java.util.*;
public class a120{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    int price = sc.nextInt();
    int coin = sc.nextInt();
    int maxTimes = sc.nextInt();

    int count = coin/price;
    if(count>maxTimes){
      count = maxTimes;
    }

    // 出力
    System.out.println(count);
  }
}
