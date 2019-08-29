package studio1;
import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);

        int n1 = ap.nextInt("Enter a value.");
        int n2 = ap.nextInt("Enter another value.");

        double average = (double)(n1+n2)/2;

        System.out.println("Average of "+n1 + " and "+ n2 + " is "+average);
    }
}
