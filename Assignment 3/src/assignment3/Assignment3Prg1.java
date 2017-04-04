/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.*;

/**
 *
 * @author Foxy
 */
public class Assignment3Prg1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number of Students: ");
          System.out.println("This is git branch");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] id = new int[10];     
        String[] Name = new String[20];
        double[] fees = new double[20];
        char[] section = new char[20];
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
        
           System.out.println("*********RESULT*****************");
           System.out.println("ID  "+"Name "+"Fees "+"Section  ");
           
        for(int i=0;i<size;i++)
        {
            
            System.out.println(id[i]+"  "+Name[i]+"  "+fees[i]+"  "+section[i]);
        }
                     
        scan.close();
        
    }
    
}
