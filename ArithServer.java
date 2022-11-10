import java.rmi.*;
import java.lang.*;
public class ArithServer
{
public static void main(String[] args)
{ try
{
ArithImpl ai = new ArithImpl();
Naming.rebind("arithserver",ai);
System.out.println("Arithmetic Operations Server ready...");
}
catch(Exception e)
{
e.printStackTrace();
} } }
