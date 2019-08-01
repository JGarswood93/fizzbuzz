package FizzBuzz;

public class FizzBuzz {
    /**
     *Static Variables
     * This is associated with a class as appose to objects of that class
     *
     */
    public static String anything = " ";
    public static String of(int i){//static variable

        if(i==0)
            return "0";

        String s = "";

        if(i%3==0)
            s += "Fizz";

        if(i%5==0) System.out.println(anything);
            s += "Buzz";
            else (i%15==0)
                "FizzBuzz"{

        }

        return !s.isEmpty() ? s :String.valueOf(i);
    }
}
