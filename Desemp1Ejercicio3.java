import hsa.Console;

public class Desemp1Ejercicio3
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int valor, serie, suma, i, multiplo;
	valor = 19;
	serie = 6;
	multiplo = 4;
	suma = 0;

	for (i = 1 ; i <= 15 ; i++)
	{
	    valor = valor + multiplo;
	    c.println (valor + "x" + serie + "=" + valor * 6);
	    suma = suma + valor * 6;
	}
	c.println ("La suma total de los 15 terminos es: " + suma);
    }
}

