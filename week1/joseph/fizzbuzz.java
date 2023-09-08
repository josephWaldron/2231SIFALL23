package week1.joseph;

public class fizzbuzz {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0; i < numbers.length; i++){
            String output = method1(numbers[i]);
            System.out.println(numbers[i] + ": " + output);
        }
    }
    public static String method1(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }
        else{
            return "";
        }
    }
}
