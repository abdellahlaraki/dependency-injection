package net.laraki.dao;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{
    @Override
    public double getYear() {
        System.out.println("year born");
        int year=2003;
        return  year;
    }
}
