import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //10:53
        Scanner s=new Scanner(System.in);
        String str=s.next();
    

        char first=str.charAt(0);

        String answer=String.valueOf(first);
        int cnt=1;

        for(int i=1;i<str.length();i++){
              
            if(first==str.charAt(i)){
                cnt++;

            }else{
                answer+=String.valueOf(cnt);
                cnt=1;
                first=str.charAt(i);
                answer+=String.valueOf(first);
            }
        }
        if(cnt==1){

        answer+=String.valueOf(cnt);
        answer+=first;
        }else{
            answer+=String.valueOf(cnt);
        }
        System.out.println(answer.length());
        System.out.println(answer);
    }
}