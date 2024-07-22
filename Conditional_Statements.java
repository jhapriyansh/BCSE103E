// Upload
public class Conditional_Statements{
    public static void main(String[] args){
        // if(20>18){
        //     System.out.println("20 is greater than 18");
        // }

        // int time = 18;
        // if(time<10){
        //     System.out.println("Good morning");
        // } else if(time<20){
        //     System.out.println("Good day");
        // } else {
        //     System.out.println("Good evening");
        // }

        int day = 9;
        switch (day){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tueday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("Not a day of the week");
            break;
        }
    }
}
