import java.lang.reflect.Array;
import java.util.*;

public class ZD24 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String m = number.nextLine();
        String[] num = m.split(" ");
        int summ = 0;
        int q = 0;
        int q1 = 0;
        for(int m = 0; m < num.length; m++){
            q = Integer.parseInt(num[0]);
            q1 = Integer.parseInt(num[1]);
        }
        for(int x1 = q; x1 <= q1; x1++){
            List<Integer> nums2 = new ArrayList();
            for(int m = 2; m < num.length; m++){
                int x = Integer.parseInt(num[m].trim());
                if(x1 % x == 0){
                    String str = "" + x;
                    if(num[m].equals(str)){
                        nums2.add(x1);
                    }
                }
            }
            Set<Integer> set = new HashSet(nums2);
            nums2.clear();
            nums2.addAll(set);
            for(int y : set){
                summ += y;
            }
        }
        System.out.println(summ);
    }
}


