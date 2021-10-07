//Cargar en un vector los nombres de 5 paises y en otro vector paralelo
//la cantidad de habitantes del mismo. Ordenar alfabticamente
//e imprimir los resultados. Por ultimo ordenar con respecto a la
//cantidad de habitantes (de mayor a menor) e imprimir nuevamente.

import hsa.Console;

public class PaisesHabitantes
{
    static Console c;

    int[] habitantes = new int [5];
    String[] paises = new String [5];

    void carga ()
    {

	for (int f = 0 ; f < paises.length ; f++)
	{
	    c.print ("Ingrese el pais: ");
	    paises [f] = c.readLine ();
	    c.print ("Ingrese la cantidad de habitantes: ");
	    habitantes [f] = c.readInt ();
	}
    }


    void ordenarAlfa ()
    {
	for (int k = 0 ; k < 4 ; k++)
	{
	    for (int f = 0 ; f < 4 ; f++)
	    {
		if (paises [f].compareTo (paises [f + 1]) > 0)
		{
		    String aux1 = paises [f];
		    paises [f] = paises [f + 1];
		    paises [f + 1] = aux1;
		    int aux2 = habitantes [f];
		    habitantes [f] = habitantes [f + 1];
		    habitantes [f + 1] = aux2;
		}
	    }
	}

    }


    void ordenarHabitantes ()
    {
	for (int k = 0 ; k < 4 ; k++)
	{
	    for (int f = 0 ; f < 4 ; f++)
	    {
		if (habitantes [f] < habitantes [f + 1])
		{
		    String aux1 = paises [f];
		    paises [f] = paises [f + 1];
		    paises [f + 1] = aux1;
		    int aux2 = habitantes [f];
		    habitantes [f] = habitantes [f + 1];
		    habitantes [f + 1] = aux2;
		}
	    }
	}

    }


    void imprimir ()
    {
	c.println ();
	c.println ("**********************************");
	c.println ("Listado de paises y habitantes");
	c.println ("**********************************");
	for (int f = 0 ; f < paises.length ; f++)
	{
	    c.println (paises [f] + "     " + habitantes [f]);
	}
	c.println ("**********************************");
    }


    public static void main (String[] args)
    {
	c = new Console ();
	PaisesHabitantes p = new PaisesHabitantes ();
	p.carga ();
	p.ordenarAlfa ();
	p.imprimir ();
	p.ordenarHabitantes ();
	p.imprimir ();
    }
}
