package week2;

public class SepedaAnak {
	
	public static void main(String[] args) {
		int gearSepeda;
		
		//membuat objek
		Sepeda sepedaBayi = new Sepeda(2,"Bayi","Polygon");
		
		//mengakses atribut dan method
		gearSepeda = sepedaBayi.gear;
		System.out.println("Jumlah gear "+gearSepeda);
		sepedaBayi.ngerem();
		
		
		//Object 2
		Sepeda sepedaBMX = new Sepeda(2,"BMX","United");
		
		gearSepeda = sepedaBMX.gear;
		System.out.println("Jumlah gear "+gearSepeda);
		sepedaBMX.ngerem();
	}

}