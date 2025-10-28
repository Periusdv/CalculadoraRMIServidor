package principal;

import java.rmi.RemoteException;

public class ImplementaCalculadora implements RemoteCalculadora {

    private double valorA;
    private double valorB;
    
    public ImplementaCalculadora() throws RemoteException {
        this(0.0, 0.0);
    }
    
    public ImplementaCalculadora(double valorA, double valorB) throws RemoteException {
        setValorA(valorA);
        setValorB(valorB);
    }

    @Override
    public double getValorA() throws RemoteException {
        return valorA;
    }

    @Override
    public double getValorB() throws RemoteException {
        return valorB;
    }

    @Override
    public void setValorA(double valorA) throws RemoteException {
        this.valorA = valorA;
    }

    @Override
    public void setValorB(double valorB) throws RemoteException {
        this.valorB = valorB;
    }

    @Override
    public double getSoma() throws RemoteException {
        return (getValorA() + getValorB());
    }

    @Override
    public double getDiferenca() throws RemoteException {
        return (getValorA() - getValorB());
    }

    @Override
    public double getMultiplicacao() throws RemoteException {
        return (getValorA() * getValorB());
    }

    @Override
    public double getDivisao() throws RemoteException {
        return (getValorA() / getValorB());
    }
    
}
