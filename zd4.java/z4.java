public class ZD4 {
    public static void main(String[] args){
        int s = str_count("Hello", 'q');
        int s1 = str_count("Hello", 'e');
        int s2 = str_count("", 'm');
        System.out.println(s + "\n" + s1 + "\n" + s2);
    }
    public static int str_count(String str, char letter){
        int count = 0;
        for(int n = 0; n < str.length(); n++){
            char x = str.charAt(n);
            if(x == letter) {
                count++;
            }
        }
        return count;
    }
}
