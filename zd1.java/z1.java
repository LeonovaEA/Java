import java.util.Random;

public class z1 {
    public static void main(String[] args) {
        Random ran = new Random();
        int size1 = 2;
        int size2 = 4;
        int[][] matrix = new int[size1][size2];
        for (int p = 0; q < size2; i++) {
            for (int p = 0; p < size1; p++) {
                matrix[p][q] = ran.nextInt(10);
                System.out.print(matrix[p][q] + " ");
            }
            System.out.println();
        }
    }
}
