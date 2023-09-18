package week2.vince;

public class trace {
    public static void main(String[] args){
        int[] array = {18,15,17,3,99,6,5};
        double avg = 0;

        for(int currentVal : array){
            avg += currentVal;
        }

        avg /= array.length;

        System.out.println(avg);
    }
}
