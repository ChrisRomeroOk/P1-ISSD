import hsa.Console;
import java.awt.*;
class Parcial2
{
    static Console c;
    int[] codigo, genero, cantidad, reservados;      // Declaro los vectores.
    String[] descripcion;
    Parcial2 ()                                      // Agrego el nombre de la clase para que el metodo sea constructivo.
    {

	c.setTextColor (Color.black);
	c.print ("Ingrese la cantidad de libros: ");
	c.setTextColor (Color.gray);
	int n = c.readInt ();                   // Cargo en n' la cantidad de libros.
	descripcion = new String [n];
	genero = new int [n];
	codigo = new int [n];                        //Cargo en todos los vectores n'.
	cantidad = new int [n];
	reservados = new int [n];
    }


    void cargaDatos ()                             // Metodo para cargar datos.
    {
	c.clear ();
	c.setTextColor (Color.black);
	c.println ("Cargue los datos de los libros");
	c.println ("---------------------------------");
	c.println ();
	for (int i = 0 ; i < codigo.length ; i++)
	{
	    c.setTextColor (Color.black);
	    c.print ("Ingrese el codigo del libro [" + (i + 1) + "]: ");
	    c.setTextColor (Color.black);
	    codigo [i] = c.readInt ();
	    c.setTextColor (Color.black);
	    c.print ("Ingrese nombre del libro: ");
	    c.setTextColor (Color.black);
	    descripcion [i] = c.readLine ();
	    c.setTextColor (Color.black);
	    c.println ("Genero:");
	    c.println ("1-Aventura, 2-Ficcion, 3-Infantil");
	    c.print ("Ingrese el genero del libro: ");
	    c.setTextColor (Color.black);
	    genero [i] = c.readInt ();
	    c.setTextColor (Color.black);
	    c.print ("Cuantas copias posee?: ");
	    c.setTextColor (Color.black);
	    cantidad [i] = c.readInt ();
	    c.setTextColor (Color.black);
	    c.print ("Cuantos de ellos estan reservados?: ");
	    c.setTextColor (Color.black);
	    reservados [i] = c.readInt ();
	    c.println ();
	}
    }


    void ordenarPorDescripcion ()                             // Metodo para ordenar por descripcion.
    {
	c.setTextColor (Color.black);
	int n = descripcion.length;                           // Declaro las variables a usar.
	String auxDescripcion;
	int auxCodigo, auxGenero, auxCantidad, auxReservados;
	for (int k = 1 ; k < n ; k++)                         // Genero un primer for y la inicialiso enn 1'
	{
	    for (int i = 0 ; i < n - k ; i++)                 // Genero un segundo for para que pueda comparar le resto k' a i'.
	    {
		if (descripcion [i].compareTo (descripcion [i + 1]) > 0) // Uso la declaracion 'compareTo' dentro del if'.
		{
		    auxDescripcion = descripcion [i];
		    descripcion [i] = descripcion [i + 1];
		    descripcion [i + 1] = auxDescripcion;

		    auxCodigo = codigo [i];
		    codigo [i] = codigo [i + 1];
		    codigo [i + 1] = auxCodigo;

		    auxGenero = genero [i];
		    genero [i] = genero [i + 1];
		    genero [i + 1] = auxGenero;

		    auxCantidad = cantidad [i];
		    cantidad [i] = cantidad [i + 1];
		    cantidad [i + 1] = auxCantidad;

		    auxReservados = reservados [i];
		    reservados [i] = reservados [i + 1];
		    reservados [i + 1] = auxReservados;
		}
	    }
	}
    }


