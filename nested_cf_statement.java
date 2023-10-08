package oct8.learning;

public class Ipl {
public static void main(String[] args) {
	Ipl ipl = new Ipl();
	int mi = 200, gt = 210;
	ipl.play_qualifier(mi,gt);
	ipl.play_qualifier2(mi,gt);
}

private void play_qualifier(int team1, int team2) {
	// TODO Auto-generated method stub
	if (team1>team2) {
		System.out.println("Mimbai Indians enter the qualifier");
	}
	else {
		System.out.println("Gt Enter the Qualifier");
	}
}
void play_qualifier2(int mi, int gt) {
	int csk = 210;
	if (mi>gt) {
		
		    mi = 205;
		if (csk>mi) {
			System.out.println("Csk get trophy ");
		}
		else{
			System.out.println("MI get trophy");
		}
	    	
	    }
	else {
		gt = 200;
		if (csk>gt) {
			System.out.println("Csk won the trophy");
			
		}
		else {
			System.out.println("Gt get the trophy");
		}
	}
	
}

}
