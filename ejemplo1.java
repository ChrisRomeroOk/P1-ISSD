import hsa.Console;
class ejemplo1
 {
   static Console c;
   public static void main(String arg[])
    {
      float precio, importe;
      int cantidad;
      c = new Console();
      c.print("Ingrese Precio: ");
      precio = c.readFloat();
      c.print ("Ingrese Cantidad: ");
      cantidad = c.readInt();
      importe = precio * cantidad;
      c.println();
      c.println("El importe a abonar es: " + importe);
    }
 }
