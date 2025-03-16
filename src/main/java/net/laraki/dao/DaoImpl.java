package net.laraki.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("DaoImpl");
        int year=2025;
        return year;
    }
}
