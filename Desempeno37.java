import hsa.Console;

public class Desempeno37
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i = 1;
	int a = 0;
	while (i <= 100)
	{
	    a = a + i;
	    i = i + 1;
	}
	c.println ("la suma total es:" + a);
    }
}
