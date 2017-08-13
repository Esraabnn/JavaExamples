package com.vektorel.javaexamples.ders6;

public class StringMetodlari {

	public static void main(String[] args) {
		StringMetodlari metodlari = new StringMetodlari();
		String a = "StringMetodlari ";
		String kanTestMesaji = "HASTA@Taner TEMEL@YAS@42@TARIH@21/09/2017@WBC@3.17@2.3@4.8@EC@4.7@4.1@4.5@KC@4.3@4.1@4.5@LB@4.3@4.1@4.5#HASTA@Cemal TEMEL@YAS@42@TARIH@21/09/2017@WBC@3.17@2.3@4.8@EC@4.7@4.1@4.5@KC@4.3@4.1@4.5@LB@4.3@4.1@4.5#HASTA@Ahmet TEMEL@YAS@42@TARIH@21/09/2017@WBC@3.17@2.3@4.8@EC@4.7@4.1@4.5";
		metodlari.hastalariIsle(kanTestMesaji);
	}

	public void stringMetodlari(String metin) {
		System.out.println("Karakter Sayýsý :" + metin.length());
		System.out.println("substring(10) :" + metin.substring(10));
		System.out.println("trim :" + metin.trim());
		System.out.println("charAt :" + metin.charAt(7));
		System.out.println("concat :" + metin.concat("Taner"));
		System.out.println("replace('i', '@') :" + metin.replace('i', '@'));
		System.out.println("toLowerCase :" + metin.toLowerCase());
		System.out.println("toUpperCase :" + metin.toUpperCase());
		System.out.println("indexOf(i) :" + metin.indexOf('i'));
		System.out.println("lastIndexOf('i') :" + metin.lastIndexOf('i'));
		System.out.println("subSequence(5, 7) :" + metin.subSequence(5, 7));
		System.out.println("isEmpty :" + metin.isEmpty());

		String[] dizi = metin.split("i");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Karakter Sayýsý ".concat(dizi[i]));
		}
	}

	public void hastaParsing(String kanTestMesaji) {

		String[] dizi = kanTestMesaji.split("@");
		System.out.println(dizi[0] + ":" + dizi[1]);
		System.out.println(dizi[2] + ":" + dizi[3]);
		System.out.println(dizi[4] + ":" + dizi[5]);

		double wbc = Double.parseDouble(dizi[7]);
		double wbcH = Double.parseDouble(dizi[9]);
		double wbcL = Double.parseDouble(dizi[8]);

		if (wbc > wbcL && wbc < wbcH) {
			System.out.println(dizi[6] + ":" + wbc + " <" + wbcH + " >" + wbcL + " NORMAL");
		} else if (wbc < wbcL) {
			System.out.println(dizi[6] + ":" + wbc + " <" + wbcH + " >" + wbcL + " NEGATIF");
		} else {
			System.out.println(dizi[6] + ":" + wbc + " <" + wbcH + " >" + wbcL + " POZITIF");
		}

		// Casting
		double ec = Double.parseDouble(dizi[11]);
		double ecH = Double.parseDouble(dizi[13]);
		double ecL = Double.parseDouble(dizi[12]);

		if (ec > ecL && ec < ecH) {
			System.out.println(dizi[10] + ":" + ec + " <" + ecH + " >" + ecL + " NORMAL");
		} else if (ec < ecL) {
			System.out.println(dizi[10] + ":" + ec + " <" + ecH + " >" + ecL + " NEGATIF");
		} else {
			System.out.println(dizi[10] + ":" + ec + " <" + ecH + " >" + ecL + " POZITIF");
		}
	}

	public void hastaParsingFor(String kanTestMesaji) {
		//String kanTestMesaji = "HASTA@Taner TEMEL@YAS@42@TARIH@21/09/2017@WBC@3.17@2.3@4.8@EC@4.7@4.1@4.5@KC@4.3@4.1@4.5";
		String[] dizi = kanTestMesaji.split("@");
		
		System.out.println(dizi[0] + ":" + dizi[1]);
		System.out.println(dizi[2] + ":" + dizi[3]);
		System.out.println(dizi[4] + ":" + dizi[5]);
		
		int diziLen=dizi.length;
		int dongu =  (diziLen-6)/4;
		
		for (int t = 0; t < dongu; t++) {
			int i=t*4;
			double wbc = Double.parseDouble(dizi[i+7]);
			double wbcH = Double.parseDouble(dizi[i+9]);
			double wbcL = Double.parseDouble(dizi[i+8]);

			if (wbc > wbcL && wbc < wbcH) {
				System.out.println(dizi[i+6] + ":" + wbc + " <" + wbcH + " >" + wbcL + " NORMAL");
			} else if (wbc < wbcL) {
				System.out.println(dizi[i+6] + ":" + wbc + " <" + wbcH + " >" + wbcL + " NEGATIF");
			} else {
				System.out.println(dizi[i+6] + ":" + wbc + " <" + wbcH + " >" + wbcL + " POZITIF");
			}
		}

	}
	
	private void hastalariIsle(String kanTestMesaji) {
		StringMetodlari metodlari = new StringMetodlari();
		String[] hastalar = kanTestMesaji.split("#");
		System.out.println("HASTALAR");
		for (int i = 0; i < hastalar.length; i++) {
			System.out.println("--------------------------------");
			metodlari.hastaParsingFor(hastalar[i]);	
		}
	}

}
