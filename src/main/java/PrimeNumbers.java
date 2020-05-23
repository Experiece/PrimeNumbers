import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbersArr = new ArrayList<>();

        for (int potentialPrimeNumber = 2; potentialPrimeNumber < 10; potentialPrimeNumber++) {
            System.out.println("\n====================");
            System.out.println("potentialPrimeNumber = " + potentialPrimeNumber);

            for (int q = 2; q < potentialPrimeNumber; q++) {
                System.out.println("--------------------");
                System.out.println("q = " + q);
                int ost;
                ost = potentialPrimeNumber % q;
                if (ost == 0) {
                    System.out.println(potentialPrimeNumber);
                    primeNumbersArr.add(potentialPrimeNumber);
                    break;
                }
            }
        }

        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (int pn : primeNumbersArr) {
            System.out.println(pn);
        }

//        int x = 0;
//        while (x++ < 100) {
//            for (int i = 0; i < primeNumbersArr.size(); i++) {
//                if (x % primeNumbersArr.get(i) == 0) {
//                    System.out.println("\nWarhamer 40k " + x);
//                    break;
//                }
//
//            }
//        }

    }
}

