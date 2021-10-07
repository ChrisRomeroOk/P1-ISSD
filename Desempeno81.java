import hsa.Console;

public class Desempeno81
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int caja1 = 0, caja2 = 0, caja3 = 0;
	int[] vec1 = new int [10];
	for (int f = 0 ; f < vec1.length ; f++)
	{
	    c.print ("Ingrese un valor del primer vector: ");
	    vec1 [f] = c.readInt ();
	}
	for (int f = 0 ; f < vec1.length ; f++)
	{
	    caja1 = caja1 + vec1 [f];
	}

	int[] vec2 = new int [10];
	for (int f = 0 ; f < vec2.length ; f++)
	{
	    c.print ("Ingrese un valor del segundo vector: ");
	    vec2 [f] = c.readInt ();
	}
	for (int f = 0 ; f < vec2.length ; f++)
	{
	    caja2 = caja2 + vec2 [f];
	}

	int[] vec3 = new int [10];
	for (int f = 0 ; f < vec3.length ; f++)
	{
	    c.print ("Ingrese un valor del tercer vector: ");
	    vec3 [f] = c.readInt ();
	}
	for (int f = 0 ; f < vec3.length ; f++)
	{
	    caja3 = caja3 + vec3 [f];
	}
	if (caja1 > caja2 && caja1 > caja3)
	{
	    c.println ("El primer vector es el que tiene el mayor valor acumulado.");
	}
	if (caja2 > caja1 && caja2 > caja3)
	{
	    c.println ("El segundo vector es el que tiene el mayor valor acumulado.");
	}
	if (caja3 > caja1 && caja3 > caja2)
	{
	    c.println ("El tercer vector es el que tiene el mayor valor acumulado.");
	}
    }
}

