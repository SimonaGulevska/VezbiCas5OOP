package fikt.oop.inki895.zad1;

public class Glavna {

	public static void main(String[] args) {
		KalkulatorZaCeliBroevi presmetki1 = new KalkulatorZaCeliBroevi();
		int x = 25;
		int y = 5;
		System.out.println("Одземање: "+presmetki1.odzemanje(x,y));
		System.out.println("Собирање: "+presmetki1.sobiranje(x,y));
		System.out.println("Множење: "+presmetki1.mnozenje(x,y));
		System.out.println("Делење: "+presmetki1.delenje(x,y));
		System.out.println("Остаток: "+presmetki1.ostatok(x,y));
		System.out.println("Степенување: "+presmetki1.stepenuvanje(x,y));
	}
}
