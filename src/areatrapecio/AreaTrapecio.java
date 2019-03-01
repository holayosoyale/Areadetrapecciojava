/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areatrapecio;
import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class AreaTrapecio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float Bm,bm,h,Area;
       Scanner num= new Scanner(System.in);
       System.out.println("Area de un trapecio");
       System.out.println("Base menor: ");
       bm=num.nextInt();
       System.out.println("Base mayor: ");
       Bm=num.nextInt();
       System.out.println("Altura: ");
       h=num.nextInt();
       Area=((Bm+bm)*h)/2;
       System.out.println("Area: "+Area);
       
    }
    
}
