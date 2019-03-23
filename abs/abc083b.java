import java.util.*;
public class abc083b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // N,a,bを取得
    int N = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count=0;
    // Nまでfor文
    for(int i=1;i<=N;i++){
      // １０で割ったあまりを加え、商をまた割る。
      // 商が０になったらbreak
      int sum = countSum(i);
      // System.out.println(i);
      // a以上b以下ならインクリメント
      if(sum >= a && sum <= b){
        // System.out.println(sum);
        count += i;
      }
    }
    // 出力
    System.out.println(count);
  }

  public static int countSum(int num){
    int sum=0;
    // 各桁の和
    while(num>0){
      sum += num%10;
      num=num/10;
    }
    return sum;
  }
}
