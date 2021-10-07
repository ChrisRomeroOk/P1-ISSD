import hsa.Console;

public class Desempeno80
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	float[] Productos = new float [30];
	for (int f = 0 ; f < Productos.length ; f++)
	{
	    c.print ("Ingrese el precio del producto: ");
	    Productos [f] = c.readFloat ();
	}
	float suma = 0;
	int menor = 0, entre = 0, mayor = 0;
	for (int f = 0 ; f < Productos.length ; f++)
	{
	    suma = suma + Productos [f];
	    if (Productos [f] < 100)
	    {
		menor++;
	    }
	    if (Productos [f] >= 100 && Productos [f] <= 200)
	    {
		entre++;
	    }
	    if (Productos [f] > 200)
	    {
		mayor++;
	    }
	}
	c.println ("Cantidad de productos menores a $100: " + menor);
	c.println ("Cantidad de productos entre $100 y $200: " + entre);
	c.println ("Cantidad de productos mayores a S200: " + mayor);
	c.println ("Importe total: $" + suma);
    }
}


