

public class FirstClass {
    public static void main(String[] args) {

    }

    public static String  printDayOfWeek(int day){
        String dayOfWeek;
        dayOfWeek = switch (day){
            case 0 -> { yield "Sunday";}
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid Day";
        };
        return dayOfWeek;
    }



    public static boolean isCatPlaying  (boolean isSummer, int temperature){
        if(!isSummer&&temperature>=25&&temperature<=35){
            return true;
        }else {
            if(isSummer&&temperature>=25&&temperature<=45){
                return true;
            }   else return false;
        }
    }


}