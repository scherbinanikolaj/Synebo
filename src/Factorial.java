/**
 * Created by nik on 07.10.18.
 */
public class Factorial {
    public static void main(String[] args) {
        /* - input data, value of factorial, set when the class is called
         */
        Integer factorial = null;
        int result = 1;
        try {
            factorial = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("The input data have to be number. " + e.getMessage());
        }
        if(factorial != null && factorial > 0 && factorial < 20000) {
            while (result != factorial) {
                factorial /= result;
                result++;
            }
            System.out.println(result);
        } else
            System.out.println("Error. 1 < value of factorial < 20000");
    }
}
