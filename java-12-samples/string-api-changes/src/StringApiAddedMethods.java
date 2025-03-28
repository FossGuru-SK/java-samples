import java.lang.constant.Constable;
import java.text.NumberFormat;
import java.util.Locale;

import static java.util.Calendar.*;

public class StringApiAddedMethods {
    public static void main(String[] args) {

        //Method - indent(n)
        String input = "Sujit Karne \n How are you doing";
        input.indent(1);
        System.out.println(input.indent(10));

        //Method - transform
        String output = input.transform(String::strip).transform(String::toLowerCase);
        System.out.println(output);

        //Compact Number Formater e.g. 36M -> 36,00,000
        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(numberFormat.format(25000L));


    }
}