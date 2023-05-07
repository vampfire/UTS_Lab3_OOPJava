/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No_4;

/**
 *
 * @author HP
 */

import java.util.Scanner;

public class Pattern {
    
    public static final double PI = 3.14159265;
    
    
  Pattern() {
      
    double luas;
     

Scanner input = new Scanner(System.in);

    System.out.println("Program Menghitung Luas Segitiga");
    System.out.println("dengan Menggunakan Bahasa Java");

System.out.println(" ");
System.out.println(" ");

 

  char pil;
  double sisi1, sisi2, sisi3, val1, val2, val3, ret1, ret2, ret3, sudut, sudut2;


 System.out.println("Input besar salah satu sudut segitiga: ");
 sudut = input.nextDouble();


 System.out.println(" ");


 sudut2 = 180 - sudut - 90;


 System.out.println("Besar sudut segitiga kedua: " + sudut2 + " Derajat");

 System.out.println(" ");



 System.out.println("Besar sudut segitiga ketiga: 90 Derajat");


 System.out.println(" ");


val1 = PI / 180.0; 
ret1 = java.lang.Math.sin(sudut*val1); 

val2 = PI / 180.0; 
ret2 = java.lang.Math.sin(sudut*val2); 

val3 = PI / 180.0; 
ret3 = java.lang.Math.sin(sudut*val3); 


 System.out.println("Input besar sisi segitiga: ");
 sisi1 = input.nextDouble();


System.out.println("(Pilih 1), jika sisi tersebut adalah bagian depan dari segitiga! ");
System.out.println("(Pilih 2), jika sisi tersebut adalah bagian depan dari segitiga! ");
System.out.println("(Pilih 3), jika sisi tersebut adalah bagian depan dari segitiga! ");

pil = input.next().charAt(0);

switch (pil) {

      case '1':

sisi2 = sisi1/ret1;

sisi3 = sisi1/ret3;

System.out.println("Panjang sisi segitiga ke-2: " + sisi2);
System.out.println(" ");
System.out.println("Panjang sisi segitiga ke-3: " + sisi3);
System.out.println(" ");


System.out.println(" ");

     
    if (sisi1 > sisi2 && sisi1 > sisi3 ) {
    System.out.println("sisi terbesar: " + sisi1);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi2*sisi3)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }


    else if (sisi2 > sisi1 && sisi2 > sisi3 ) {
    System.out.println("sisi terbesar: " + sisi2);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi1*sisi3)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }


    else {
    System.out.println("sisi terbesar: " + sisi3);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi1*sisi2)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }

break;


      case '2':


sisi2 = sisi1/ret1;

sisi3 = sisi1/(1/ret3);

System.out.println("Panjang sisi segitiga ke-2: " + sisi2);
System.out.println(" ");
System.out.println("Panjang sisi segitiga ke-3: " + sisi3);
System.out.println(" ");


System.out.println(" ");

     
    if (sisi1 > sisi2 && sisi1 > sisi3 ) {
    System.out.println("sisi terbesar: " + sisi1);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi2*sisi3)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }


    else if (sisi2 > sisi1 && sisi2 > sisi3 ) {
    System.out.println("sisi terbesar: " + sisi2);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi1*sisi3)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }


    else {
    System.out.println("sisi terbesar: " + sisi3);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi1*sisi2)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }

break;

      case '3':


sisi2 = sisi1/(1/ret1);

sisi3 = sisi1/(1/ret2);

System.out.println("Panjang sisi segitiga ke-2: " + sisi2);
System.out.println(" ");
System.out.println("Panjang sisi segitiga ke-3: " + sisi3);
System.out.println(" ");


System.out.println(" ");

     
    if (sisi1 > sisi2 && sisi1 > sisi3 ) {
    System.out.println("sisi terbesar: " + sisi1);
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi2*sisi3)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }


    else if (sisi2 > sisi1 && sisi2 > sisi3 ) {
    System.out.println("sisi terbesar: + sisi2");
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi1*sisi3)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }


    else {
    System.out.println("sisi terbesar: + sisi3");
    System.out.println(" ");
    System.out.println(" ");

    luas = (sisi1*sisi2)/2;

    System.out.println("Luas segitiga adalah: " + luas);
    System.out.println(" ");
    System.out.println(" ");

    }

break;

}

  }
  
 
}