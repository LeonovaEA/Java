import java.util.Scanner;

public class Main {
    private static final String TAG_BOOK = "Book";
    private static final String TAG_NEWSPAPER = "Newspaper";
    private static final String TAG_MAGAZINE = "Magazine";
    public static void main(String[] args) {
        int i =0;
        while(i!=4){
            System.out.println("""
                    <Газетный киоск>
                    1.Добавить
                    2.Купить
                    3.Изменить данные
                    4.Выход""");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            switch (i){
                case 1 -> add();
                case 2 -> buy();
                case 3 -> change();
            }
        }
    }
    public static void add(){
        Scanner scanner = new Scanner(System.in);
        NewspaperKiosk kiosk = new NewspaperKiosk();
        System.out.println("""
                Какой тип:
                1.Книги
                2.Газеты
                3.Журналы""");
        int sc = scanner.nextInt();
        String type = sc==1?TAG_BOOK:
                sc==2?TAG_NEWSPAPER:TAG_MAGAZINE;
        System.out.println("Название:");
        String name = scanner.next();
        System.out.println("Количество:");
        int quantity = scanner.nextInt();
        kiosk.addProduct(type,name,quantity);
        System.out.println("""
                .-------------.
                Товар добавлен в базу данных.
                """);
    }
    public static void buy(){
        Scanner scan = new Scanner(System.in);
        NewspaperKiosk kiosk = new NewspaperKiosk();
        System.out.println("""
                Какой товар хотели бы купить?
                1.Книги
                2.Газеты
                3.Журналы""");
        int i = scan.nextInt();
        System.out.println("В наличие есть:\n");
        switch (i){
            case 1 -> {
                kiosk.print(TAG_BOOK);
                System.out.println("Введите название:");
                String name = scan.next();
                System.out.println("Введите количество:");
                int quantity = scan.nextInt();
                kiosk.sellProduct(TAG_BOOK, name,quantity);
            }
            case 2 -> {
                kiosk.print(TAG_NEWSPAPER);
                System.out.println("Введите название:");
                String name = scan.next();
                System.out.println("Введите количество:");
                int quantity = scan.nextInt();
                kiosk.sellProduct(TAG_NEWSPAPER, name,quantity);
            }
            case 3 -> {
                kiosk.print(TAG_MAGAZINE);
                System.out.println("Введите название:");
                String name = scan.next();
                System.out.println("Введите количество:");
                int quantity = scan.nextInt();
                kiosk.sellProduct(TAG_MAGAZINE, name,quantity);
            }
        }
    }
    public static void change(){
        Scanner scan = new Scanner(System.in);
        NewspaperKiosk kiosk = new NewspaperKiosk();
        System.out.println("Введите имя: ");
        String oldName = scan.next();
        System.out.println("""
                            Выберете тип:
                            1.Книги
                            2.Газеты
                            3.Журналы
                            """);
        int sc = scan.nextInt();
        String oldType = sc==1?TAG_BOOK:sc==2?TAG_NEWSPAPER:TAG_MAGAZINE;
        System.out.println("""
                Что изменить?
                1.Тип
                2.Имя
                3.Количество
                """);
        int i = scan.nextInt();
        switch (i){
            case 1 ->{
                System.out.println("""
                            Выберете новый тип:
                            1.Книги
                            2.Газеты
                            3.Журналы
                            """);
                int j = scan.nextInt();
                String newType = j==1?TAG_BOOK:j==2?TAG_NEWSPAPER:TAG_MAGAZINE;
                kiosk.newType(oldType, newType, oldName);
            }
            case 2 ->{
                System.out.println("Введите новое название: ");
                String newName = scan.next();
                kiosk.newName(oldType, newName, oldName);
            }
            case 3 ->{
                System.out.println("Введите новое значение: ");
                int newQuantity = scan.nextInt();
                kiosk.newQuantity(oldType, oldName, newQuantity);
            }
        }
    }
}