import java.util.Scanner;

public class ZD3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float triangle[][] = new float[3][2];
        int x = 1;
        for(int q = 0; q < 3; q++){
            System.out.println("Введите координаты " + x + "вершины треугольника");
            x++;
            for(int c = 0; c < 2; c++){
                triangle[c][c] = in.nextInt();
            }
        }
        System.out.println("Барицентр треугольника равен=>" + "{"
                + (triangle[0][0] + triangle[1][0] + triangle[2][0])/3 + ","
                + (triangle[0][1] + triangle[1][1] + triangle[2][1])/3 + "}");
    }
}
