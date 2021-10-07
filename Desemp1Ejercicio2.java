import hsa.Console;

public class Desemp1Ejercicio2
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor, i, suma;
	suma = 0;
	c.print ("Ingrese un valor entero: ");
	valor = c.readInt ();

	while (valor >= 0)
	{
	    c.print (valor + " ");
	    suma = suma + valor;
	    valor = valor - 2;
	}
	c.println ();
	c.println ("La suma es " + suma);
    }
}
