/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellojava;

import java.util.Scanner;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author ADMIN
 */
public class HelloJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            String n = input.nextLine();
            System.out.println("Your number: " + n);
            
            
            
            if(n.length()==2){
                Random rd = new Random();
                Set<String> generatedNumbers = new HashSet<>();
                String rdNumber;
                do {
                    rdNumber = String.format("%02d", rd.nextInt(100));
                }while (!generatedNumbers.add(rdNumber));
                
                if (n.equals(rdNumber)){
                    System.out.println("Machine number: " + rdNumber);
                    System.out.println("Ban da trung 10000$!");
                }
                
                else if(n.charAt(0) == rdNumber.charAt(0) ||  n.charAt(1) == rdNumber.charAt(1)){
                    System.out.println("Machine number: " + rdNumber);
                    System.out.println("Ban da trung 5000$!");
                }
            
                else if(n.charAt(0) == rdNumber.charAt(1) &&  n.charAt(1) == rdNumber.charAt(0)){
                    System.out.println("Machine number: " + rdNumber);
                    System.out.println("Ban da trung 1000$!");
                }
            
                else{
                    System.out.println("Machine number: " + rdNumber);
                    System.out.println("No match, sorry!");
                }
            }
            else{
                System.out.println("Vui long nhap so co 2 chu so!");
            }               
        }    
    }
    

