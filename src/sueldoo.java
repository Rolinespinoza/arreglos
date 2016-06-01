
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
public class sueldoo
{
    public static void main(String[] args)
    {
        double res;
        double hor;
        int tipotrabajador;
        Scanner br= new Scanner(System.in);
        for (int i = 0; i < 500; i++) 
        {
            
        
         System.out.print("ingresa el numero de horas del trabajador: ");
         hor=br.nextDouble();
         System.out.println("ingresa 1 si es trabajador adeministrativo y 2 si es de planta: ");
         tipotrabajador=br.nextInt();
       // res= calsueldobruto(20,1);
         res=calsueldobruto(hor,tipotrabajador);
         System.out.println("el sueldo final del trabajador es :" +res);
        }
    }
    public  static double calsueldobruto(double horas, int tipotrab)
    {
    
        double sueldofinal=0;
        if (tipotrab==1)
        {
            sueldofinal=800+(horas*45.00);
        }
        else
            if(tipotrab==2)
        {
            sueldofinal=800+(horas*60);
        }
        return sueldofinal;
    }
}
