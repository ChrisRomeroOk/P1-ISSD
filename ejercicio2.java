import hsa.Console;
class ejercicio2
 {

   static Console c;
   public static void main (String arg[])
    {
    
    float a, suma, mult, resultado;
    int b;
    c = new Console();
    c.print("Ingrese un numero: ");
    a = c.readFloat();
    c.print("Ingrese otro numero: ");
    b= c.readInt();
    suma = a+b;
    mult = a*b;
    c.println();
    c.println("resultado" + suma + mult); 
    }
    
}    
   
