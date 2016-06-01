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
        res= calsueldobruto(20,1);
        System.out.println("el sueldo final del trabajador es :" +res);
    }
    public  static double calsueldobruto(double horas, int tipotrab)
    {
    
        double sueldofinal=0;
        if (tipotrab==1)
        {
            sueldofinal=horas*45.00;
        }
        else
            if(tipotrab==2)
        {
            sueldofinal=horas*60;
        }
        return sueldofinal;
    }
}
