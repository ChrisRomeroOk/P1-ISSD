//Elaborá un programa que muestre el mayor
//de 20 números ingresados.


import hsa.Console;

public class Desempeno54
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int n, i, mayor;
	mayor = 0;

	for (i = 1 ; i <= 20 ; i++)
	{
	    c.print ("Ingrese un numero: ");
	    n = c.readInt ();

	    int numAux = n;

	    if (numAux > mayor)
	    {
		mayor = numAux;

	    }
	}
	c.println ("El mayor numero ingresado es: " + mayor);
    }
}
