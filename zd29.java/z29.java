import java.util.Scanner;

public class ZD29 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.nextLine();
        int num1_int = Integer.parseInt(num1.trim());
        int num2 = scan.nextInt() - 1;
        int summ = 0;
        String[] nums = num1.split("");
        for(int q = 0; q < nums.length; q++){
            num2++;
            int n = Integer.parseInt(nums[q].trim ());
            summ += Math.pow(n,num2);

        }
        if(summ % num1_int == 0){

            System.out.println(true);

        } else {
            System.out.println(false);


        }



    }
}


