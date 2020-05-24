import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 2; potentialPrimeNumber < 100; potentialPrimeNumber++) {
            boolean isPrime = true;
            for (int q = 2; q < potentialPrimeNumber; q++) {
                int ost = potentialPrimeNumber % q;
                if (ost == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbersArr.add(potentialPrimeNumber);
            }
        }

        int n = 97;

        for (int indexNumber = 0; indexNumber < primeNumbersArr.size(); indexNumber++) {

            int value = n % primeNumbersArr.get(indexNumber);
            if (value == 0) {
                System.out.println(primeNumbersArr.get(indexNumber));
                n = n / primeNumbersArr.get(indexNumber);
                indexNumber--;
            }
        }
    }
}


