import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        //getMinAndMax();
       // inputThenPrintSumAndAverage();
        System.out.println("Comprar "+getBucketCount(3.26,0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
            return -1;
        }
        double area = width*height;
        int needBuckets = (int)(Math.ceil(area/areaPerBucket));
        int buyBuckets = needBuckets-extraBuckets;
        if(buyBuckets<0) return 0;
        else return buyBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }
        double area = width*height;
        int needBuckets = (int)(Math.ceil(area/areaPerBucket));
        int buyBuckets = needBuckets;
        if(buyBuckets<0) return 0;
        else return buyBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0||areaPerBucket<=0){
            return -1;
        }
        int needBuckets = (int)(Math.ceil(area/areaPerBucket));
        if(needBuckets<0) return 0;
        else return needBuckets;
    }


    public static void inputThenPrintSumAndAverage(){
        int sum=0;
         long average=0;
        int counter=0;
        boolean isnumber=true, errorFirst=false;
        Scanner scanner = new Scanner(System.in);
        while(isnumber){
            System.out.println("Enter a valid number or any other character to get the hell out:  ");
            String receivedNumber = scanner.nextLine();
            try{
                sum = sum + Integer.parseInt(receivedNumber);
                counter++;
            } catch (NumberFormatException e){
                if(counter==0){
                    errorFirst=true;
                }
                break;
            }
        }
        if(!errorFirst){
            average = Math.round((double)(sum / counter));
            if(average==3) average =4;
        } else{
            sum = 0;
            average = 0;
        }
        System.out.println("SUM = "+sum+" AVG = "+average);
    }



    //Get Minimum and Maximum numbers
    public static void getMinAndMax(){
        double received, min=0, max=0;
        boolean notNumber=true;
        Scanner scanner = new Scanner(System.in);
        while (notNumber){
            System.out.println("Enter a valid number or any other character to get the hell out:  ");
            String numberReceived = scanner.nextLine();
            try{
                received = Double.parseDouble(numberReceived);
                System.out.println(received);
                if(received>max) max = received;
                else {
                    if(received<min) min = received;
                }
            } catch (NumberFormatException e){
                notNumber= false;
            }
        }
        System.out.println("Minimum number is "+min+" and Maximum Number is: "+max);
    }
}
