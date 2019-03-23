import java.util.*;
public class abc086c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力
    int n = sc.nextInt();
    int[] time = new int[n];
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i=0;i<n;i++){
      time[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      // System.out.println(time[i]);
      // System.out.println(x[i]);
      // System.out.println(y[i]);
    }
    // 実座標,成否判定
    int xMap = 0;
    int yMap = 0;
    int flag = 0;
    // 最終プランまでループ、不可能な時点でflag1でbreak
    for(int i=0;i<n;i++){
      // countはプラン間の時刻差
      int count;
      if(i==0){
        count = time[i];
      }else{
        count = time[i] -time[i-1];
      }
      // xの移動
      // x座標が合うまでmoveを呼び続ける
      while(xMap!=x[i] && count>0){
        int[] ret = move(count,xMap,x[i]);
        count = ret[0];
        xMap = ret[1];
        System.out.println("count:"+count+" x:"+xMap+" y:"+yMap);
        // 途中でcountが0になったら終了判定
        if(count==0 && xMap==x[i] && yMap==y[i]){
          System.out.println("ok");
          break;
        }else if(count==0 && (xMap!=x[i] || yMap!=y[i])){
          System.out.println("out");
          flag=1;
          break;
        }
      }
      if(flag==1){
        break;
      }
      // yの移動
      // y座標が揃うまでmove
      while(yMap!=x[i] && count>0){
        int[] ret = move(count,yMap,y[i]);
        count = ret[0];
        yMap = ret[1];
        System.out.println("count:"+count+" x:"+xMap+" y:"+yMap);
        // 途中でcountが0になったら終了判定
        if(count==0 && xMap==x[i] && yMap==y[i]){
          System.out.println("ok");
          break;
        }else if(count==0 && (xMap!=x[i] || yMap!=y[i])){
          System.out.println("out");
          flag=1;
          break;
        }else if(count>0 && xMap==x[i] && yMap==y[i]){
        //countが残っている場合
          yMap++;
          count--;
        }
      }
    }
    // output
    if(flag==1){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
  public static int[] move(int count, int map, int route){
    if(map<route){
      map++;
      count--;
    }else if(map>route){
      map--;
      count--;
    }
    return new int[] {count, map};
  }
}
