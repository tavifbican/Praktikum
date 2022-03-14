package week2;

public class Sepeda {
	
	int gear = 5;

	void ngerem() {
		 System.out.println("Sepeda direm");
	}
	
	public Sepeda(int jumlahRoda, String jenis, String merk){
		 System.out.println("Sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahRoda);
	}

}
