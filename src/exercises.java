public class exercises {
    public static void main(String[] args) {
        printFactors(-10);
    }

    public static void printFactors(int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for (int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i+" ");
            }
        }
    }

    //Check if 2 numbers end with the same digit
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1<10||num1>1000||num2<10||num2>1000||num3<10||num3>1000){
            return false;
        }
        int last1 = num1%10;
        int last2 = num2%10;
        int last3 = num3%10;
        if(last1==last2) return true;
        if(last1==last3) return true;
        if(last3==last2) return true;
        else return false;
    }
    public static boolean isValid(int number){
        if(number<10||number>1000){
            return false;
        } else return true;
    }



    //Check if the digit is present in both parameters
    public static boolean hasSharedDigit(int firstNum, int secondNum){
        if(firstNum<10||firstNum>99||secondNum<10||secondNum>99){
            return false;
        }
        while(firstNum>0){
            int secondNumCopy = secondNum;
            int lastDigit = firstNum%10;
            while (secondNumCopy>0){
                int lastDigitSec = secondNumCopy%10;
                if(lastDigit==lastDigitSec){
                    return true;
                }
                secondNumCopy = secondNumCopy/10;
            }
            firstNum = firstNum/10;
        }
        return false;
    }

    //Sum even numbers in the parameter
    public static int getEvenDigitSum(int number) {
        int sum = 0, lastNumber =0;
        if(number<0){
            return -1;
        }
        while (number>0){
            lastNumber = number%10;
            if(lastNumber%2==0){
                sum = sum+lastNumber;
            }
            number=number/10;
        }
        return sum;
    }

    //Get sum of the first and last numbers
    public static int sumFirstAndLastDigit(int number){
      int lastDigit = number%10;
      if(number<0){
          return -1;
      }
      while (number>=10){
          number = number/10;
      }
      return (number+lastDigit);
    }

    //Palindrome method
    public static boolean isPalindrome(int numberO){
       int reverse = 0;
       int lastNumber = 0;
       int number = numberO;
       if(numberO<0){
           number=number*-1;
       }
       do {
           lastNumber = number%10;
           reverse = reverse + lastNumber;
           number = number/10;
           if (number>0){
               reverse = reverse*10;
           }
       } while(number>0);
        if(numberO<0){
            reverse=reverse*-1;
        }
       return(numberO == reverse);
    }
}
