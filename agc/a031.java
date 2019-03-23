import java.util.*;
public class a031{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 入力を取得
    int N = sc.nextInt(); //文字列長さ
    String str = sc.next(); //文字列
    String[] units = str.split("",0);
    int count=0;
    // Nまでfor文、二進変換、比較して文字列生成
    for(int i=1;i<Math.pow(2,N);i++){
      String[] bin= toBinary(i,N);
      String tempStr="";
      Set<String> setStr = new HashSet<String>();
      for(int j=0;j<N;j++){
        if(bin[j]=="1"){
          tempStr= tempStr+units[j];
          setStr.add(String.valueOf(units[j]));
        }
        // System.out.println(setStr+tempStr);
      }
      // tempStrをsetに格納、長さ比較
      if(setStr.size()==tempStr.length()){
        count++;
      }
    }
    // 出力
    System.out.println(count%((int)Math.pow(10,9)+7));
  }
  
  // 二進変換関数
  public static String[] toBinary(int num, int N){
    int count=0;
    String binaryStr[]=new String[N];
    for(int i=0;i<N;i++){
      binaryStr[i]="0";
    }
    while(true){
      count++;
      if(num%2==1){
        binaryStr[N-count]="1";
        // System.out.println(binaryStr);
      }else if(num%2==0){
        binaryStr[N-count]="0";
      }
      num=num/2;
      if(num==0){
        break;
      }
    }
    return binaryStr;
  }
}
