package net.laraki.presentation;

import net.laraki.dao.DaoImpl;
import net.laraki.dao.IDao;
import net.laraki.metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao); // injection de dépendence par constructeur
        System.out.println(metier.calcul());
    }
}
