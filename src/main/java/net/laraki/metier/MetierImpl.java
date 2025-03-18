package net.laraki.metier;

import net.laraki.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service("metier")
public class MetierImpl implements  IMetier{
    @Autowired
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

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
