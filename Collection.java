import java.util.*;
public class Collection {
   private final String theater_name="Ajaysahu_Theater";
   List<Seat> seat =new ArrayList<>(100);//rows=10;seats per row=10
    public void arrangement()
   {
	  int lastrow='A'+10;
	  for(char row='A';row<lastrow;row++)
	  { 
		  
		  for(int a=1;a<=10;a++)// 10=seats per row
		  {
			  Seat seats=new Seat(row+String.format("%02d", a));
			  seat.add(seats);
		  }
	  }
   }
public String getTheater_name() {
	return theater_name;
}
   
  public void  reserveseat(String seatnumber1)
  {
	  Seat requestedseat=null;
	  for(Seat see:seat)
	  {
		  //System.out.println(see.getseatnumber() +"   "+ seatnumber1);
		  if(see.getseatnumber().equalsIgnoreCase(seatnumber1))
		  {
			  requestedseat=see;
			  break;
		  }
		  
	  }
	  
	  if(requestedseat==null)
	  {
		  System.out.println("there is no seat "+ seatnumber1);
		 
	  
	  }
	   requestedseat.reserve();
	  
	  
  }
  
  public void cancelseat(String seatnumber)
  {
	  Seat requestedseat=null;
	  for(Seat see:seat)
	  {
		  //System.out.println(see.getseatnumber() +"   "+ seatnumber1);
		  if(see.getseatnumber().equalsIgnoreCase(seatnumber))
		  {
			  requestedseat=see;
			  break;
		  }
		  
	  }
	  
	  if(requestedseat==null)
	  {
		  System.out.println("there is no seat"+ seatnumber);
		 
	  
	  }
	   requestedseat.cancel();
  }
  
  public void avaiseat()
  {
	  for(Seat see:seat)
	  {
		  if(!see.avail())
		  {
			  System.out.println("available seat:-"+see.getseatnumber());
		  }
	  }
  }
   
   
   
}

 
 