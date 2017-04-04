/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Foxy
 */
public class Assignment3Prg3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number of Students: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        StudentDetails[] Student = new StudentDetails[4];
         for(int i=0;i<size;i++)
        {
                   
            StudentDetails sd = new StudentDetails();
            System.out.println("Enter the ID of the student");
            int ID=scan.nextInt();
            sd.setId(ID);
            
            System.out.println("Enter the name of the student");
            String name=scan.next();
            sd.setName(name);
           
            System.out.println("Enter the Fees of the student");
            double fee=scan.nextDouble();
            sd.setFees(fee);
            
            System.out.println("Enter the Section of the student");
            char Section=scan.next().charAt(0);
            sd.setSection(Section);
            
            Student[i]= sd;
        }
       
          System.out.println("*********RESULT*****************");
           System.out.println("ID  "+"Name "+"Fees "+"Section  ");
           
        for(int i=0;i<size;i++)
        {
            
            System.out.println(Student[i].toString());
        }
            
        scan.close();
        
        
    }
    
}
