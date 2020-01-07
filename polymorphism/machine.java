package polymorphism;

public class machine {

	int coalPieces;
	float hairStrand;
	String coalMsg;

	// Constructors

	public machine(int coalPieces) {
		super();
		this.coalPieces = coalPieces;
	}

	public machine(float hairStrand) {
		super();
		this.hairStrand = hairStrand;
	}

	public machine(String coalMsg) {
		super();
		this.coalMsg = coalMsg;
	}

	public machine() {
		super();
	}

	// Getter and Setters

	public int getCoalPieces() {
		return coalPieces;
	}

	public void setCoalPieces(int coalPieces) {
		this.coalPieces = coalPieces;
	}

	public float getHairStrand() {
		return hairStrand;
	}

	public void setHairStrand(float hairStrand) {
		this.hairStrand = hairStrand;
	}

	public String getCoalMsg() {
		return coalMsg;
	}

	public void setCoalMsg(String coalMsg) {
		this.coalMsg = coalMsg;
	}

	// Methods

	public int produceShoePolish(int coalPieces) {
		return ((coalPieces/5)*100);
	}

	public int produceShoePolish(float hairStrand) {
		return (int) ((hairStrand/9.83f)*100);
	}

	public int produceShoePolish(String coalMsg) {
		String arrStr[] = coalMsg.split(" ");
		int count = 0;
		for(int i=0;i<arrStr.length;i++) {
			if(arrStr[i].equals("coal"))
				count++;
		}
		return ((count/27)*100);
	}
}