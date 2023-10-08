package oct8.learning;

public class Ipl {
public static void main(String[] args) {
	Ipl ipl = new Ipl();
	int mi = 200, gt = 190;
	ipl.play_qualifier(mi,gt);
}

private void play_qualifier(int team1, int team2) {
	// TODO Auto-generated method stub
	if (team1>team2) {
		System.out.println("Mimbai Indians win");
	}
	else {
		System.out.println("Gt Won the match");
	}
}

}
