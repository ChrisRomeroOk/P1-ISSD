import hsa.Console;

public class Ejemplo29
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int suma = 0;
	int cantidad = 0;
	int n;
	int promedio;

	do
	{
	    c.print ("Ingrese una nota: ");
		n = c.readInt ();
	    if (n != 99)
	    {
		cantidad++;
		suma = suma + cantidad;
	    }
	}
	while (n != 99);
	if (cantidad != 0)
	{
	    promedio = suma / cantidad;
	    c.println ("El promedio es: " + promedio);
	}
	else
	{
	    c.println ("No se ingresaron numeros");
	}
    }
}
