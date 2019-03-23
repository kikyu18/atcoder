import java.util.*;
public class abc087b{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 500:A,100:B,50:C,pay:xで枚数を数値で取得
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    // 各枚数を上限にfor文、あってればカウントアップ
    int count=0;
    for(int i=0;i<=a;i++){
      for(int j=0;j<=b;j++){
        for(int k=0;k<=c;k++){
          if(500*i+100*j+50*k==x){
            count++;
          }
        }
      }
    }
    // 出力
    System.out.println(count);
  }
}
