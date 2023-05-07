
package No_4;



public class Math {
    
    

    
 static double Sisi(double sisi1, double sisi2) {
     



  double sisi3, luas;
  
  
sisi3 = (sisi1*sisi1)+(sisi2*sisi2);

System.out.println("Panjang sisi ketiga adalah: " + java.lang.Math.sqrt(sisi3)); 


System.out.println(" ");
System.out.println(" ");


luas = (sisi1*sisi2)/2;

return luas;

}

 
static double Sisi(double sisi1, double sisi2, double sisi3) {
     


  double luas;

  
if ( sisi1 > sisi2 && sisi1 > sisi3 ) {

System.out.println("sisi terbesar: " + sisi1);

System.out.println(" ");

System.out.println(" ");


luas = (sisi2*sisi3)/2; }

        
else if ( sisi2 > sisi1 && sisi2 > sisi3 ) {

System.out.println("sisi terbesar: " + sisi2);

System.out.println(" ");

System.out.println(" ");


luas = (sisi1*sisi3)/2;


}

else {

System.out.println("sisi terbesar: " + sisi3);

System.out.println(" ");

System.out.println(" ");


luas = (sisi1*sisi2)/2;


}


return luas;
}





  public static void main(String args[]){
      
      
    Pattern pattern = new Pattern(); 
    
    
    System.out.println("Luas segitiga adalah: " + Sisi(1.0,2.0));
    
    
    System.out.println(" ");
    System.out.println(" ");

    
  
    System.out.println("Luas segitiga adalah: " +  Sisi(1.0, 2.0, 3.0));

    System.out.println(" ");
    System.out.println(" ");


  
}



}

