import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 1; potentialPrimeNumber < 100; ) {
            potentialPrimeNumber++;
            for (int q = 2; q <= potentialPrimeNumber; ) {
                int ost;
                ost = potentialPrimeNumber % q;
                if (ost != 0) {
                    q++;
                } else {
                    if (potentialPrimeNumber != q) {
                        break;
                    } else {
                        //                       System.out.println(potentialPrimeNumber);
                        primeNumbersArr.add(potentialPrimeNumber);
                        break;
                    }
                }
            }
        }
        int n = 97;
        int indexNumber;
        int value;

        for (indexNumber = 0; indexNumber < primeNumbersArr.size(); ) {

            value = n % primeNumbersArr.get(indexNumber);
            if (value == 0) {
                System.out.println(primeNumbersArr.get(indexNumber));
                n = n / primeNumbersArr.get(indexNumber);
            } else {
                indexNumber++;
            }

        }
    }
}


