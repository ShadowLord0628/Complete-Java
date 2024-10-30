package ExceptionHandling;

class NewException extends Exception {
    public NewException(String str) {
        super(str);
        // System.out.println("This is an exception : " + str);
    }
}

public class Demo {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        String str = null;

        int nums[] = new int[5];

        try {
            j = 18 / i;
            if (j == 0)
                throw new NewException("Don't want zero as output");
            // throw new ArithmeticException();

            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (NewException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            j = 18;
            System.out.println("That is the default output : " + j);
            // System.out.println("Cannot divide by zero. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is greater than size. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong. " + e.getMessage());
        }
        // ! **It is compulsion to have parent class at bottom

        System.out.println(j);
        System.out.println("Bye");
    }
}

// ? throws keyword is used for ducking the exception where exception is left to
// ? handle by method who is calling other method which can throw exception

/*
 * Example,
 * 
 * C() {
 * 
 * try {
 * d();
 * e();
 * } catch() {
 * -----------------
 * }
 * 
 * 
 * d() throws Exception {
 * -----------------
 * }
 * 
 * e() throws Exception {
 * -----------------
 * }
 * }
 */
