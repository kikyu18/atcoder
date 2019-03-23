import java.util.*;
public class abc081a{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 3桁の数字を文字列受取
    String s=sc.next();
    // 文字列から0を削除、長さを返す
    s=s.replace("0","");
    System.out.println(s.length());
  }
}
