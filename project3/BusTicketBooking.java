package project3;

public class BusTicketBooking {
	private int numOfPassengers;
	private float price;
	private boolean isSleeper;
	private boolean isAC;
	private boolean isWiFi;
	private int numOfChildren;
	
	public BusTicketBooking(int numOfPassengers, float price, boolean isSleeper, boolean isAC, boolean isWiFi,
			int numOfChildren) {
		super();
		this.numOfPassengers = numOfPassengers;
		this.price = price;
		this.isSleeper = isSleeper;
		this.isAC = isAC;
		this.isWiFi = isWiFi;
		this.numOfChildren = numOfChildren;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isSleeper() {
		return isSleeper;
	}

	public void setSleeper(boolean isSleeper) {
		this.isSleeper = isSleeper;
	}

	public boolean isAC() {
		return isAC;
	}

	public void setAC(boolean isAC) {
		this.isAC = isAC;
	}

	public boolean isWiFi() {
		return isWiFi;
	}

	public void setWiFi(boolean isWiFi) {
		this.isWiFi = isWiFi;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}

	public void bookTicket(int numOfPassengers2, float price2) {
		float tot;
		tot=numOfPassengers*price;
		
		System.out.println(tot);
	}
		public void bookTicket(boolean isAC2, boolean isSleeper2) {
			boolean a= true;
			float amt,tot;
			tot=numOfPassengers*price;
			if((Boolean.compare(isAC, a)==0))
			{
				amt=tot+350;
				System.out.println(amt);
			}
			else if((Boolean.compare(isSleeper, a)==0))
			{
				amt=tot+250;
				System.out.println(amt);
				
			}
			else
			{
				System.out.println(tot);
			}
		}
		

		public void bookTicket(boolean isAC2, boolean isSleeper2, boolean isWiFi2) {
			// TODO Auto-generated method stub
			int pass;
			float pamt,amt,amt1,tot,all;
			
			boolean a=true;
			tot=numOfPassengers*price;
			pass=(numOfPassengers-numOfChildren);
			pamt=(pass*price);
			amt=tot+350;
			amt1=tot+250;
			if((Boolean.compare(isAC, a)==0))
			{
				amt=tot+350;
				System.out.println(amt);
			}
			else if((Boolean.compare(isSleeper, a)==0))
			{
				amt=tot+250;
				System.out.println(amt);
				
			}	
			else if((Boolean.compare(isAC, a)==0) && (Boolean.compare(isSleeper, a)==0))
			{
				all=amt+amt1;
			 System.out.println(all);
			}
			else
			{
				System.out.println(tot);
		}
		}

}
