package abstract3;

	public class RadiumStar extends Star{
		private int decayIndex,temp;    
		public RadiumStar(String starName, String constellationname, int decayIndex, int energyToEmit, int age,int energyConsume) {
			super(starName,constellationname,age,energyToEmit,energyConsume);
			this.decayIndex=decayIndex;
		}
		int  calculateYearsRemaining()
		{
			temp=(decayIndex*(decayIndex+1))/2;
			return temp;
		}
	}


