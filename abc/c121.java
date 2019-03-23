import java.util.*;
public class c121{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    int store = sc.nextInt(); //店数
    int need = sc.nextInt(); //必要数
    int[] price = new int[store];
    int[] stock = new int[store];
    for(int i=0;i<store;i++){
      price[i] = sc.nextInt();
      stock[i] = sc.nextInt();
    }
    // 取得数と支払金額
    int sum=0;
    int payment=0;
    int minPrice=0;
    int storeIndex=0;
    int storePrice=0;
    // ループ処理
    while(sum!=need){
      //単価の低い順に店を決定
      for(int i=0;i<store;i++){
        if(storePrice<price[i]){
          minPrice=price[i];
          storeIndex=i;
          break;
        }
      }
      // System.out.println(price[storeIndex]+" "+storeIndex+" "+storePrice);
      for(int i=0;i<store;i++){
        if(minPrice>price[i]&&storePrice<price[i]){
          minPrice=price[i];
          storeIndex=i;
        }
      }
      storePrice=minPrice;
      // System.out.println(price[storeIndex]+" "+storeIndex+" "+storePrice);

      // 店が決まったらストックに応じて処理
      if(need==sum){
        break;
      }else if(need<sum){
        System.out.println("error");
        break;
      }else if(need>sum){
        if((need-sum)>stock[storeIndex]){
          sum+=stock[storeIndex];
          payment+=price[storeIndex]*stock[storeIndex];
        }else{
          payment+=price[storeIndex]*(need-sum);
          sum+=(need-sum);
        }
      }
    }
    // 出力
    System.out.println(payment);
  }
  /*
  // 行列計算関数
  public static int[][] multArray(int a[][], int b[][]){
    int ay = a.length;
    int ax = a[0].length;
    int by = b.length;
    int bx = b[0].length;
    int[][] c = new int[ay][bx];
    if(ax!=by){
      return c;
    }
    // 行列積
    for(int i=0;i<ay;i++){
      for(int j=0;j<bx;j++){
        int sum = 0;
        for(int k=0;k<ax;k++){
          sum += a[i][k]*b[k][j];
        }
        c[i][j] = sum;
      }
    }
    return c;
  }
  */
}
