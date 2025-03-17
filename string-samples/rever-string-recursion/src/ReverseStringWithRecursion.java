public class ReverseStringWithRecursion {

    public static void main(String[] args) {
        String input = "Foss Guru Sujit";
        String output = reverseString(input);
        System.out.println(output);

    }

    private static String reverseString(String input) {

        if(input.isEmpty()){
            return input;
        }
        return reverseString(input.substring(1))+input.charAt(0);
    }
}