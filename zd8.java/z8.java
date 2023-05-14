import java.util.Arrays;
import java.util.Scanner;

public class ZD8 {
    public static void main(String[] args){
        System.out.println("Введите 3 числа");
        Scanner m = new Scanner(System.in);
        double[] triangle = new double[3];
        for (int x = 0; x < 3;x++){
            triangle[x] = n.nextInt();
            if (triangle[0] + triangle[1] > triangle[2] &
                    triangle[1] + triangle[2] > triangle[0] &
                    triangle[0] + triangle[2] > triangle[1]){
                double cos = (triangle[0]*triangle[0] + triangle[1]*triangle[1]
                        - triangle[2]*triangle[2])/(2*triangle[0]*triangle[1]);
                double cos1 = (triangle[1]*triangle[1] + triangle[2]*triangle[2]
                        - triangle[0]*triangle[0])/(2*triangle[1]*triangle[2]);
                double cos2 = (triangle[0]*triangle[0] + triangle[2]*triangle[2]
                        - triangle[1]*triangle[1])/(2*triangle[0]*triangle[2]);
                double[] integers = new double[] {cos,cos1,cos2};
                double max = Arrays.stream(integers).max().getAsDouble();
                double degrees = Math.acos(max);
                System.out.println(180 - degrees*180.0d/Math.PI);
            }
        }
    }
}
