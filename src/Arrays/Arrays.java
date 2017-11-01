package Arrays;

public class  Arrays {
    public static void main(String[] args){
        int number = 10;                   //[10]
        int[] numbers = new int[5];       //numbers ->[масив]
        // System.out.println(numbers[0]);  //0 1 2 3 4
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }


    }
}
