package binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Обычный " + binarySearch(new int[]{-1, 1, 2, 4, 5, 6, 7, 8}, 6));
        System.out.println("Рекурсивный " + recBinarySearch(new int[]{-1, 1, 2, 4, 5, 6, 7, 8}, 6));
    }

    public static int binarySearch(int[] a, int key){
        int low = 0;
        int high = a.length - 1;

        while(low <=  high){
            int middle = low + (high - low)/2;

            if(key < a[middle]){
                high = middle - 1;
            } else if(key > a[middle]){
                low = middle + 1;
            } else{
                return middle;
            }
        }

        return -1;
    }

    public static int recBinarySearch(int[] a, int key){
        int low = 0;
        int high = a.length - 1;
        return addRecBinarySearch(a, key, low, high);
    }

    public static int addRecBinarySearch(int[] a, int key, int low, int high){
        int middle = low + (high - low)/2;

        if(key < a[middle]){
            return addRecBinarySearch(a, key, low, middle - 1);
        } else if(key > a[middle]){
            return addRecBinarySearch(a, key, middle + 1, high);
        } else if(low <= high){
            return middle;
        } else{
            return -1;
        }
    }


}