    void imprimir ()                             // Metodo para imprimr los titulos.
    {
	int fila = 5;
	c.setTextColor (Color.black);
	c.setCursor (3, 5);
	c.print ("Codigo");
	c.setCursor (4, 5);
	c.print ("------");
	c.setCursor (3, 20);
	c.print ("Descripcion");
	c.setCursor (4, 20);
	c.print ("-----------");
	c.setCursor (3, 35);
	c.print ("Genero");
	c.setCursor (4, 35);
	c.print ("------");
	c.setCursor (3, 50);
	c.print ("Cantidad");
	c.setCursor (4, 50);
	c.print ("--------");
	c.setCursor (3, 60);
	c.print ("Reservadas");
	c.setCursor (4, 60);
	c.print ("----------");
	for (int i = 0 ; i < codigo.length ; i++) // Uso un if' para determinar el genero de la pelicula
	{
	    c.setCursor (fila, 5);
	    c.print (codigo [i]);
	    c.setCursor (fila, 20);
	    c.print (descripcion [i]);
	    c.setCursor (fila, 35);
	    if (genero [i] == 1)
	    {
		c.print ("Aventura");
	    }
	    if (genero [i] == 2)
	    {
		c.print ("Ficcion");
	    }
	    if (genero [i] == 3)
	    {
		c.print ("Infantil");
	    }
	    c.setCursor (fila, 50);
	    c.print (cantidad [i]);
	    c.setCursor (fila, 60);
	    c.print (reservados [i]);
	    fila++;
	}
	c.println ();
	c.println ();

	c.setTextColor (Color.red);
	c.print (" Digite [Enter] para retornar al Menu ");
	c.readChar ();
    }


    void consultaPorDescripcion ()                     // Metodo para consultar por descripcion.
    {
	c.setTextColor (Color.black);
	String descripcionABuscar;                     // Declaro las variables a utilizar.
	char opcion;
	do                                             // Genero un do' while' para que se pueda hacer mas de una consulta.
	{
	    c.clear ();
	    c.setCursor (3, 10);
	    c.print ("Consulta por descripcion");
	    c.setCursor (4, 10);
	    c.print ("------------------------");
	    c.setCursor (6, 10);
	    c.print ("Ingrese la descripcion que desea buscar: ");
	    c.setTextColor (Color.black);
	    descripcionABuscar = c.readLine ();
	    int posicion = -1;
	    c.setTextColor (Color.black);
	    for (int i = 0 ; i < descripcion.length ; i++)                  // Genero un for para recorrer el vector descripcion.
	    {
		if (descripcionABuscar.equalsIgnoreCase (descripcion [i]))  // Uso dentro del if' la funcion equalsIgnoreCase para comparar.
		{
		    posicion = i;                          // Determino la posicion.
		}
	    }
	    if (posicion != -1)                            // Pregunto si posicion es diferente de 1 ya que los vectores comienzan en cero
	    {
		c.setCursor (8, 10);
		c.print ("Descripcion: ");
		c.print (descripcion [posicion]);          // Aqui muestro la posicion de i'
		c.setCursor (9, 10);
		c.print ("Genero: ");
		if (genero [posicion] == 1)
		{
		    c.print ("Aventura");
		}
		if (genero [posicion] == 2)
		{
		    c.print ("Ficcion");
		}
		if (genero [posicion] == 3)
		{
		    c.print ("Infantil");
		}
		c.setCursor (10, 10);
		c.print ("Cantidad: ");
		c.print (cantidad [posicion]);            // Aqui muestro la cantidad de libros para la misma posicion.
		c.setCursor (11, 10);
		c.print ("Reservados: ");
		c.print (reservados [posicion]);          // Aqui muestro la cantidad de libros reservados para la misma posicion.
		c.setCursor (12, 10);
	    }
	    else
	    {
		c.setTextColor (Color.red);
		c.setCursor (9, 10);
		c.print ("No existe ese codigo");        // Si el codigo no existe muestro este mensaje.
	    }
	    c.setTextColor (Color.black);
	    c.setCursor (20, 10);
	    c.print ("Realiza otra consulta? (s/n): "); // Pregunto si desea hacer otra consulta.
	    opcion = c.readChar ();                     // Cargo la respuesta en opcion.
	}
	while (opcion == 's' || opcion == 'S');         // Si es igual a s' continua si no, no.
    }


    void totalReservados ()                             // Metodo para cargar libros reservados.
    {
	c.clear ();
	int totalReservados = 0;                        // Declaro la variable a usar y la pongo en cero.
	for (int i = 0 ; i < reservados.length ; i++)   // Recorro el vector de reservados con este for.
	{
	    totalReservados = totalReservados + reservados [i];                        // Cuento y sumo la cantidad de libros reservados.
	}
	c.setTextColor (Color.black);
	c.setCursor (5, 10);
	c.print ("La cantidad total de libros reservados es de: " + totalReservados);  // Muestro resultado
	c.println ();
	c.println ();
	c.setTextColor (Color.red);
	c.setCursor (12, 5);
	c.print (" Digite [Enter] para retornar al Menu ");
	c.readChar ();
    }


