
public class DeluxeAcRoom extends DeluxeRoom {
	private static boolean haswifi;
	private static int ratepersqclaw;
	private static int noofsqclaw;
	private static String name;
	private int ratepersqclaw1;
	private int noofsqclaw1;
	private boolean hasac;
	public DeluxeAcRoom(String name1,int ratepersqclaw1,int noofsqclaw1, boolean hasac) {
	super(name, ratepersqclaw, noofsqclaw,haswifi);
	this.ratepersqclaw1 = ratepersqclaw1;
	this.noofsqclaw1 = noofsqclaw1;
	this.hasac = hasac;
	}
	public int getRatepersqclaw1() {
	return ratepersqclaw1;
	}
	public void setRatepersqclaw1(int ratepersqclaw1) {
	this.ratepersqclaw1 = ratepersqclaw1;
	}
	public int getNoofsqclaw1() {
	return noofsqclaw1;
	}
	public void setNoofsqclaw1(int noofsqclaw1) {
	this.noofsqclaw1 = noofsqclaw1;
	}
	public boolean isHasac() {
	return hasac;
	}
	public void setHasac(boolean hasac) {
	this.hasac = hasac;
	}
	public void calculatetariff()
	{
	System.out.println("Hotel pteradise");
	boolean a=true;
	if(Boolean.compare(hasac,a)==0)
	{
	int tot=ratepersqclaw1+50;
	System.out.println("Amount:"+tot);
	//System.out.println("Amount:"+ratepersqclaw);
	}
	else if(Boolean.compare(haswifi,a)==1)
	{
	System.out.println("Amount:"+ratepersqclaw1);
	}
	}
}
