import java.rmi.*;
import java.rmi.server.*;
public interface ArithIntf extends Remote
{
double add(double a, double b) throws RemoteException; double sub(double a, double b) throws RemoteException; double mul(double a, double b) throws RemoteException; double div(double a, double b) throws RemoteException;
}