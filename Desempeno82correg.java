// The "Desempeno82correg" class.
import java.awt.*;
import hsa.Console;

public class Desempeno82correg
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c = new Console ();
	int[] vA = new int [5];
	int[] vB = new int [5];
	int[] suma = new int [5];


	c.println ("Ingrese los numeros a sumar:");

	for (int i = 0 ; i < vA.length ; i++)
	{
	    c.print ("Ingrese numero Vector A[" + i + "]: ");
	    vA [i] = c.readInt ();
	    c.print ("Ingrese numero Vector B[" + i + "]: ");
	    vB [i] = c.readInt ();

	    suma [i] = vA [i] + vB [i];
	}

	c.println ();
	c.print ("Vector A : [");
	for (int i = 0 ; i < vA.length ; i++)
	{
	    c.print (vA [i] + " - ");
	}
	c.print ("]");

	c.println ();

	c.print ("Vector B : [");
	for (int i = 0 ; i < vA.length ; i++)
	{
	    c.print (vB [i] + " - ");
	}
	c.print ("]");

	c.println ();

	c.print ("Suma :     [");
	for (int i = 0 ; i < vA.length ; i++)
	{
	    c.print (suma [i] + " - ");
	}
	c.print ("]");
    } // main method
} // Desempeno82correg class
