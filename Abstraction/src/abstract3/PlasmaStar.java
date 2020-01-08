package abstract3;

public class PlasmaStar extends Star {
	 private int decayIndex,temp;     
		public PlasmaStar(String starName, String constellationName, int decayIndex, int energyToEmit, int currentAge,int energyConsume) {
			super(starName,constellationName,currentAge,energyToEmit,energyConsume);
			this.decayIndex=decayIndex;
		}
		int  calculateYearsRemaining()
		{
			int a=0,b=1;
			for(int i=1;i<=decayIndex-1;i++)
			{
				temp=a+b;
				a=b;
				b=temp;
			}
			return temp;
		}
		

}
