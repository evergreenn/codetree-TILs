import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner s = new Scanner(System.in);
        ArrayList<String> answer=new ArrayList<>();

        String[] arr=new String[10];
        for(int i=0;i<10;i++){
            arr[i]=s.nextLine();
        }
        String target= s.nextLine();

        for(int i=0;i<10;i++){
            String str=arr[i];
            if(str.charAt(str.length()-1)==target.charAt(0)){

            answer.add(str);
            }

        }

        for(String str : answer){
            System.out.println(str);
        }
    }
}