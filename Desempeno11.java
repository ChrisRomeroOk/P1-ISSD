import hsa.Console;

public class Desempeno11
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console ();
	int largo, ancho, superficie;
	c.print ("Ingrese el largo de la habitacion: ");
	largo = c.readInt ();
	c.print ("Ingrese el ancho de la habitacion: ");
	ancho = c.readInt ();
	superficie = largo * ancho;
	if (superficie > 10)
	 {
	  c.println ("Habitacion adecuada");
	 }
	else
	 {
	 c.println ("Habitacion chica");
	 }
    }
}
