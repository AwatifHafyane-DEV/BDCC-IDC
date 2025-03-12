package net.hafyane.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donné");
        double t=30;
        return t;
    }
}
