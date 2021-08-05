package tdd.fizzbuzz;

public class FizzBuzz{

    public String countOff(String orderNumber) {
        int convertedOrderNumber = Integer.parseInt(orderNumber);
        if (convertedOrderNumber % 3 == 0){
            return "Fizz";
        }else if (convertedOrderNumber % 5 == 0){
            return "Buzz";
        }else if (convertedOrderNumber % 7 == 0){
            return "Whizz";
        }
        return orderNumber;
    }
}
