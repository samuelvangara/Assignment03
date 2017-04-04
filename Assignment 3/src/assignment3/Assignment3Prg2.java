/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Foxy
 */
public class Assignment3Prg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Enter the number of Students: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] id = new int[20];     
        String[] Name = new String[20];
        double[] fees = new double[20];
        char[] section = new char[20];
        char ifSection;
        for(int i=0;i<size;i++)
        {
            
            System.out.println("Enter the ID of the student");
            int ID=scan.nextInt();
            id[i]=ID;
            
            System.out.println("Enter the name of the student");
            String name=scan.next();
            Name[i]=name;
           
            System.out.println("Enter the Fees of the student");
            double fee=scan.nextDouble();
            fees[i]=fee;
            
            System.out.println("Enter the Section of the student");
            char Section=scan.next().charAt(0);
            section[i]=Section;
        }
        
           System.out.println("Enter section that you want to see the result :");
           ifSection = scan.next().charAt(0);
          
           for(int i=0;i<size;i++){
           if(section[i]==(ifSection))
           {
               System.out.println("*********RESULT*****************");
               System.out.println("ID  "+"Name "+"Fees "+"Section  ");
               System.out.println(id[i]+"  "+Name[i]+"  "+fees[i]+"  "+section[i]);
           } 
           else
           {
               
               System.out.println("The Section you have entered is not available, Please enter the Correct Section.");
           }
           }
        scan.close();
        
    }
    
}
