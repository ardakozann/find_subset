
public class ArrayCheck {
	
	boolean siraliAltKumeVarMi(int[] sayilar, int ulasilacakToplam) {
		
		int temp;
		
		if (-100 * sayilar.length > ulasilacakToplam) {
			return false;
		}
		
		// Sayıları gezmek için for döngüsü
		for (int i = 0; i < sayilar.length; i++) {
			
			temp = 0;
			
			// Toplama yapmak için for döngüsü
			for (int j = 0; i + j < sayilar.length; j++) {
				
				temp += sayilar[i + j];
				
				if (temp == ulasilacakToplam) {
					return true;
				}
			}
		}
		return false;
	}
}
