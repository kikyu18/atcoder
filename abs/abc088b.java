import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
public class abc088b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // N,a1~anを取得
    int N = sc.nextInt();
    Integer[] a = new Integer[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    int alice=0,bob=0;
    // 配列を照準にソート
    Arrays.sort(a, Comparator.reverseOrder());
    // 奇数番目の要素ならアリスに、偶数番目の要素ならボブにインクリメント
    for(int i=0;i<N;i++){
      if(i%2!=0){
        bob += a[i];
      }else if(i%2==0){
        alice += a[i];
      }
    }
    // 出力
    System.out.println(alice-bob);
  }
}
