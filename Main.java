import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Welcome to the theater booking");
      System.out.println("Kindly check  below points,before booking the seat");
      System.out.println("Total 10 rows,and Each row only 10 seats and row order is A to J");
      System.out.println("Lets Start booking for theater \"AjaySahu_Theater\"");
      Collection c1=new Collection();
      c1.arrangement();
      Scanner sc=new Scanner(System.in);
      while(true)
    {  
      
      System.out.println("Press \'1\' for reserve a seat and \'2\' cancel the seat and \'3\' for available seats and \'4\' for exit the window.");
      int a=sc.nextInt();
      switch(a)
      {
    	  case 1:
    	  {
    		  System.out.println("Please enter the Row number in A to J");
    		  String ch = sc.next();
    		  System.out.println("Please enter the seat number 01 to 10");
    	      Integer seat=sc.nextInt();
    		  c1.reserveseat(ch+ String.format("%02d",seat));
    		    break;
    	  }
    	  case 2:
    	  {
    		  System.out.println("Please enter the Row number in A to J");
    		  String ch1 = sc.next();
    		  System.out.println("Please enter the seat number 01 to 10");
    	      Integer seat1=sc.nextInt();
    		  c1.cancelseat(ch1+ String.format("%02d",seat1));
    		  break;
    	  }
    		  
    	  case 3:
    	  {
    		  c1.avaiseat();
    		  break;
    	  }
    		  
    	  case 4:
    	  {
    		  System.exit(0);
    		  break;
    	  }
    		  
    	 default:
    	 {
    		 System.out.println("you press other key");
    	 }
    		  
      }
      }
      
     }

}
