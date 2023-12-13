package greedy_algorithms;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 19, 25};
        System.out.println(maxNumberFromDigits(digits));
        System.out.println(5*Math.log(5));

    }

    public static String maxNumberFromDigits(int[] digits){
        int max = -999999999;

        for(int i=0; i<digits.length; i++){
            if(max < digits[i]){
                max = digits[i];
            }
        }

        return String.valueOf(max);
    }
}
