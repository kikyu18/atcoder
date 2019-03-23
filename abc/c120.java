import java.util.*;
public class c120{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    String s = sc.next();
    int[] count = new int[2];
    for(int i=0;i<s.length();i++){
      if(s.charAt(i) == '0'){
        count[0]++;
      }else{
        count[1]++;
      }
    }

    // 出力
    System.out.println(Math.min(count[0],count[1]) *2);
  }
}
