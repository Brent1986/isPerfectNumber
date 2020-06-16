public class isPerfectNumber {
    /*What is the perfect number?
A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
For example, take the number 6:
Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
*/
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(7));
    }
    public static boolean isPerfectNumber (int number){
        if (number < 1) return false;
        int loopCount = 1;
        int theResult = 0;
        while (number >= loopCount){
            int isRem = number % loopCount;
            if (isRem == 0 && number != loopCount) theResult += loopCount;
            loopCount ++;
        }
        if (number == theResult){
            return true;
        } else {
            return false;
        }
    }
}
