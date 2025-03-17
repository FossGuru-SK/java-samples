public class RemoveLastChartFromString {
    public static void main(String[] args) {

        String input = "abcdE";

        //Using regex
        String newString = input.replaceFirst(".$", "");
        System.out.println(newString);

        //Using substring
        System.out.println(input.substring(0,input.length()-1));

        //Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.deleteCharAt(stringBuffer.length()-1));
    }
}