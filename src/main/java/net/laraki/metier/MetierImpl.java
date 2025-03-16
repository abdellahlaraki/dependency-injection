package net.laraki.metier;

import net.laraki.dao.IDao;

import java.time.LocalDate;

public class MetierImpl implements  IMetier{
    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul() {
        int CurrentYear= LocalDate.now().getYear();
        double age= CurrentYear-dao.getYear();
        return age;
    }
}
