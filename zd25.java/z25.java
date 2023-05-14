import java.util.*;

public class ZD25 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String m = number.nextLine();
        String[] num = m.split(" ");
        int summ = 0;
        int x = 0;
        int x1 = 0;
        for(int q = 0; q < num.length; q++){
            x = Integer.parseInt(num[0]);
            x1 = Integer.parseInt(num[1]);
        }
        for(int y1 = x; y1 <= x1; y++){
            ArrayList<String> a = new ArrayList();
            ArrayList<String> a2 = new ArrayList();
            for(int q = 2; q < num.length; q++){
                a2.add(num[q]);
                int y = Integer.parseInt(num[q].trim());
                if(y1 % y == 0){
                    String str = "" + y;
                    a.add(str);
                }
            }
            if(a.equals(a2)){
                summ += y1;
            }
        }
        System.out.println(summ);
    }
}

