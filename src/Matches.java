/**
 * Created by nik on 07.10.18.
 */
public class Matches {
    public static void main(String[] args) {
        /* - input data, number of squares, set when the class is called
         */
        Integer n = null;
        try {
            n = Integer.parseInt(args[0]); // n - number of squares
        } catch (Exception e) {
            System.out.println("The input data have to be number. " + e.getMessage());
        }
        if (n != null && n > 0 && n < 1000000001) {
            int width = (int) Math.sqrt(n); //width - the width of the figure obtained from the squares
            int length = (int) n / width;
            int remainder = n - width * length;
            int result = width * (length + 1) + length * (width + 1);
            if (remainder > 0)
                result += 2 * remainder + 1;
            System.out.println(result);
        } else
            System.out.println("Error. 1 < number of squares < 1000000000");

    }
}
