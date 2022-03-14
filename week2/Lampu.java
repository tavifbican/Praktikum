package week2;

public class Lampu {
	
	boolean nyala;
	
	void nyalakanLampu() {
		nyala = true;
		System.out.println("Apakah Lampu Menyala? "+nyala);
	}
	
	void matikanLampu() {
		nyala = false;
		System.out.println("Apakah Lampu Menyala? "+nyala);
	}
	
	public Lampu(String jenis, int watt, String warna, String merk){
		 System.out.println("Lampu "+jenis+" "+watt+"Watt berwarna "+warna+" bermerk "+merk+".");
	}

}
