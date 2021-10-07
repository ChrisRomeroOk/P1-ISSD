import hsa.Console;

public class Desempeno40
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i, a, n;
	i = 1;
	a = 0;

	while (i <= 10)
	{
	    c.print ("Ingrese un numero: ");
	    n = c.readInt ();
	    if (i > 5)
	    {
		a = a + n;
	    }
	    i++;
	}
	c.println ("La suma de los ultimos 5 numeros ingresados es: " + a);
    }
}
