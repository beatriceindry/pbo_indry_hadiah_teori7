import java.util.Scanner;
class hadiahteo7{
	public static void main(String[] args){
		jarijari supobj = new jarijari();
		volume subobj = new volume();
		
		Scanner input = new Scanner (System.in);
		System.out.print("Super Class: ");
		supobj.hasil();
		System.out.println();
		System.out.println("Sub Class: ");
		System.out.print("Masukkan Jari - jari bola = ");
		subobj.r = input.nextDouble();
		subobj.phi = 3.14;
		subobj.x = 4/3;
		subobj.volume();
	}
}