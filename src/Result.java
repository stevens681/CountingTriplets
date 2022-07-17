import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Result {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        HashMap<Long, Long> map = new HashMap<>();
        for(Long a: arr){
            long temp = 0;
            for(int i =0; i<a && temp < a; i++){
               temp= a * (long)Math.pow(r, i);
                System.out.print(temp+"\t");
            }
            System.out.println();
            map.put(a, temp);
        }

        System.out.println(map);
        return 0;

    }

    public static void main(String[] args) {

        String list = "1 2 2 4";
        //String list = "1 3 9 9";
        List<Long> arr = new ArrayList<>();

        char[] a= list.toCharArray();
        for(Character i: a){
            if(i.equals(' ')) continue;

            arr.add((long) Character.getNumericValue(i));

        }
        System.out.println(countTriplets(arr, 2));
//        List<Long> arr1 = new ArrayList<>();
//        arr1.add(1L);
//        arr1.add(5L);
//        arr1.add(5L);
//        arr1.add(25L);
//        arr1.add(125L);
//
//        System.out.println(countTriplets(arr1,5));

        List<Long> arr2 = new ArrayList<>();
        arr2.add(1L);
        arr2.add(4L);
        arr2.add(16L);
        arr2.add(64L);

        System.out.println(countTriplets(arr2, 4));



    }
}
