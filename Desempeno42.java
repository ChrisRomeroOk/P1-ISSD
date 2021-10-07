import hsa.Console;

public class Desempeno42
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i, a, n;
	i = 1;
	a = 475;
	n = 25;

	while (i <= 15)
	{
	    a = a + n;
	    c.print(a + " - ");
	    i++;
	}
    }
}
