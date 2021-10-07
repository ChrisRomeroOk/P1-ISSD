/*1-carga de alumnos y dos parciales.
2- calcular el promedio por alumno y guardarlo en otro vector.
3- imprimir los nombres de los alumnos al menos una nota menor a 4.
4- consulta de promedio ingresando el nombre del alumno. Si no marcar error.
5- ordenar los promedios de menor a mayor. y mostrar en pantalla.
6- ordenar los nombres alfabeticamente. y mostrar en pantalla.*/


import hsa.Console;

public class PromedioAlumnos
{
    static Console c;
    String[] alumnos = new String [3];
    int[] parcial1 = new int [3];
    int[] parcial2 = new int [3];
    int[] promedio = new int [3];

    void cargar ()
    {
	for (int f = 0 ; f < alumnos.length ; f++)
	{
	    c.print ("Ingrese el nombre del alumno: ");
	    alumnos [f] = c.readLine ();
	    c.print ("Ingrese la nota del primer parcial: ");
	    parcial1 [f] = c.readInt ();
	    c.print ("Ingrese la nota del segundo parcial: ");
	    parcial2 [f] = c.readInt ();
	}
    }


    void sacarPromedio ()
    {
	for (int f = 0 ; f < alumnos.length ; f++)
	{
	    promedio [f] = (parcial1 [f] + parcial2 [f]) / 2;
	    c.println ("Promedio del alumno " + alumnos [f] + ": " + promedio [f]);
	}

    }


    void notasMenorA4 ()
    {
	c.println ();
	c.print ("Alumnos con alguna nota menor a 4: ");
	for (int f = 0 ; f < alumnos.length ; f++)
	{
	    if (parcial1 [f] < 4 || parcial2 [f] < 4)
	    {
		c.println (alumnos [f] + " - ");
	    }
	}
    }


    void ConsultaPorNombre ()
    {
	String aux;
	c.println ("Ingrese el nombre del alumno a buscar: ");
	aux = c.readLine ();
	int existe = 0;
	for (int f = 0 ; f < alumnos.length ; f++)
	{
	    if (aux.equals (alumnos [f]))
	    {
		c.println ("El promedio del alumno " + alumnos [f] + " es: " + promedio [f]);
		existe = 1;
	    }
	}
	if (existe == 0)
	{
	    c.println ("No se encuentran coincidencias.");
	}
    }


    void promedioMenorAMayor ()
    {
	c.println ("De menor a mayor");
	for (int k = 0 ; k < 2 ; k++)
	{
	    for (int f = 0 ; f < 2 ; f++)
	    {
		if (promedio [f] > promedio [f + 1])
		{
		    int aux1 = promedio [f];
		    promedio [f] = promedio [f + 1];
		    promedio [f + 1] = aux1;
		    String aux2 = alumnos [f];
		    alumnos [f] = alumnos [f + 1];
		    alumnos [f + 1] = aux2;
		    int aux3 = parcial1 [f];
		    parcial1 [f] = parcial1 [f + 1];
		    parcial1 [f + 1] = aux3;
		    int aux4 = parcial2 [f];
		    parcial2 [f] = parcial2 [f + 1];
		    parcial2 [f + 1] = aux4;

		}
	    }
	}
    }


    void nombresAlfa ()
    {
	c.println ("Ordenado alfabeticamente");
	for (int k = 0 ; k < 2 ; k++)
	{
	    for (int f = 0 ; f < 2 ; f++)
	    {
		if (alumnos [f].compareTo (alumnos [f + 1]) > 0)
		{
		    int aux1 = promedio [f];
		    promedio [f] = promedio [f + 1];
		    promedio [f + 1] = aux1;
		    String aux2 = alumnos [f];
		    alumnos [f] = alumnos [f + 1];
		    alumnos [f + 1] = aux2;
		    int aux3 = parcial1 [f];
		    parcial1 [f] = parcial1 [f + 1];
		    parcial1 [f + 1] = aux3;
		    int aux4 = parcial2 [f];
		    parcial2 [f] = parcial2 [f + 1];
		    parcial2 [f + 1] = aux4;

		}
	    }
	}
    }


    void imprimir ()
    {
	c.println ("Listado de alumnos ");
	for (int f = 0 ; f < alumnos.length ; f++)
	{
	    c.println (alumnos [f] + " - " + parcial1 [f] + " - " + parcial2 [f] + " - " + promedio [f]);
	}
    }


    public static void main (String[] args)
    {
	c = new Console ();
	PromedioAlumnos p = new PromedioAlumnos ();
	p.cargar ();
	p.sacarPromedio ();
	p.notasMenorA4 ();
	p.ConsultaPorNombre ();
	p.promedioMenorAMayor ();
	p.imprimir ();
	p.nombresAlfa ();
	p.imprimir ();


    }
}
