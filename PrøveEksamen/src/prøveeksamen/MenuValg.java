package prøveeksamen;

import java.util.Scanner;

public class MenuValg 
{
    
    public static void main(String[] args) 
    {
          
       
        Scanner myScan = new Scanner(System.in);
        System.out.println("Vælg hvordan du vil beregne \n1. Plus\n2. Minus\n3. Gange\n4. Divider");
       
        int valg = myScan.nextInt();
        
        if (valg == 1)
        {
            //kalder metoden plus fra klassen Beregninger.
            Beregninger plus = new Beregninger();
       
            int valuePlus = plus.plus();
       
                 System.out.println("Resultatet er : " + valuePlus);
              
        }
       
        
        if (valg == 2)
        {      
       
            Beregninger minus = new Beregninger();

            int valueMinus = minus.minus();

                 System.out.println("Resultatet er : " + valueMinus);
        }
        
        if (valg == 3) 
        {
                   
            Beregninger gange = new Beregninger();

            int valueGange = gange.gange();

                System.out.println("Resultatet er : " + valueGange);
        }
        
        if (valg == 4) 
        {
        
            Beregninger divi = new Beregninger();
       
            int valueDivi = divi.dividere();
       
                System.out.println("Resultatet er : " + valueDivi );   
        }
        if (valg > 4) {
            System.out.println("Prøv igen :-) Tast F6");
        }
            
    }
}
    


         
        
          
    

