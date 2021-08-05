package tdd.fizzbuzz;

public class FizzBuzz{

    public String countOff(String orderNumber) {
        int convertedOrderNumber = Integer.parseInt(orderNumber);
        if (numberFizz(convertedOrderNumber) || numberBuzz(convertedOrderNumber) || numberWhizz(convertedOrderNumber)){
            String output = "";
            if (numberFizz(convertedOrderNumber)){
                output += "Fizz";
            }if (numberBuzz(convertedOrderNumber)){
                output += "Buzz";
            }if (numberWhizz(convertedOrderNumber)){
                output += "Whizz";
            }
            return output;
        }
        return orderNumber;
    }

    private boolean numberFizz(int number){
        return number % 3 == 0;
    }
    private boolean numberBuzz(int number){
        return number % 5 == 0;
    }
    private boolean numberWhizz(int number){
        return number % 7 == 0;
    }
}
