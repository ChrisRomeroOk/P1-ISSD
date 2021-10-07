import hsa.Console;

public class Desempeno41
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i, a, b;
	
	i = 6;
	a = 0;
	b = 0;

	while (i <= 50)
	{

	    a = i * 5;
	    b = b += a;

	    i++;
	}
	c.println ("La suma final es: " + b);
    }
}
