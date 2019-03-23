import java.util.*;
public class b121{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // H,W,h,wを取得
    int N = sc.nextInt(); //列数
    int M = sc.nextInt(); //行数
    int C = sc.nextInt(); //const
    int[][] A = new int[N][M];
    int[][] B = new int[M][1];
    for(int i=0;i<M;i++){
      B[i][0] = sc.nextInt();
    }
    for(int i=0;i<N;i++){
      for(int j=0;j<M;j++){
        A[i][j] = sc.nextInt();
      }
    }
    // 行列計算
    int[][] ansMat = new int[M][1];
    ansMat = multArray(A,B);
    // -c以上の数だけインクリメント
    int count = 0;
    // System.out.println(ansMat.length+" "+ansMat[0].length);
    for(int i=0;i<N;i++){
      if(ansMat[i][0]>-C){
        count++;
      }
    }
    // 出力
    System.out.println(count);
  }
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
}
