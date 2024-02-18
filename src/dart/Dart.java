/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dart;

import java.util.Scanner;

/**
 *
 * @author Emir Sapmaz
 */
public class Dart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dart Game!");
        System.out.println("Enter the number of darts to be thrown");
        int dartnumber = input.nextInt();
        int drt = dartnumber;
        int dartn = 1;
        int a=0,b=0,c=0,d=0,e=0,f=0,u=0;
        while(dartnumber>0){
            double randomx = (Math.random()*2)-1;
            randomx = Math.round(randomx*10.0)/10.0;
            double x = randomx;
           
            
            double randomy = (Math.random()*2)-1;
            randomy = Math.round(randomy*10.0)/10.0;
            double y = randomy;
            
            System.out.println("Dart "+dartn+":");
            System.out.print("Coordinates:"+"("+x+")"+","+"("+y+")");
            
            String region;
            if(x>0 && y<0){
                region = "F";
                a++;
            }else if (x<0 && y>0){
                region = "C";
                c++;
            }else if (x>0 && y>0 && x+y<1){
                region = "A";
                a++;
            }else if (x>0 && y>0 && x+y>1){
                region = "B";
                b++;
            }else if (x+y==1){
                region = "Undecided";
               u++;
            }else if (x<0 && y<0 && x<y){
                region = "D";
                d++;
            }else if (x<0 && y<0 && x>y){
                region = "E";
                e++;
            }else if (x==y){
                region = "Undecided";
                u++;
            }else{
                region = "Undecided";
                u++;
            }
                
            System.out.println("Region: "+region);

            dartnumber--;
            dartn++;
        } 
            
            int pera = ((a*100)/drt);
            int perb = ((b*100)/drt);
            int perc = ((c*100)/drt);
            int perd = ((d*100)/drt);
            int pere = ((e*100)/drt);
            int perf = ((f*100)/drt);
            int peru = ((u*100)/drt);
            
            System.out.println("Region statistics: " );
            System.out.println("A: "+a+" dart "+"("+pera+"%"+")");
            System.out.println("B: "+b+" dart "+"("+perb+"%"+")");
            System.out.println("C: "+c+" dart "+"("+perc+"%"+")");
            System.out.println("D: "+d+" dart "+"("+perd+"%"+")");
            System.out.println("E: "+e+" dart "+"("+pere+"%"+")");
            System.out.println("F: "+f+" dart "+"("+perf+"%"+")");
            System.out.println("Undecided: "+u+" dart "+"("+peru+"%"+")");
            
            
        
        
  
        
    }
}
