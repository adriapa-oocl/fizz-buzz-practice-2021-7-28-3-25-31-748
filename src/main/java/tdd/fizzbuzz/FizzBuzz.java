package tdd.fizzbuzz;

public class FizzBuzz{

    public String countOff(String orderNumber) {
        int convertedOrderNumber = Integer.parseInt(orderNumber);
        if (convertedOrderNumber % 3 == 0){
            return "Fizz";
        }else if (convertedOrderNumber % 5 == 0){
            return "Buzz";
        }
        return orderNumber;
    }
}
