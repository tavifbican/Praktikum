package week2;

public class LampuRumah {
	
	public static void main(String[] args) {
		
		//Object 1
		Lampu lampu_ruangkeluarga = new Lampu("Ruang Keluarga",18,"Kuning","Philips");
		
		lampu_ruangkeluarga.nyalakanLampu();
		lampu_ruangkeluarga.matikanLampu();
		
		
		//Object2
		Lampu lampu_kamar = new Lampu("Kamar",12,"Putih","Bradi");
		
		lampu_kamar.matikanLampu();
		lampu_kamar.nyalakanLampu();
		
	}

}
