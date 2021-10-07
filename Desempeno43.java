import hsa.Console;

public class Desempeno43
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int i, menores, entre, mayores;
	float precio;
	i = 1;
	menores = 0;
	entre = 0;
	mayores = 0;

	while (i <= 12)
	{
	    c.print ("ingrese el precio del producto: $");
	    precio = c.readFloat ();
	    if (precio < 50)
	    {
		menores++;
	    }
	    if (precio >= 50 && precio <= 100)
	    {
		entre++;
	    }
	    if (precio > 100)
	    {
		mayores++;
	    }
	    i++;
	}
	c.println ("La cantidad de productos menores a $50 es: " + menores);
	c.println ("La cantidad de productos entre $50 y $100 es: " + entre);
	c.println ("La cantidad de productos mayores a $100 es: " + mayores);
    }
}
