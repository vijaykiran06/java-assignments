public class NestedTryCatch {

    public static void main(String[] args) {
        try {
            System.out.println("Outer try block");
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero");
            }

            try {
                int arr[] = {10, 20, 30};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds");
            }

            int num = Integer.parseInt("abc");

        } catch (NumberFormatException e) {
            System.out.println("Outer catch: Invalid number format");
        }

        System.out.println("Program continues normally.");
    }
}
