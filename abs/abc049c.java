import java.util.*;
public class abc049c{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // Sを取得
    String S = sc.next();
    // eraser,erase,dream,dreamerの順で削除
    S = S.replaceAll("eraser","");
    S = S.replaceAll("erase","");
    S = S.replaceAll("dreamer","");
    S = S.replaceAll("dream","");
    // 出力
    if(S.equals("")){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
