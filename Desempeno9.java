import hsa.Console;

public class Desempeno9
{
    static Console c;               
    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	c.print ("ingrese un numero: ");
	num = c.readInt ();
	if (num >= 10)
	 {
	  c.println ("El numero ingresado tiene dos digitos ");
	 }
	else
	 {
	  c.println ("El numero ingresado tiene un digito ");
	 }
    }
}
