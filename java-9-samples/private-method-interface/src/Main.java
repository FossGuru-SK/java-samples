public class Main implements CustomCalculator{


    public static void main(String[] args) {
        CustomCalculator customCalculator = new Main();
        int sumOfEvenNumbers = customCalculator.addEvenNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfEvenNumbers);
        int sumOfOddNumbers = customCalculator.addOddNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfOddNumbers);
    }
}