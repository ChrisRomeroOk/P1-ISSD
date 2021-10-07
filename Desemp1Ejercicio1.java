import hsa.Console;

public class Desemp1Ejercicio1
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor, digitos;

	c.print ("Ingrese un valor entero: ");
	valor = c.readInt ();
	digitos = valor;

	while (valor != 0)
	{
	    c.println (valor);
	    valor = valor / 10;
	}
	c.println ();

	if (digitos >= 1 && digitos <= 9)
	{
	    c.println ("El numero ingresado tiene 1 digito.");
	}
	if (digitos >= 10 && digitos <= 99)
	{
	    c.println ("El numero ingresado tiene 2 digitos.");
	}
	if (digitos >= 100 && digitos <= 999)
	{
	    c.println ("El numero ingresado tiene 3 digitos.");
	}
	if (digitos >= 1000 && digitos <= 9999)
	{
	    c.println ("El numero ingresado tiene 4 digitos.");
	}
	if (digitos >= 10000)
	{
	    c.println ("El numero ingresado tiene 5 digitos o mas.");
	}
    }
}
