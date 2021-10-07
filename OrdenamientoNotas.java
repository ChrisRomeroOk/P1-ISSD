//ingresa 5 nombre y notas y ordena de mayor a menor
import hsa.Console;

public class OrdenamientoNotas
{
    static Console c;

    String[] nombres = new String [5];
    int[] notas = new int [5];

    void cargar ()
    {
	for (int f = 0 ; f < nombres.length ; f++)
	{
	    c.print ("Ingrese el nombre del alumno: ");
	    nombres [f] = c.readLine ();
	    c.print ("Ingrese la nota del alumno: ");
	    notas [f] = c.readInt ();
	}
    }


    void OrdenarNotas ()
    {
	for (int k = 0 ; k < 4 ; k++)
	{
	    for (int f = 0 ; f < 4 ; f++)
	    {
		if (notas [f] < notas [f + 1]) //si cambias el signo ordena de menor a mayor
		{
		    int aux1 = notas [f]; //ordena notas mayor a menor
		    notas [f] = notas [f + 1];
		    notas [f + 1] = aux1;
		    String aux2 = nombres [f]; //ordena nombres paralelamente
		    nombres [f] = nombres [f + 1];
		    nombres [f + 1] = aux2;
		}
	    }
	}
    }


    void imprimir () 
    {
	c.println ("Listado de Alumnos");
	for (int f = 0 ; f < nombres.length ; f++)
	{
	    c.println (nombres [f] + "   " + notas [f]);
	}
	c.println ("*************************************");
    }


    public static void main (String[] args)
    {
	c = new Console ();
	OrdenamientoNotas ord = new OrdenamientoNotas ();
	ord.cargar ();
	ord.imprimir ();
	ord.OrdenarNotas ();
	ord.imprimir ();
    }
}
