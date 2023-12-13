package greedy_algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class GreedyAlgorithms {
    public static void main(String[] args) {
//        int[] digits = {3, 1, 7, 9, 9, 5};
//        System.out.println(maxNumberFromDigits(digits));

        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));
    }

//    public static String maxNumberFromDigits(int[] digits){
//        return Arrays.stream(digits).boxed().sorted(Comparator.reverseOrder()).map(String::valueOf).reduce("", (a,b) -> a+b);
//    }

    public static int minStops(int[] stations, int capacity){
        int result = 0; //Оптимальное количество остановок
        int currentStop = 0;

        while(currentStop < stations.length){
            int nextStop = currentStop;

            while(nextStop < stations.length &&
            stations[nextStop + 1] - stations[currentStop] <= capacity){

            }
        }
    }
}
