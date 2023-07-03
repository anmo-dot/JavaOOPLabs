package case3;

public class Generate {
	static int travCompCode = 115;
	static char modeOfTrav;
	static int tripCode;
	static int unqCode = 0;
	public static void main(String[] args) {
	
		modeOfTrav = 'F';
		tripCode = 102;
		System.out.println(getCode(modeOfTrav, tripCode));
		
		modeOfTrav = 'T';
		tripCode = 202;
		System.out.println(getCode(modeOfTrav, tripCode));
		
		modeOfTrav = 'B';
		tripCode = 304;
		System.out.println(getCode(modeOfTrav, tripCode));
	}
	
	public static String getCode(char modeOfTrav, int tripCode) {
		unqCode++;
		return travCompCode + "" + modeOfTrav + String.format("%03d", tripCode) + String.format("%04d", unqCode);
	}
}