    void imprimirMayorReservados ()                           // Metodo para mostrar que genero es el mas reservado.
    {
	int aventura, ficcion, infantil;
	aventura = ficcion = infantil = 0;
	for (int i = 0 ; i < reservados.length ; i++)
	{
	    if (genero [i] == 1)
	    {
		aventura = aventura + reservados [i];
	    }
	    if (genero [i] == 2)
	    {
		ficcion = ficcion + reservados [i];
	    }
	    if (genero [i] == 3)
	    {
		infantil = infantil + reservados [i];
	    }
	}
	c.setTextColor (Color.black);
	if (aventura > ficcion && aventura > infantil)
	{
	    c.setCursor (5, 10);
	    c.print ("El genero con mayor reserva es el de aventura");
	    c.setCursor (7, 10);
	    c.print ("Tienen reservados " + aventura + " libros");
	}
	if (ficcion > aventura && ficcion > infantil)
	{
	    c.setCursor (5, 10);
	    c.print ("El genero con mayor reserva es el de ficcion");
	    c.setCursor (7, 10);
	    c.print ("Tienen reservados " + ficcion + " libros");
	}
	if (infantil > aventura && infantil > ficcion)
	{
	    c.setCursor (5, 10);
	    c.print ("El genero con mayor reserva es el infantil");
	    c.setCursor (7, 10);
	    c.print ("Tienen reservados " + infantil + " libros");
	}
	c.println ();
	c.println ();
	c.setTextColor (Color.red);
	c.setCursor (12, 5);
	c.print (" Digite [Enter] para retornar al Menu ");
	c.readChar ();
    }


    void mensaje ()                                            // Metodopara mostrar que cargo mal  o inexistente un dato.
    {
	c.clear ();
	c.setTextColor (Color.red);
	c.setCursor (10, 15);
	c.print ("FALTAN CARGAR LOS DATOS DE LOS LIBROS");
	c.setCursor (14, 15);
	c.print ("Presione [Enter] para regresar al menu ");
	c.readChar ();
    }


    public static void main (String arg[])                    // Programa principal
    {
	c = new Console ();
	Parcial2 e = new Parcial2 ();                         // Inicialiso parcial2
	int opcion;
	c.setTextBackgroundColor (Color.green);
	int bandera = 0;
	do                                                    // Genero un do' while' para recorrer el menu.
	{
	    c.clear ();
	    c.setTextColor (Color.black);
	    c.setCursor (3, 5);
	    c.print ("Menu de opciones");
	    c.setCursor (4, 5);
	    c.print ("----------------");
	    c.setCursor (5, 5);
	    c.print ("1- Cargar datos");
	    c.setCursor (6, 5);
	    c.print ("2- Mostrar un listado de libros ordenados por descripcion");
	    c.setCursor (7, 5);
	    c.print ("3- Realizar una consulta por descripcion");
	    c.setCursor (8, 5);
	    c.print ("4- Mostrar la cantidad de libros reservados de toda la libreria");
	    c.setCursor (9, 5);
	    c.print ("5- Mostrar el genero con mayor reserva");
	    c.setCursor (10, 5);
	    c.print ("6- Finalizar el programa");
	    c.setCursor (12, 5);
	    c.print ("Digite la opcion: ");
	    c.setTextColor (Color.gray);
	    opcion = c.readInt ();
	    switch (opcion)                                 // Genero un switch case para poder seleccionar un tema del menu.
	    {
		case 1:
		    e.cargaDatos ();
		    bandera = 1;
		    break;
		case 2:
		    if (bandera == 0)
			e.mensaje ();
		    else
		    {
			c.clear ();
			e.ordenarPorDescripcion ();
			e.imprimir ();
		    }
		    break;
		case 3:
		    if (bandera == 0)
			e.mensaje ();
		    else
		    {
			c.clear ();
			e.consultaPorDescripcion ();
		    }
		    break;
		case 4:
		    if (bandera == 0)
			e.mensaje ();
		    else
		    {
			c.clear ();
			e.totalReservados ();
		    }
		    break;
		case 5:
		    if (bandera == 0)
			e.mensaje ();
		    else
		    {
			c.clear ();
			e.imprimirMayorReservados ();
		    }
		    break;
	    }
	}
	while (opcion != 6);
	System.exit (0);             // Este es el fin.
    }
}
