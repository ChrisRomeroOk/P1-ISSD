//Confeccion� un programa que permita ingresar un valor del 1 al 10 y
//nos muestre los m�ltiplos del mismo (los primeros 30 t�rminos).


import hsa.Console;

public class Desempeno56
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor, i, resultado;

	c.print ("Ingrese un valor del 1 al 10: ");
	valor = c.readInt ();

	if (valor <= 10)
	{
	    c.println ("Multiplos de " + valor);

	    for (i = 1 ; i <= 30 ; i++)
	    {
		resultado = valor * i;
		c.print (resultado + " - ");
	    }
	}
	else
	{
	c.println ("dato erroneo");
	}
    }
}
