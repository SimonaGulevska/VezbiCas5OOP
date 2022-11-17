package fikt.oop.inki895.zad2;

public class Glavna {

	public static void main(String[] args) {
		KalkulatorZaDecimalniBroevi kalkulacii1=new KalkulatorZaDecimalniBroevi();
		double x=15;
		double y=5.5;
		System.out.println("Одземање: "+kalkulacii1.odzemanje(x,y));
		System.out.println("Собирање: "+kalkulacii1.sobiranje(x,y));
		System.out.println("Множење: "+kalkulacii1.mnozenje(x,y));
		System.out.println("Делење: "+kalkulacii1.delenje(x,y));
		System.out.println("Остаток: "+kalkulacii1.ostatok(x,y));
		System.out.println("Степенување: "+kalkulacii1.stepenuvanje(x,y));
	}
}
