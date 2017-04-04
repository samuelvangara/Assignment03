/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Foxy
 */
public class StudentDetails {

   
    private int Id;
    private String Name;
    private double Fees;
    private char Section;
  

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getFees() {
        return Fees;
    }

    public void setFees(double Fees) {
        this.Fees = Fees;
    }

    public char getSection() {
        return Section;
    }

    public void setSection(char Section) {
        this.Section = Section;
    }
    
    @Override
    public String toString()
    {
        return (getId()+"   "+getName()+"   "+getFees()+"   "+getSection());
    }
    
}
