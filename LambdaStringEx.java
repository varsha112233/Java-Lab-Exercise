package lambdaString;
public class LambdaStringEx {
	    @FunctionalInterface
	    interface StringOperation {
	    String operate(String s);
	    }
        public static void main(String[] args) {
	    StringOperation toUpperCase = (s) -> s.toUpperCase();
	    StringOperation toLowerCase = (s) -> s.toLowerCase();
	    StringOperation reverseString = (s) -> new StringBuilder(s).reverse().toString();
        String originalString = "Hello World";
        System.out.println("Original String: " + originalString);
	    System.out.println("Uppercase: " + toUpperCase.operate(originalString));
	    System.out.println("Lowercase: " + toLowerCase.operate(originalString));
	    System.out.println("Reversed: " + reverseString.operate(originalString));
	    }
	}


	