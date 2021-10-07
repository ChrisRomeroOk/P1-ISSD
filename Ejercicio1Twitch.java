import hsa.Console;

public class Ejercicio1Twitch
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();

	float[] sueldos = new float [5];

	for (int f = 0 ; f < sueldos.length ; f++)
	{
	    c.print ("Ingrese el sueldo del operario: ");
	    sueldos [f] = c.readFloat ();
	}
	c.println();
	c.println ("Listado completo de sueldos");
	for (int f = 0 ; f < sueldos.length ; f++)
	{
	    c.println (sueldos [f]);
	}

    }
}

/* se desea guardar los sueldos de 5 operarios.
Segun lo conocido deberiamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.
Empleando un vector solo se requiere definir un unico nombre y accedemos a cada elemento por medio del subindice.*/
