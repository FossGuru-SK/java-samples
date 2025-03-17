public class GetFirstFourCharFromString {

    public static void main(String[] args) {
        String input = "sujitkarne";
        String firstFourChar = input.substring(0,4);
        System.out.println(firstFourChar);

        //Get last 4 char from string
        String lastFourChar = input.substring(input.length() - 4);
        System.out.println(lastFourChar);

        //Mask string Except last 4 chars using regex
        String maskedString = input.replaceAll(".(?=.{4})", "x");
        System.out.println(maskedString);

        //Mask string Except last 4 chars repeat() java 11
        int maskLength = input.length()-4;
        String maskedStringWithoutRegex = "x".repeat(maskLength)+input.substring(maskLength);
        System.out.println(maskedStringWithoutRegex);
    }
}