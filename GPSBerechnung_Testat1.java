import java.util.Scanner;
public class GPSBerechnung_Testat1 {
	public static void main(String[]args) {
		final int LICHTGESCHWINDIGKEIT = 299792458;
		int laufzeit;
		double entfernung;
		double lichtgeschwindigkeitInt;
		
		Scanner sc = new Scanner(System.in);
		laufzeit = sc.nextInt();
		sc.close();
		
		if(laufzeit > 80 && laufzeit < 130) {
			lichtgeschwindigkeitInt = LICHTGESCHWINDIGKEIT * 0.000001;
			entfernung = laufzeit * lichtgeschwindigkeitInt;
			System.out.println(entfernung);
		} else {
			System.out.println("Eingabefehler");
		}
	}
}
