import hsa.Console;

public class Desempeno38
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	int i;
	float num, a, promedio;

	i = 1;
	a = 0.00f;

	while (i <= 7)
	{
	    c.print ("Ingrese un numero: ");
	    num = c.readFloat ();
	    a = a + num;
		i++;
	}
	a = a / 7;
	    c.println ("El promedio de los numeros ingresados es: " + a);
	    if (a <= 100)
	    {
		c.println ("El promedio es menor a 100");
	    }
	    else
	{
	    c.println ("El promedio es mayor a 100");
	}
    }
}
