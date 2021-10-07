import hsa.Console;

public class EjercicioFranciscoGabrielSanchez
{
    static Console c;

    public static void main (String[] args)
    {
	c = new Console ();
	String name;
	int password;
	c.println ("Bienvenido a Banco Galicia");
	c.print ("Ingrese Nombre y Apellido: ");
	name = c.readLine ();
	c.print ("Ingrese la clave de seguridad: ");
	password = c.readInt ();
	if (name.equals ("Alberto Fernandez") && password == 1111)
	{
	    c.print ("El saldo de su cuenta es de: $30.569.339,96");
	}
	else
	{
	    if (name.equals ("Mirta Legrand") && password == 2222)
	    {
		c.print ("El saldo de su cuenta es de: $953.334,78");
	    }
	    else
	    {
		if (name.equals ("Lionel Messi") && password == 3333)
		{
		    c.print ("El saldo de su cuenta es de: $450.098.444,02");
		}
		else
		{
		    c.print ("El nombre o clave de seguridad es invalido");
		}
	    }
	}
    }
}

