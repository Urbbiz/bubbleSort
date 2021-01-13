/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masyvaspaeiliui;

/**
 *
 * @author Andrius
 */
public class MasyvasPaeiliui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      BUBBLE SORT  principas
        
        int[] masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
 
          System.out.println("Nuo maziausio iki didziausio");
          
        for (int i = 0; i < masyvas.length; i++) {
//            System.out.println("Nuo maziausio iki didziausio");
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] > masyvas[j]) 
                    {
                        int sk = masyvas[i];
                        masyvas[i] = masyvas[j];
                        masyvas[j] = sk;
                    }
                }
//               
            System.out.println(masyvas[i]);
        }
        System.out.println("----------------");
        System.out.println();
//        pirmas
      
    
        // surusiuoti mazejimo tvarka
System.out.println("Nuo didziausio iki maziausio");
         for (int i = 0; i < masyvas.length; i++) {
//            System.out.println("Nuo maziausio iki didziausio");
            for (int j = i + 1; j < masyvas.length; j++) {
                if (masyvas[i] < masyvas[j]) 
                    {
                        int sk = masyvas[i];
                        masyvas[i] = masyvas[j];
                        masyvas[j] = sk;
                    }
                }
//               
            System.out.println(masyvas[i]);
        }
    }
    
}
