import hsa.Console;
class Ejercicio1
 {
  static Console c;
  public static void main(String arg[])
   {
    int n1, n2, resultado;
    c = new Console();
    c.print("Ingrese el primer numero: ");
    n1 = c.readInt();
    c.print("Ingrese el segundo numero: ");
    n2 = c.readInt();
    resultado = n1 + n2;
    c.println();
    c.println("El resultado de la suma es: " + resultado);
   }
 }
    
