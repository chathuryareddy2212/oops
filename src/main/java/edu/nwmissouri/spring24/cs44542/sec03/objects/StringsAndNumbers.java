/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.spring24.cs44542.sec03.objects;

/**
 *Class:44542-03 Object-Oriented Programming
 * 
 * @author ChathuryaReddy Aenugu
 * Description: Making sure everything works
 * Due:01/17/2024
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student, internet, or any other source.
 * I will not share my source code with anyone under any circumstances.
 */
import java.util.Random;
import java .util.*;
public class StringsAndNumbers {
    public static void main (String[] args) {
   
    String stringExample = "Working with string Methods in Java!";
    System.out.println("*********************StringClass*************************");
    System.out.println("The string is:" + stringExample);
    System.out.println("The length of the string is:" + stringExample.length());
    System.out.println("The character at 5th index is:" + stringExample.charAt(5)); 
    System.out.println("The substring from index 11 to 17 is:" + stringExample.substring(11 , 17));
    
    
    if(stringExample.contains("Methods"))
        System.out.println("The substring Methods is present within the stringExample: "+ "Present");
    else
        System.out.println("The substring Methods is present within the stringExample: "+ "Not Present");
    
    
    String firstName = "Chathurya Reddy";
    String lastName = "Aenugu";
    String fullName = firstName + "_" + lastName;
    System.out.println("The concatenated string is: "+ fullName);
    System.out.println("The concatenated string in lowercase is: "+ fullName.toLowerCase());
    System.out.println("The concatenated string in uppercase is:"+fullName.toUpperCase());
    
    
    String sampleText = "There are many string methods in Java!";
    System.out.println("The result after replacement is:"+ sampleText.replace("many", "various"));
    
    String searchText = " Java is an Object-Oriented Programming Language. Java is a high level, robust and secure programming language. ";
    System.out.println("The index of second occurence of Java is "+ (searchText.lastIndexOf("Java")+1));
    System.out.println("The SearchText after trimming the spaces at the beginning and end is:" + searchText.trim());
    
    
    String messageA = "hello";
    String messageB = "HELLO";
    // Ignoring Case Sensitivity
    
    if(messageA.equalsIgnoreCase(messageB))
        System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:false");
    else
        System.out.println("The result of comapring messageA and messageB considering case sensitivity is:true");
    
    //Considering Case Sensitivity
    
    if(messageA.equals(messageB))
        System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:false");
    else
        System.out.println("The result of comapring messageA and messageB considering case sensitivity is:true");
    
    
    System.out.println("The result after joining firstName and lastName with a hyphen is:"+firstName+"_"+lastName);
    
    
    
     System.out.println("******RANDOMCLASS********");
      
      Random Team2 = new Random();
      int player1 = Team2.nextInt(30-21)+21;
      int player2 = Team2.nextInt(30-21)+21;
      
      System.out.println("The Total Score for Team 2 is :"+(player1+player2));
      
      System.out.println("Random values between 0.0 and 1.0 with seed value of 20");
      Random ran1 = new Random(20);
        for(int i=0;i<5;i++){
            System.out.println("Random Value " +(i+1) +" " +ran1.nextFloat());
        }
        
        System.out.println("Random values between 0.0 and 1.0 with no seed value");
         Random ran2 = new Random();
        for(int i=0;i<5;i++){
            System.out.println("Random Value " +(i+1) +" " +ran2.nextFloat());
        }
        
        

   System.out.println("*******************MathClass*********************");


    int num1 = -20;
    int num2 = 15;
    int absolutedifference = Math.abs(num1-num2);
    System.out.println("The absolute difference between -20 and 15 is:" + absolutedifference);


   float a = (float)14.6;
   float b = (float)3.8;
   float integer = (float) a*b;
   float round = (float) Math.round(integer);
   System.out.println("The result of (14.6 * 3.8) rounded to the nearest integer is :" +round);


   float c = (float) 29.7;
   float d= (float) 4.2;
   float floor= (float) Math.floor(c/d);
   System.out.println("The floor value of (29.7/4.2) is:" +floor);


 int i = 10;
 double I= Math.pow(i,2);
 int j = 20;
 double J = Math.pow(j,2);
 double sum  = I+J;
 System.out.println("The square root of the sum of squares of 10 and 20 is:" +Math.sqrt(sum));


 int log = (int) (Math.log(256)/Math.log(2));
 System.out.println("The value of logarithm base 2 of 256 is:" +log);


   ArrayList<Integer> list = new ArrayList<>(); 
       list.add(-5);
       list.add(-10);
       list.add(0);
       list.add(15);
       list.add(8);
       
       int min = list.get(0);
       int n = list.size();
       
       for (int l =0; l<n; l++){
           if(list.get(l)<min){
               min=list.get(l);
           }
       }
        System.out.println("The minimum value  among -5, -10, 0, 15 and 8 is: " + min);
  


  int product = 7 * 9;
  int quotient = 40 / 5;
  int maxValue = Math.max(product, quotient);
  System.out.println("The maximum value between the product of 7 and 9 and the quotient of 40 divided by 5 is : " + maxValue);
        
        
   double angle30 = Math.toRadians(30); 
   double angle60 = Math.toRadians(60);
   double result = Math.sin(angle30) * Math.cos(angle60);
   System.out.println("The result of sine of 30 degrees multiplied by the cosine of 60 degrees is : " + result);
        
        
    double angle1 = Math.toRadians(45);
    double angle2 = Math.toRadians(30);
    double tangent = Math.tan(angle1 - angle2); 
    System.out.println("The result of the tangent of the difference between 45 and 30 degrees is: " + tangent);
        
        
        
    double expression = Math.abs(3 - 5) + Math.sqrt(25) - 7 * 2 / 2;
    System.out.println("The result of the expression is: " + expression);
    
    
   System.out.println("The difference betweeen the equals() and equalsIgnoreCase()methods is equals() method is used for case-sensitive string comparison, while equalsIgnoreCase() ignores case differences.");
   System.out.println("Setting a specific seed value in random number generation ensures reproducibility. The seed initializes the random number generator, making it produce the same sequence of numbers each time. This is crucial in scenarios where consistency and traceability are essential, like in scientific research or debugging.");
   System.out.println("dir(math)");
        
        
        }
    }






 