// Upload
public class Loop_Control{
    public static void main(String[] args){
        for(int i = 0; i<10; i++){
            if(i==4){
                continue;
            }
            if(i==7){
                break;
            }
            System.out.println(i);

        }
    }
}
// javac Loop_Control.java && java Loop_Control