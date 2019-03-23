import java.util.*;
public class abc085b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // N,a1~anを取得
    int N = sc.nextInt();
    Set<Integer> a = new HashSet<Integer>();
    for(int i=0;i<N;i++){
      a.add(sc.nextInt());
    }
    // 配列の要素数を出力
    System.out.println(a.size());
  }
}
