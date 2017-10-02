package elseif;

import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
     final int SPEED_LIMIT=55;
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter your current speed:");
     int currentSpeed=scan.nextInt();

     if(currentSpeed > SPEED_LIMIT){
    	 System.out.println("Slow down");
    	 
     if(currentSpeed==SPEED_LIMIT){
    	 System.out.println("Be pation ");
     
     }
    	
     if(-SPEED_LIMIT-currentSpeed >=10){
    	 System.out.println(" Dont driver to fast");
     }
     }
     
     
	}

}
