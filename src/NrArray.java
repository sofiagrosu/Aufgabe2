import java.util.List;

public class NrArray {
    private List<Integer> numbers;
    private int n;
    public NrArray(List<Integer> numbers, int n){
        this.numbers = numbers;
        this.n = n;
    }
    public int maxNumber(){
        if(numbers.isEmpty()){
            return 0;
        }
        int max = numbers.get(0);
        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    public int minNumber(){
        if(numbers.isEmpty()){
            return 0;
        }
        int min = numbers.get(0);
        for(int number : numbers){
            if(number < min){
                min = number;
            }
        }
        return min;
    }

    public int maxSum(){
        if(numbers.size() < n){
            return 0;
        }
        int totalSum = 0;
        for(int number : numbers){
            totalSum += number;
        }
        int min = minNumber();
        return totalSum - min;
    }
    public int minSum(){
        if(numbers.size() <n )
            return 0;
        int totalSum = 0;
    }
}
