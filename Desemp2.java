import hsa.Console;

public class Desemp2
{
    static Console c;

    int[] codigoLibro = new int [3];
    String[] descripcion = new String [3];
    int[] genero = new int [3];
    int[] cantUnidades = new int [3];
    int[] cantReservados = new int [3];

    void cargar ()
    {
	for (int f = 0 ; f < descripcion.length ; f++)
	{
	    c.print ("Ingrese el codigo del libro: ");
	    codigoLibro [f] = c.readInt ();
	    c.print ("Ingrese descripcion: ");
	    descripcion [f] = c.readLine ();
	    c.print ("Ingrese genero: ");
	    genero [f] = c.readInt ();
	    c.print ("Ingrese cantidad de unidades: ");
	    cantUnidades [f] = c.readInt ();
	    c.print ("Ingrese cantidad de reservados: ");
	    cantReservados [f] = c.readInt ();
	}
    }


    void totalLibros ()
    {
	int suma = 0;
	for (int f = 0 ; f < cantReservados [f] ; f++)
	{
	    suma = suma + cantReservados [f];
	}
	c.println ("Cantidad de libros reservados de toda la libreria: " + suma);
    }


    void ordenarPorDesc ()
    {
	c.println ();
	c.println ("Ordenado por Descripcion");

	for (int k = 0 ; k < 2 ; k++)
	{
	    for (int f = 0 ; f < 2 ; f++)
	    {
		if (descripcion [f].compareTo (descripcion [f + 1]) > 0)
		{
		    String aux1 = descripcion [f];
		    descripcion [f] = descripcion [f + 1];
		    descripcion [f + 1] = aux1;
		    int aux2 = codigoLibro [f];
		    codigoLibro [f] = codigoLibro [f + 1];
		    codigoLibro [f + 1] = aux2;
		    int aux3 = genero [f];
		    genero [f] = genero [f + 1];
		    genero [f + 1] = aux3;
		    int aux4 = cantUnidades [f];
		    cantUnidades [f] = cantUnidades [f + 1];
		    cantUnidades [f + 1] = aux4;
		    int aux5 = cantReservados [f];
		    cantReservados [f] = cantReservados [f + 1];
		    cantReservados [f + 1] = aux5;

		}
	    }
	}
    }


    void ConsultaPorDesc ()
    {
	String aux;
	c.println ("Ingrese la descripcion a buscar: ");
	aux = c.readLine ();
	int existe = 0;
	for (int f = 0 ; f < descripcion.length ; f++)
	{
	    if (aux.equals (descripcion [f]))
	    {
		c.println ("La descripcion " + descripcion [f] + " esta disponible.");
		existe = 1;
	    }
	}
	if (existe == 0)
	{
	    c.println ("No se encuentran coincidencias.");
	}
    }




    void reservaMayor ()
    {
	int pos = 0;
	c.println ("Genero con mayor cantidad de reservas: ");
	for (int i = 1 ; i < cantReservados.length ; i++)
	{
	    if (cantReservados [i] > cantReservados [pos])
	    {
		pos = i;
	    }
	}
	c.print (cantReservados [pos]);
    }




    void imprimir ()
    {
	c.println ("Codigo libro - descripcion - genero - cant de unidades - cant reservados");
	for (int f = 0 ; f < descripcion.length ; f++)
	{
	    c.println (codigoLibro [f] + " - " + descripcion [f] + " - " + genero [f] + " - " + cantUnidades [f] + " - " + cantReservados [f]);
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	Desemp2 p = new Desemp2 ();
	p.cargar ();
	p.ordenarPorDesc ();
	p.imprimir ();
	p.ConsultaPorDesc ();
	p.totalLibros ();
	p.reservaMayor ();


    }
}


