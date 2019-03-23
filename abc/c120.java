import java.util.*;
public class c120{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    String str = sc.next();

    int count = 0;

    while(true){
      int flag = 0;
      String tmpStr = str.replaceFirst("01", "");
      if(str.length()!=tmpStr.length()){
        count+=2;
        flag=1;
        str = tmpStr;
      }
      tmpStr = str.replaceFirst("10", "");
      if(str.length()!=tmpStr.length()){
        count+=2;
        flag=1;
        str = tmpStr;
      }

      if(flag==0){
        break;
      }
    }

    // 出力
    System.out.println(count);
  }
}
