
public class Loops {

    public static void main(String args[]) {

        public void firstLoop () {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
            firstLoop();
        }

        public void differentLoop () {
            int i = 1;
            do {
                i++
            } while (i <= 10);
            System.out.println(i);

            differentLoop();
        }


        public void loopTillParam ( int n){
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
            loopTillParam();
        }

        public void loopEvenTillParam ( int n){
            for (int i = 2; i <= n; i + 2) {
                System.out.println(i);
            }
            loopEvenTillParam();
        }

        public void loopTillSum () {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("The sum is " + sum);
        }


        public void loopTillSumParam ( int n){
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("The sum is " + sum);
        }
        loopTillSumParam(10000);
    }

    public void printS(int n, String s) {
        for (int i = 1; i <= n; i++) {
            if (n < 0) {
                System.out.println("");
            } else {
                System.out.println(s);
            }
            printS();
        }
    }

    public void printConcatenatedS(int n, String s) {
        for (int i = 1; i <= n; i++) {
            if (n < 0) {
                System.out.print("");
            } else {
                System.out.print(s + "");
            }
            printS();
        }
    }

    public void printFibonacci() {
        int max = 0;
        int nextNum = 1;
        int previousNum = 0;

        int i = 1;

        while (i <= max) {
            System.out.print(previousNum + " ");
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
            i++;
        }
    }

    public void printFibonacciSum() {
        int max = 0;
        int nextNum = 1;
        int previousNum = 0;
        int totalSum = 0

        int i = 1;

        while (i <= max) {
            System.out.print(previousNum + " ");
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
            i++;
            totalSum+=
        }
    }


    public void printFibonacciSum(int n) {
        int max = 0;
        int nextNum = 1;
        int previousNum = 0;
        int totalSum = 0


        while (n <= max) {
            System.out.print(previousNum + " ");
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
            i++;
            totalSum+= n
        }
    }


    public int sumNumbers(String s){
        int sum = 0;
        String newString = "";

        for (int i = 0; i <s.length() -1; i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (Character.isDigit(s.charAt(i+1))) {
                    newString += s.charAt(i);
                }
                else {
                    newString += s.charAt(i);
                    sum += Integer.parseInt(newString);
                    newString = "";
                }

            }
        }

        return sum;
    }













}
    }


}
        }
