import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 2; potentialPrimeNumber < 100; potentialPrimeNumber++) {
            boolean isPrime = true;
            for (int i = 2; i < potentialPrimeNumber; i++) {
                int mod = potentialPrimeNumber % i;
                if (mod == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbersArr.add(potentialPrimeNumber);
            }
        }

        int inputNumber = 97;

        for (int i = 0; i < primeNumbersArr.size(); i++) {

            int mod = inputNumber % primeNumbersArr.get(i);
            if (mod == 0) {
                System.out.println(primeNumbersArr.get(i));
                inputNumber = inputNumber / primeNumbersArr.get(i);
                i--;
            }
        }
    }
}


