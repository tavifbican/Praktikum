package week1;

public class Tabung {
	
	static float Volume(float diameter, float tinggi) {
		return (float) (Math.pow(diameter/2,2) * 3.14 * tinggi);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Volume Tabung dengan diameter 5cm dan tinggi 8cm adalah " + Volume(5,8) + "cm");
	}

}
