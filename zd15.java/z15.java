import java.util.LinkedHashSet;

public class ZD15 {
    public static void main(String[] args){
        String stroka1 = line("abc ac abc dsc ab abc ab acs acs");
        System.out.println(stroka1);
    }
    public static String line(String stroka1){
        String str="";
        String[] arr=stroka1.split(" ");
        LinkedHashSet<String> spisok = new LinkedHashSet<String>();
        for (int q = 0; q < arr.length; q++) {
            spisok.add(arr[q]);
        }
        for(String s:spisok){
            str=str+s+" ";
        }
        return str;
    }
}

