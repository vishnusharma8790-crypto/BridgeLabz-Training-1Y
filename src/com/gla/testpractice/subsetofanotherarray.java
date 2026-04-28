package testpractice;

import java.util.HashSet;

public class subsetofanotherarray {
    public static void main(String[] args) {


        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5};

        int arr3[] = {1, 2, 3, 4, 5};
        int arr4[] = {1, 2, 9};

        System.out.println(checkSubset(arr1, arr2));
        System.out.println(checkSubset(arr3, arr4));
    }

    static String checkSubset(int arrA[], int arrB[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arrA) {
            set.add(num);
        }

        for (int num : arrB) {
            if (!set.contains(num)) {
                return "Not a subset";
            }
        }

        return "Subset";
    }
}
