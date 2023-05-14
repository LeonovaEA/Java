import java.util.Scanner;
public class ZD23 {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        int n = val.nextInt();
        int num1 = val.nextInt();
        int num2 = val.nextInt();
        int count = 0;
        for(int q = 1; q <= n;q++){
            if(q % num1 == 0||q % num2 == 0){
                count += q;
            }
        }
        System.out.println(count);
    }
}


