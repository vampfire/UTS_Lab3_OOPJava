/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

/**
 *
 * @author HP
 */

public class Employee {
    
    int id;
    String firstname;
    String lastname;
    int salary;
    int annualsalary;
    String name;
    
   
  Employee(int id, String firstname, String lastname, int salary) 

  {
      
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        
    }
       
    //Method Get
  
    int getID(){
        return id;
    }
    
      String getName(){
       name = firstname + " " + lastname;
        return name;
    }


    String getFirstName(){
        return firstname;
    }

    String getLastName(){
        return lastname;
    }
    

    void setSalary(int salary){
        this.salary = salary;
    }
    
    int getSalary(){
        return salary;
    }

    
    int getAnnualSalary() {
        annualsalary = salary * 12;
        return annualsalary;
    }
    
    
    int raiseSalary (int percent){
        
      salary = salary + (salary * percent / 100);
      
      return(salary);
   

    }
    
    @Override
    
    public String toString() {
        return "Employee[id=" + id + ",name=" + name + ",salary=" + salary +"]";
    }
    

}