/* @author paola*/

package practica1;

import java.util.Scanner;


public class Figura 
//Atributos
{
    private double largo;
    private double ancho;
    private double alto;
    private double volumen;
    
    public Figura(double volumen)
    {
        this.volumen = volumen;
    }
        
   Figura(){}
   
   public double getLargo()
   {
       return largo;
   }
   
   public void setLargo(double largo)
   {
       this.largo = largo;
   }
   
   public double getAncho()
   {
       return ancho;
   }
   
   public void setAncho(double ancho)
   {
       this.ancho = ancho;
   }
   
   public double getAlto()
   {
       return alto;
   }
   
   public void setAlto(double alto)
   {
       this.alto = alto;
   }
   
   public double getVolumen()
   {
       System.out.println("Tu resultado es:");
       volumen = (getAncho()*getAlto()*getLargo());
       return volumen;
   }
   
   public void setVolumen(double volumen)
   {
       this.volumen = volumen;
   }
   
   public void leer_medida()
   {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Para sacar el volumen de sus figuras");
       System.out.println("Largo de la figura: ");
       setLargo(entrada.nextInt());
       System.out.println("Ancho de la figura: ");
       setAncho(entrada.nextInt());
       System.out.println("Alto de la figura: ");
       setAlto(entrada.nextInt());
   }
   
   public void imprimir_medida()
   {
       System.out.println("Tus medidas son: ");
       Scanner entrada = new Scanner(System.in);
       System.out.println("Largo: ");
       System.out.println(getLargo());
       System.out.println("Ancho: ");
       System.out.println(getAncho());
       System.out.println("Alto: ");
       System.out.println(getAlto());
   }
   
   double obtener_volumen()
   {
       System.out.println(getVolumen());
       return volumen;
   }
}