package week2;

public class AksiSepeda {
	
	public static void main(String[] args) {
		int gearSepeda;
		
		//membuat objek
		Sepeda sepedaBalap = new Sepeda(2,"Balap","Polygon");
		
		//mengakses atribut dan method
		gearSepeda = sepedaBalap.gear;
		System.out.println("Jumlah gear "+gearSepeda);
		sepedaBalap.ngerem();
		
		
		//Object 2
		Sepeda sepedaGunung = new Sepeda(2,"Gunung","United");
		
		gearSepeda = sepedaGunung.gear;
		System.out.println("Jumlah gear "+gearSepeda);
		sepedaGunung.ngerem();
	}

}