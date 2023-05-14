import java.util.Arrays;


public class ZD18 {
    public static void main(String[] args){
        int[] array1 = new int[] {2,7,4,20,9,0,21};
        int[] array2 = leftArray(array1);
        int[] array3 = rightArray(array1);
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array3));
    }
    public static int[] leftArray(int[] array){
        for(int n = 0; n < array.length; n++){
            if(array[n] == Arrays.stream(array).max().getAsInt()){
                array = Arrays.copyOf(array,n);
            }

        }
        return array;
    }
    public static int[] rightArray(int[] arr){
        int idx = -1;
        for (int n = 0; n < arr.length; n++) {
            if(arr[n] == Arrays.stream(arr).max().getAsInt()){
                idx = n;
            }
        }
        int[] x = Arrays.copyOfRange(arr, idx+1, arr.length);
        return x;
    }
}

