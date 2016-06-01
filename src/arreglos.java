
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alum.fial7
 */
public class arreglos {
    public static void main(String[] args)
    {
      //  double n1=0, n2=0, promedio=0;
        String [] anombres=  new String[4];
        double [] anotas1=   new double[4];
        double [] anotas2=   new double[4];
        double [] apromedio= new double[4];

        Scanner br= new Scanner (System.in);
        for (int i = 0; i <= 3; i++) 
        {
            System.out.println("#############################################################################");
            System.out.print("ingrese nombre del estudiante: ");
            anombres[i]=br.next();
            System.out.print("ingrese nota1: ");
            anotas1[i]=br.nextDouble();
            System.out.print("ingrese nota2: ");
            anotas2[i]=br.nextDouble();
           apromedio[i]=(anotas1[i]+anotas2[i])/2;
        }
        System.out.println("***********************************************************************************");
        System.out.println("nombre     nota1    nota2       promedio");
        System.out.println("***********************************************************************************");
        for (int j = 0; j <= 3; j++) 
        {
            System.out.println(anombres[j]+"    "+anotas1[j]+"     "+ anotas2[j]+"        "+ apromedio[j]);
            System.out.println("");
           
        }
         System.out.println("******************************************************************************");
    }
}
