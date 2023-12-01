import java.util.ArrayList;

/**
 * DynamicArray
 * Their length is not fixed. It can grow and shrink at runtime based on
 * requirement.
 * 
 * ArrayList can be used in java to create dynamic arrays.
 * Correct Syntax :: ArrayList<Integer>
 * Wrong Syntax :: ArrayList<int>
 */
class DynamicArray {

    public static void main(String[] args) {

        ArrayList<String> dynamicArray = new ArrayList<>();
        dynamicArray.add("A");
        dynamicArray.add("B");

        System.out.println(dynamicArray);

    }

}