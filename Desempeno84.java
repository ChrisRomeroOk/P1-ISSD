// The "Desempeno84" class.
import java.awt.*;
import hsa.Console;

public class Desempeno84
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	float[] notas = new float [15];
	float todo=0;
	for (int f = 0 ; f < notas.length ; f++)
	{
	    c.print ("Ingrese una nota: ");
	    notas [f] = c.readFloat ();
	    todo = todo + notas [f];
	}

	float promedio = todo / notas.length;
	c.println ("El promedio de las notas ingresadas es: " + promedio);

    } // main method
} // Desempeno84 class
