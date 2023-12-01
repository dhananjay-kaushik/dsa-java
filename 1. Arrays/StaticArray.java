/*
 * Creating static arrays.
 * Their length cannot be changed.
 * They can hold both primitives and Objects both.
 */

public class StaticArray {

    public static void main(String[] args) {
        String[] staticArray = new String[5];
        staticArray[0] = "A";
        staticArray[1] = "B";
        staticArray[2] = "C";
        staticArray[3] = "D";
        staticArray[4] = "E";

        String[] staticArray2 = {
                "A", "B", "C", "D", "E"
        };

        System.out.println(staticArray);
        System.out.println(staticArray2);
    }

}
