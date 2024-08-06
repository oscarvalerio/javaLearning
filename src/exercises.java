public class exercises {
    public static void main(String[] args) {
        //numberToWords(123321);
        System.out.println(canPack(2,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int cinKilos, oneKilo;
        if(bigCount<0||smallCount<0||goal<0) return false;
        int remainCinco = goal%5;
        if(remainCinco==0){
            cinKilos = (bigCount*5)-goal;
            if(cinKilos>=0){
                return true;
            } else{
                if(((bigCount*5)+smallCount)>=goal){
                    return true;
                } else return false;
            }
        }
        else{
            int tmp1 = smallCount-(goal%5);
            if(tmp1 < 0){
                return false;
            } else {
                int cincoNeed = goal/5;
                if(bigCount>=cincoNeed){
                    return true;
                } else{
                    int tmp3 = (bigCount*5)+smallCount;
                    if(tmp3>=goal) return true;
                    else return false;
                }
            }
        }
    }







    //Get the quantity of digits in a number
    public static int getDigitCount (int number){
        int count = 0;
        if(number<0) {
            return -1;
        }
        if(number==0){
            return 1;
        }
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }

    // Return a number that is reversed
    public static int reverse(int number){
       boolean negative = number<0;
       if(negative) number=number*-1;
        int leng = getDigitCount(number), reve=0, tmp1=0,i=1;
        while (number>0){
            tmp1 = number%10;
            number=number/10;
            if(tmp1!=0){
                reve = (int) (reve+(tmp1*Math.pow(10,leng-1)));
            }
            leng--;
        }
        if(negative) reve = reve*-1;
        return reve;
    }

    //Convert a number to words
    public static void numberToWords(int number){
        if(number<0) {
            System.out.println("Invalid Value");
        } else {
            int reversado = reverse(number);
            int largo = getDigitCount(number);
            for(int i=0;i<largo;i++){
                int tmp1 = reversado%10;
                reversado = reversado/10;
                switch (tmp1){
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Zero");
                        break;
                }
            }
        }
    }


    //Check if parameter is a perfect number
    public static boolean isPerfectNumber(int number){
        int i=1, perfect=0;
        if(number<1) return false;
        while(i<number){
            if(number%i==0){
                perfect=perfect+i;
            }
            i++;
        }
        return perfect==number;
    }

    //Get the maximum Common Divisor
    public static int getGreatestCommonDivisor(int first, int second){
        int divisor=0;
        if(first<10||second<10) return -1;
        for(int i=1;i<=first;i++){
            if(first%i==0){
                if(second%i==0){
                    divisor=i;
                }
            }
        } return divisor;
    }

    //TO define if a number can be divided by each number
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
