public class StringFormatPhoneNumber {
    public static void main(String[] args) {

        //Using regex (###) ###-####
        String input = "1234567890";
        String numberFormatString = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        System.out.println(numberFormatString);

        // ###-###-####‘
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "$1-$2-$3");
        System.out.println(number);
    }
}