//Desarrollar un programa que muestre la tabla de multiplicar del 5 (del
//1 al 20).


import hsa.Console;

public class Desempeno55
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i, a, b, resultado;
	a = 5;
	b = 1;

	for (i = 1 ; i <= 20 ; i++)
	{
	    resultado = a * b;
	    c.println (a + " x " + b + " = " + resultado);
	    b++;
	}
    }
}
