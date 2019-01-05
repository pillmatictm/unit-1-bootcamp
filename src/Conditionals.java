
public class Conditionals {

    public static void main(String args[]) {


        public boolean isOdd ( int n){
            if (n % 2 == 0) {
                return false;
            } else {
                return true
            }
        }

        public boolean isMultipleOfThree ( int n){
            if (n % 3 == 0) {
                return true;
            } else {
                return false;
            }
        }


        public boolean isOddAndIsMultipleOfThree ( int n){
            if (n % 2 == 0 && n % 3 == 0) {
                return true;
            } else {
                return false;

            }


            public boolean isOddAndIsMultipleOfThree2 ( int n){
                if (isOdd && isMultipleOfThree) {
                    return true;
                } else {
                    return false;
                }
            }


            public void fizzMultipleofThree ( int n){
                if (isMultipleOfThree) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(n);
                }
            }
        }


        public boolean fromLondom (Person person){
            if (person.getCity().equals("London")) {
                return true;
            } else {
                return false;
            }
        }


        public void longName (Person person){
            if (person.getName().length() > 5) {
                System.out.println(person.getName());
            } else {
                System.out.println("Name is too short");
            }
        }


        public boolean cigarParty ( int cigars, boolean isWeekend){
            if (isWeekend && (cigars >= 40 && cigars <= 60)) {
                return true;
            } else {
                return false;
            }
        }


            public int caughtSpeeding ( int speed, boolean isBirthday){
                if (isBirthday) {
                    speed = speed - 5;
                    continue;
                }
                if (speed > 60 && speed <= 80) {
                    return 1;
                } else if (speed > 80) {
                    return 2;
                } else if (speed <= 60) {
                    return 0;
                }
            }

            public String alarmClock ( int dayofWeek, boolean onVacation){
                if (onVacation && (dayofWeek > 0 && dayofWeek <= 5)) {
                    return "10:00";
                }
                if (onVacation && (dayofWeek == 0 || && dayofWeek == 6)){
                    return "Off";

                } else if (dayofWeek > 0 && dayofWeek <= 5) {
                    return "7:00";
                } else if (dayofWeek == 0 || dayofWeek == 6) {
                    return "10:00";
                }
            }

            public int lotteryTicket ( int a, int b, int c){
                if (a == b && b == c) {
                    return 30;
                } else if (a == b || a == c || b == c) {
                    return 20;
                } else {
                    return 0;
                }
            }

            public int blackjack ( int a, int b){
                if (Math.abs(b - a) < Math.abs(a - b)) {
                    return a;
                } else {
                    return b;
                }
            }


            public boolean evenlySpaced ( int a, int b, int c){
            if (Math.abs(a - b == b - c) || Math.abs(a - c == c - b) || Math.abs(a - b == c - a)){
                return true;
            } else {
                return false;
            }
         }


        }
    }
