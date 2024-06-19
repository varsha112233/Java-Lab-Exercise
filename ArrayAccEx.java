package arrayaccesselement;

public class ArrayAccEx {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an element outside the bounds of the array
            int element = array[10];  // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Element at index 10: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Array index is out of bounds!");
            // Optionally, you can print more details about the exception
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        }

        System.out.println("Program continues after handling the exception.");
    }
}
