import java.util.Scanner;

public class ZD27 {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static char sym_right(char symbol, int indent){
        return alphabet.charAt((alphabet.indexOf(symbol)+indent) % alphabet.length());
    }
    private static char sym_left(char symbol, int indent){
        if (alphabet.indexOf(symbol)-indent < 0){
            return alphabet.charAt(alphabet.length() + (alphabet.indexOf(symbol) - indent));
        } else {
            return alphabet.charAt(alphabet.indexOf(symbol)-indent);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Введите (left или right):");
        String direction = scan.nextLine();
        int num = scan.nextInt();
        char stroka1 = ' ';
        for (int p = 0; p < str.length(); p++) {
            for(int q=0;q < num+1;q++) {
                if (direction.equals("left")){
                    stroka1 = sym_left(str.charAt(p), q);

                }
                if (direction.equals("right")){
                    stroka1 = sym_right(str.charAt(p), q);
                }

            }
            System.out.print(stroka1);
        }
    }
}


