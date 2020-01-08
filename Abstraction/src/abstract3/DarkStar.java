package abstractioncase3;

public class DarkStar extends Star{
	private int decayIndex,temp;
	private int cal=0;
	 
	public DarkStar(String starName, String constellationName, int decayIndex, int energyToEmit, int age,int energyConsume) {
		super(starName,constellationName,age,energyToEmit,energyConsume);
		decayIndex=decayIndex;
	}
	int calculateYearsRemaining()
	{
		int num=1,i;
	    int count=0;
	 
	    while (count < decayIndex){
	      num=num+1;
	      for (i = 2; i <= num; i++){ 
	        if (num % i == 0) {
	          break;
	        }
	      }
	      if ( i == num){
	        count = count+1;
	      }
	    }
	    cal=cal + num;
	    return cal;
	}
}


