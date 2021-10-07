import hsa.Console;

public class Desempeno45
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	int clientes, superiores, suma, deposito, promedio;
	deposito = 0;
	clientes = 0;
	superiores = 0;
	suma = 0;

	while (deposito >=0)
	{
	    c.println ("Numero de cuenta: ****");
	    c.print ("Ingrese el monto a depositar: $");
	    deposito = c.readInt ();
	    clientes++;
	    if (deposito > 2000)
	    {
		superiores++;
	    }
	    suma = suma += deposito;
	}
	promedio = suma / clientes;
	c.println();
	c.println ("Cantidad de clientes procesados: " + clientes);
	c.println ("Cantidad de clientes con depositos superiores a $2000: " + superiores);
	c.println ("Total de todos los depositos ingresados: " + suma);
	c.println ("Promedio de todos los depositos ingresados: " + promedio);
    }
}
