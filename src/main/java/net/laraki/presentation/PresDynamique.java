package net.laraki.presentation;

import net.laraki.dao.IDao;
import net.laraki.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(new File("config.txt"));

        String classDao=scanner.nextLine();
        Class Cdao=Class.forName(classDao);
        IDao dao=(IDao) Cdao.newInstance();

        String classMetier=scanner.nextLine();
        Class cMetier=Class.forName(classMetier);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println(metier.calcul());
    }
}
