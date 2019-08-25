class Seat
{
	private String seat_name;
	private boolean reserve=false;
	public Seat(String name)
	{
		this.seat_name=name;
	}
	
	public String getseatnumber()
	{
		return seat_name;
	}
	
	public void reserve() {
        if(!this.reserve) {
            this.reserve = true;
            System.out.println("Seat " + seat_name + " reserved");
            } 
    }
	
	public void cancel()
	{
		if(this.reserve)
		{
			this.reserve=false;
			System.out.println("Seat " + seat_name+ " cancelled");
			
		}
	}
	public boolean avail()
	{
		return this.reserve;
	}
	
	
}
