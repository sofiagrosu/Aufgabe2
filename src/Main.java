public class Main {
    public static void main(String[] args){
    NrArray arr = new NrArray(5, 4, 8, 3, 10, 17);
    System.out.println("Max: " + arr.maxNumber());//17
    System.out.println("Min: " + arr.minNumber());//3
    System.out.println("Max Sum: " + arr.maxSum());//39
    System.out.println("Min Sum: " + arr.minSum());//25

      //  NrArray arr1 = new NrArray(5,  8, 3, 10, 17);//exception
    }
}
