// The "Desempeno83" class.
import java.awt.*;
import hsa.Console;

public class Desempeno83
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int[] vec = new int [10];
	for (int f = 0 ; f < vec.length ; f++)
	{
	    c.print ("Ingrese un valor: ");
	    vec [f] = c.readInt ();
	}
	int mayor = 0;
	for (int f = 0 ; f < vec.length ; f++)
	{
	    if (vec [f] > vec [4])
	    {
		mayor++;
	    }
	}
	c.println ("Cantidad de valores mayores al valor del quinto elemento: " + mayor);
    } // main method
} // Desempeno83 class
