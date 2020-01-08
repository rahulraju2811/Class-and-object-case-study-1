package abstract3;

abstract public class Star {

	    private String starName;
	    private String constellationName;
	    private int currentAge;
	    private int energyToEmit;
	    private int energyConsume;
	    
		public Star(String starName, String constellationName, int currentAge, int energyToEmit,int energyConsume) {
			this.starName=starName;
			this.constellationName=constellationName;
			this.currentAge=currentAge;
			this.energyToEmit=energyToEmit;
			this.energyConsume=energyConsume;
		}
		public String getStarName() {
			return starName;
		}
		public void setStarName(String starName) {
			this.starName = starName;
		}
		public String getConstellationName() {
			return constellationName;
		}
		public void setConstellationName(String constellationName) {
			this.constellationName = constellationName;
		}
		public int getCurrentAge() {
			return currentAge;
		}
		public void setCurrentAge(int currentAge) {
			this.currentAge = currentAge;
		}
		public int getEnergyToEmit() {
			return energyToEmit;
		}
		public void setEnergyToEmit(int energyToEmit) {
			this.energyToEmit = energyToEmit;
		}
		public int getEnergyConsume() {
			return energyConsume;
		}
		public void setEnergyConsume(int energyConsume) {
			this.energyConsume = energyConsume;
		}
		abstract int  calculateYearsRemaining();
		float result;
		public float calculateEmissionRate()
		{
			 result=(float)(energyToEmit-energyConsume)/(float)(calculateYearsRemaining()-currentAge);  
			 return result;
		}
		public void display()
		{
			System.out.print("Star Details:"+starName+"\n");
			System.out.print("Constellation:"+constellationName+"\n");
			System.out.print("Emission rate:"+result+"\n");
		}
}
