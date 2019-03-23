import java.util.*;
public class abc085c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // N,Yを取得
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int flag = 0;
    // i,j,kでループ　iは10000、jは5000、kは1000
    for(int i=N;i>=0;i--){
      for(int j=N-i;j>=0;j--){
        int k = N-i-j;
        if(Y==10000*i+5000*j+1000*k){
          flag = 1;
          System.out.println(i+" "+j+" "+k);
        }
      }
      if(flag==1){
        break;
      }
    }
    // 出力
    if(flag==0){
      System.out.println("-1 -1 -1");
    }
  }
}
