// The "Desempeno85" class.
import java.awt.*;
import hsa.Console;

public class Desempeno85
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int[] vectorA;
	int[] pares;
	int[] impares;
	int contadorPar = 0;
	int contadorImpar = 0;

	vectorA = new int [12];

	for (int i = 0 ; i < vectorA.length ; i++)
	{
	    c.print ("ingrese valores: ");
	    vectorA [i] = c.readInt ();


	    if (vectorA [i] % 2 == 0)
	    {
		contadorPar++;
	    }
	    else
	    {
		contadorImpar++;
	    }

	}
	c.print ("Vector: [");
	for (int i = 0 ; i < vectorA.length ; i++)
	{
	    c.print (vectorA [i] + " - ");
	}
	c.print ("]");

	pares = new int [contadorPar];
	impares = new int [contadorImpar];

	contadorPar = 0;
	contadorImpar = 0;

	for (int i = 0 ; i < 12 ; i++)
	{
	    if (vectorA [i] % 2 == 0)
	    {
		pares [contadorPar] = vectorA [i];
		contadorPar++;
	    }
	    else
	    {
		impares [contadorImpar] = vectorA [i];
		contadorImpar++;
	    }
	}
	c.println ();
	c.print ("Vector Pares: [");
	for (int i = 0 ; i < contadorPar ; i++)
	{
	    c.print (pares [i] + " - ");
	}
	c.print ("]");

	c.println ();

	c.print ("Vector Impares: [");
	for (int i = 0 ; i < contadorImpar ; i++)
	{
	    c.print (impares [i] + " - ");
	}
	c.print ("]");

    } // main method
} // Desempeno85 class
