import hsa.Console;

public class DesempClase9
{
    static Console c;           // The output console
    String alumnos[];
    int legajo[];
    int anio[];
    int n;
    int ANIOACTUAL = 2021;


    DesempClase9 ()
    {
	c.print ("Ingrese la cantidad de datos a procesar: ");
	n = c.readInt ();
	c.println ();
	alumnos = new String [n];
	legajo = new int [n];
	anio = new int [n];
    }


    //MENU DE BUSQUEDA DE ALUMNOS
    void menu ()
    {
	int response = 0;

	c.println ("1. Buscar  Alumnos por nombre");
	c.println ("2. Buscar  Alumnos por anio");
	c.println ("0. Salir");
	c.print ("Elija una opcion: ");
	response = c.readInt ();

	do
	{
	    switch (response)
	    {
		case 1:
		    consulta ();
		    break;
		case 2:
		    response = 0;
		    consultaAnio ();
		    break;
		case 0:
		    c.println ("Gracias por su visita.");
		    System.exit (0);
		    break;
		default:
		    c.println ("Elija una de las opciones anteriores.");
	    }
	}
	while (response != 0);

    }


    //CARGA DE DATOS DE ALUMNOS
    void cargaDatos ()
    {
	c.println ("Cargue los datos del alumno: ");
	c.println ();
	char opcion;
	do
	{
	    for (int i = 0 ; i < n ; i++)
	    {
		c.print ("Ingrese Alumno [" + (i + 1) + "]: ");
		alumnos [i] = c.readLine ();

		c.print ("Ingrese nro. de legajo del alumno [" + (i + 1) + "]: ");
		legajo [i] = c.readInt ();

		c.print ("Ingrese anio de naciemiento [" + (i + 1) + "]: ");
		anio [i] = c.readInt ();
		c.println ();
	    }
	    c.print ("Desea continuar cargando datos (S/N)?: ");
	    opcion = c.readChar ();
	}
	while (opcion == 'S' || opcion == 's');


	//IR MENU DE CONSULTA
	int response = 0;
	c.println ("1. Ir a menu de consulta");
	c.println ("0. Para salir.");
	c.print ("Elija una opcion: ");
	response = c.readInt ();

	do
	{
	    switch (response)
	    {
		case 1:
		    menu ();
		    break;
		case 0:
		    c.println ("Gracias por su visita.");
		    System.exit (0);
		    break;
		default:

		    response = 0;
		    c.println ("Elija una de las opciones anteriores.");
		    break;

	    }
	}
	while (response != 0);

    }


    // MAYOR VALOR - EDAD
    int mayor (int[] anio)
    {
	int m = anio [0];
	int p = 0;

	for (int i = 1 ; i < anio.length ; i++)

	    {
		if (anio [i] < m)
		{
		    m = anio [i];
		    p = i;
		}

	    }
	return p;
    }


    //CONSULTA - BUSQUEDA DE ALUMNOS POR NOMBRE
    void consulta ()
    {
	int posicion;
	String alumAux;
	int legajoAux;
	char opcion;

	do
	{
	    c.clear ();
	    c.println ("Consultas datos alumnos");
	    c.println ("----------------------");
	    posicion = -1;
	    legajoAux = 0;
	    c.println ();
	    c.print ("Ingrese  el Nombre del Alumno que desea buscar: ");
	    alumAux = c.readLine ();

	    for (int i = 0 ; i < alumnos.length ; i++)
	    {
		if (alumAux.equalsIgnoreCase (alumnos [i]))
		{
		    posicion = i;
		    legajoAux = i;
		}
	    }
	    if (posicion != -1)
	    {
		c.print ("El alumno buscado es: ");
		c.println (alumnos [posicion] + " legajo nro. " + legajo [legajoAux]);

	    }
	    else
	    {
		c.println ("El Alumno ingresado no existe, vuelva a intentarlo.");
	    }
	    c.println ();
	    c.print ("Desea realizar otra consulta (S/N): ");
	    opcion = c.readChar ();
	}

	while (opcion == 'S' || opcion == 's');


	//IR A MENU DE CONSULTA O SALIR
	int response = 0;
	c.println ("1. Ir a menu de consulta");
	c.println ("0. Para salir");
	c.print ("Elija una opcion: ");
	response = c.readInt ();

	do
	{
	    switch (response)
	    {
		case 1:
		    menu ();
		    break;
		case 0:
		    c.println ("Gracias por su visita.");
		    System.exit (0);
		    break;
		default:
		    response = 0;
		    c.println ("Elija una de las opciones anteriores.");
	    }
	}
	while (response != 0);
    }


    //CONSULTA BUSQUEDA DE ALUMNOS POR AÑO
    void consultaAnio ()
    {
	int anioAux1;
	int anioAux2;
	char opcion;
	int p = mayor (anio);
	int edadM = 0;
	do
	{
	    c.clear ();
	    c.println ("Consulta datos alumnos por anio de nacimiento");
	    c.println ("----------------------");
	    c.println ();
	    c.print ("Ingrese  anio 1: ");
	    anioAux1 = c.readInt ();
	    c.print ("Ingrese  anio 2: ");
	    anioAux2 = c.readInt ();

	    for (int i = 0 ; i < anio.length ; i++)
	    {
		if (anio [i] >= anioAux1 && anio [i] <= anioAux2)
		{

		    edadM = ANIOACTUAL - anio [i];
		    c.print ("Resultado busqueda alumnos: ");
		    c.println (alumnos [i] + " legajo nro. " + legajo [i] + " - " + anio [i] + " - edad: " + edadM + " anios");
		}
		else
		{
		    c.println ("Para los anios ingresados no hay registro, vuelva a intentarlo.");
		}
	    }

	    if (edadM == 0)
	    {
		edadM = ANIOACTUAL - anio [p];
	    }
	    c.println ();
	    c.print ("El alumno de mayor edad es: " + anio [p] + " - " + alumnos [p] + " - edad: " + edadM + " anios");
	    c.println ();
	    c.print ("Desea realizar otra consulta (s/n): ");
	    opcion = c.readChar ();
	}

	while (opcion == 'S' || opcion == 's');

    }


    public static void main (String[] args)
    {
	c = new Console ();
	DesempClase9 e = new DesempClase9 ();
	e.cargaDatos ();
	e.menu ();
    }
}


/*Cargar tres vectores que contengan legajo,
nombre del alumno y año de nacimiento.
Realizar una consulta por nombre y determinar
 cuál es el alumno de mayor edad.
Ingresar dos fechas (sólo el año) y mostrar todos los alumnos que
 nacieron entre esos años.
*/
