
import java.util.Random;

    public class DMVSimulator
    {
        public static void main(String[] args)
        {
            System.out.println("Welcome To The DMV!");
            int[] num = new int[200];		
            int userNum = new Random().nextInt(num.length);
            System.out.println("Your number is " + userNum + "! Please wait to be called.");

            countUp(userNum);
            countDown(userNum);
          
            if( Math.random() <= 0.01 ) {
                System.out.println("You do have the required paperwork");
              }
            else
            {
            System.out.println("You don't have the desired paper you unprepared waste of space!!! HAHAHAHA!!");

            }
        }
    
        public static int countUp(int userNum)
        {
            int queue = 100;
            for(int i = userNum + 1; i <= 200; i++)
    
            {
                queue = i;

                System.out.println("Calling number " + i);
            }
    
            return queue;
        }
    
        public static int countDown(int userNum)
        {
            int queue = 1;
            for(int i = 1; i <= userNum; i++)
            {

                queue = i;
    
                System.out.println("Calling number " + i);
    
            }

            return queue;
    
        }

    
    

}


