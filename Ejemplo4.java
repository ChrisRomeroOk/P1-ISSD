import hsa.Console;
class Ejemplo4
 {
  static Console c;
  public static void main(String arg[])
   {
    String n1, n2, n3;
    float a1, a2, a3;
    float promedio;
    c = new Console();
    c.print("Ingrese primer nombre: ");
    n1 = c.readLine();
    c.print("Ingrese su altura: ");
    a1 = c.readFloat();
    c.print("Ingrese segundo nombre: ");
    n2 = c.readLine();
    c.print("Ingrese su altura: ");
    a2 = c.readFloat();
    c.print("Ingrese tercer nombre: ");
    n3 = c.readLine();
    c.print("Ingrese su altura: ");
    a3 = c.readFloat();
    promedio = (a1 + a2 + a3)/3;
    c.println();
    c.println("La altura promedio es: " + promedio);
   }
 }
