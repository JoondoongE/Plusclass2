package class2;
import java.util.*;
public class prob4153 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a==0&&b==0&&c==0){break;}

            if((c*c == a*a + b*b)||(a*a == b*b + c*c)||(b*b == a*a + c*c)){
                list.add("right");
            }
            else{
                list.add("wrong");
            }
        }
        sc.close();
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
