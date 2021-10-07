import hsa.Console;

public class Desempeno39
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i, par, impar, cero, num;

	i = 1;
	par = 0;
	impar = 0;
	cero = 0;

	while (i <= 15)
	{
	    c.print ("Ingrese un numero: ");
	    num = c.readInt ();
	    if (num % 2 == 0)
	    {
		par++;
	    }
	    else
	    {
		impar++;
	    }
	    if (num == 0)
	    {
		cero++;
	    }
	    i++;
	}


	c.println ("la cantidad de numeros pares es: " + par);
	c.println ("la cantidad de numeros impares son: " + impar);
	c.println ("la cantidad de numeros ceros es: " + cero);
    }
}
