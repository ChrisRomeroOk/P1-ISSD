import hsa.Console;
import java.awt.*;
class Ejemplo48
{
    static Console c;
    String[] descripcion;
    float[] precio;
    String[] procedencia;
    Ejemplo48 ()
    {
	c.print ("Ingrese la cantidad de productos: ");
	int n = c.readInt ();
	descripcion = new String [n];
	precio = new float [n];
	procedencia = new String [n];
    }


    void cargarDatos ()
    {
	c.clear ();
	c.println ("Cargue los Productos");
	c.println ();





	for (int i = 0 ; i < descripcion.length ; i++)
	{
	    c.print ("Ingrese descripcion[" + (i + 1) + "]: ");
	    descripcion [i] = c.readLine ();
	    c.print ("Ingrese su precio unitario: ");
	    precio [i] = c.readFloat ();
	    c.print ("Ingrese su procedencia: ");
	    procedencia [i] = c.readLine ();
	    c.println ();
	}
    }


    void imprimir ()
    {
	int fila;
	c.setCursor (3, 10);
	c.print ("Descripcion");
	c.setCursor (4, 10);
	c.print ("-----------");
	c.setCursor (3, 30);
	c.print ("Precio");
	c.setCursor (4, 30);
	c.print ("------");
	c.setCursor (3, 45);
	c.print ("Procedencia");
	c.setCursor (4, 45);
	c.print ("-----------");

	fila = 5;
	for (int i = 0 ; i < descripcion.length ; i++)
	{
	    c.setCursor (fila, 10);
	    c.print (descripcion [i]);
	    c.setCursor (fila, 30);
	    c.print (precio [i], 8, 2);
	    c.setCursor (fila, 45);
	    c.print (procedencia [i]);
	    fila++;
	}


	c.println ();
	c.println ();
	c.setTextColor (Color.red);
	c.print (" Digite [Enter] para retornar al Menu ");
	c.readChar ();

    }


    void consultasPorDescripcion ()
    {
	String dx;
	char op;
	do
	{
	    c.clear ();
	    c.setCursor (3, 10);
	    c.print ("Consultas por Descripcion");
	    c.setCursor (4, 10);
	    c.print ("-------------------------");
	    c.setCursor (6, 10);
	    c.print ("Ingrese Descripcion de Producto a buscar:  ");
	    dx = c.readLine ();
	    int posi = -1;
	    for (int i = 0 ; i < descripcion.length ; i++)
	    {
		if (dx.equalsIgnoreCase (descripcion [i]))
		{
		    posi = i;
		}
	    }
	    if (posi != -1)
	    {
		c.setCursor (8, 10);
		c.print ("Precio Unitario: $ ");
		c.print (precio [posi], 0, 2);
		c.setCursor (9, 10);
		c.print ("Procedencia: ");
		c.print (procedencia [posi]);
	    }
	    else
	    {
		c.setCursor (9, 10);
		c.print ("No existe esa Descripcion");
	    }
	    c.setCursor (20, 10);
	    c.print ("Realiza otra consulta: ");
	    op = c.readChar ();
	}


	while (op == 's' || op == 'S');
    }


    void productoDeMenorPrecio ()
    {
	float menorPrecio = precio [0];
	int posi = 0;
	for (int i = 1 ; i < precio.length ; i++)
	{
	    if (precio [i] < menorPrecio)
	    {
		menorPrecio = precio [i];
		posi = i;
	    }
	}


	c.clear ();
	c.setCursor (5, 10);
	c.print ("Los datos del producto de menor Precio son: ");
	c.setCursor (7, 10);
	c.print ("Descripcion: ");
	c.print (descripcion [posi]);
	c.setCursor (8, 10);
	c.print ("Precio Unitario: $ ");
	c.print (precio [posi], 0, 2);
	c.setCursor (9, 10);
	c.print ("Procedencia: ");
	c.print (procedencia [posi]);
	c.setCursor (20, 10);
	c.setTextColor (Color.red);
	c.print (" Digite [Enter] para retornar al Menu ");
	c.readChar ();
    }


    void consultasPorProcedencia ()
    {
	String px;
	char op;
	do
	{
	    c.clear ();
	    c.setCursor (3, 10);
	    c.print ("Consultas por Procedencia");
	    c.setCursor (4, 10);
	    c.print ("-------------------------");
	    c.setCursor (6, 10);
	    c.print ("Ingrese Procedencia a buscar:  ");
	    px = c.readLine ();
	    int fila = 10;

	    for (int i = 0 ; i < descripcion.length ; i++)
	    {
		if (px.equalsIgnoreCase (procedencia [i]))
		{
		    c.setCursor (8, 10);
		    c.print ("Descripcion");
		    c.setCursor (9, 10);
		    c.print ("-----------");
		    c.setCursor (8, 30);
		    c.print ("Precio");
		    c.setCursor (9, 30);
		    c.print ("------");
		    c.setCursor (fila, 10);
		    c.print (descripcion [i]);
		    c.setCursor (fila, 30);
		    c.print (precio [i], 8, 2);
		    fila++;
		}
	    }

	    if (fila == 10)
	    {
		c.setCursor (9, 10);
		c.print ("No existe esa procedencia");
	    }

	    c.println ();
	    c.println ();
	    c.print ("Realiza otra consulta: ");
	    op = c.readChar ();
	}

	while (op == 's' || op == 'S');
    }


    void mensaje ()
    {
	c.clear ();
	c.setTextColor (Color.red);
	c.setCursor (10, 15);
	c.print ("Faltan cargar los productos");
	c.setCursor (14, 15);
	c.print ("Digite [Enter para Menu]...");
	c.readChar ();
    }


    public static void main (String arg[])
    {
	c = new Console ();
	Ejemplo48 e = new Ejemplo48 ();
	int op;
	c.setTextBackgroundColor (Color.yellow);
	int bandera = 0;
	do
	{
	    c.clear ();
	    c.setTextColor (Color.blue);
	    c.setCursor (3, 10);
	    c.print ("Menu de Opciones");
	    c.setCursor (4, 10);
	    c.print ("----------------");
	    c.setCursor (5, 10);
	    c.print ("1- Cargar Datos");
	    c.setCursor (6, 10);
	    c.print ("2- Listado Completo");
	    c.setCursor (7, 10);
	    c.print ("3- Consultas por descripcion");
	    c.setCursor (8, 10);
	    c.print ("4- Datos del Producto de menor Precio ");
	    c.setCursor (9, 10);
	    c.print ("5- Consultas por Procedencia");
	    c.setCursor (10, 10);
	    c.print ("6- Finalizar el programa");
	    c.setCursor (13, 10);
	    c.print ("Digite la opcion: ");
	    op = c.readInt ();
	    switch (op)
	    {
		case 1:
		    e.cargarDatos ();
		    bandera = 1;
		    break;
		case 2:
		    if (bandera == 0)
			e.mensaje ();
		    else
		    {
			c.clear ();
			c.setCursor (1, 10);
			c.print ("Listado Completo");
			e.imprimir ();
		    }
		    break;

		case 3:
		    if (bandera == 0)
			e.mensaje ();
		    else
			e.consultasPorDescripcion ();
		    break;
		case 4:
		    if (bandera == 0)
			e.mensaje ();
		    else
			e.productoDeMenorPrecio ();
		    break;
		case 5:
		    if (bandera == 0)
			e.mensaje ();
		    else
			e.consultasPorProcedencia ();
		    break;
	    }
	}

	while (op != 6);
	System.exit (0);
    }
}
