import hsa.Console;

public class Desempeno82
{
    static Console c;
    public static void main (String[] args)
    {
	c = new Console ();
	int[] vec1 = new int [5];
	for (int f = 0 ; f < vec1.length ; f++)
	{
	    c.print ("Ingrese un valor del primer vector: ");
	    vec1 [f] = c.readInt ();
	}
	int[] vec2 = new int [5];
	for (int f = 0 ; f < vec2.length ; f++)
	{
	    c.print ("Ingrese un valor del segundo vector: ");
	    vec2 [f] = c.readInt ();
	}
	c.println ("Vector 1: (" + vec1 [0] + " " + vec1 [1] + " " + vec1 [2] + " " + vec1 [3] + " " + vec1 [4] + ")");
	c.println ("Vector 2: (" + vec2 [0] + " " + vec2 [1] + " " + vec2 [2] + " " + vec2 [3] + " " + vec2 [4] + ")");

    }
}
