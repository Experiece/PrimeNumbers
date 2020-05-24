import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 1; potentialPrimeNumber < 100; ) {
            potentialPrimeNumber++;
            for (int q = 2; q <= potentialPrimeNumber; ) {
                int ost;
                ost = potentialPrimeNumber % q;
                if (ost != 0) {
                    q++;
                } else {
                    if (potentialPrimeNumber == q) {
                        primeNumbersArr.add(potentialPrimeNumber);
                    }
                }
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


