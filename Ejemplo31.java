import java.awt.*;
import hsa.Console;

public class Ejemplo31
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int d1, d2, suma;
	char opcion = ' ';
	c = new Console ();
	do
	{
	    c.clear ();
	    d1 = (int) (Math.random () * 6) + 1;
	    d2 = (int) (Math.random () * 6) + 1;
	    c.setCursor (5, 20);
	    c.print ("Dado 1: " + d1);
	    c.setCursor (7, 20);
	    c.print ("Dado 2: " + d2);
	    suma = d1 + d2;
	    c.setCursor (10, 20);
	    if (suma == 7)
		c.print ("*** Gano ***");
	    else
		c.print ("Perdio");
	    c.setCursor (15, 20);
	    c.print ("Realiza otra tirada de dados (s / n):");
		if (opcion == 'S' || opcion == 's')
		    opcion = c.readChar ();
		opcion = c.readChar ();
	}
	while (opcion == 'S' || opcion == 's');
	System.exit (0);
    }
}
