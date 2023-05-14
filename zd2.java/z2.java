import java.util.*;

public class ZD2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добавить работника введите 1");
        System.out.println("Для завершения работы введите значение от 0 и 1");
        List<String> listok = new ArrayList<String>();
        var x = in.nextInt();
        int q = 0;
        if (x < 2) {
            if(x==1){
                q++;
                listok.add("true");
            } else {
                listok.add("false");
            }
        }
        while (x < 2){
            x = in.nextInt();
            if (x == 1){
                q++;
                listok.add("true");
            } else {
                listok.add("false");
            }
        }
        int index = listok.size() - 1;
        listok.remove(index);
        System.out.println(listok + "\n" + "Всего работников: " + q);
    }
}
