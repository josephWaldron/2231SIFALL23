package week7;

public class question2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //sum all even numbers 1-50
        int sum = 0;
        for(int i = 1; i <= 50; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        //System.out.println(sum);

      
        int[][][] threeD = new int[3][3][3];

        for(int i = 0; i < threeD.length; i++){
            for(int j = 0; j < threeD[i].length; j++){
                for(int k = 0; k < threeD[i][j].length; k++){
                    //System.out.println(threeD[i][j][k]);
                }
            }
        }

        //System.out.println(sum(1,2));

        System.out.println(absolute(-5));
        System.out.println(absolute(5.5));

        int[] arr = {1,1,3,4,5};
        System.out.println(average(arr));
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double absolute(double a){
        if(a < 0){
            return a * -1;
        }
        return a;
    }
    public static int absolute(int a){
        if(a < 0){
            return a * -1;
        }
        return a;
    }
    public static double average(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
