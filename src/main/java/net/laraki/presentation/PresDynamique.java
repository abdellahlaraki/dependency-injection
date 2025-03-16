package net.laraki.presentation;

import net.laraki.dao.IDao;
import net.laraki.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class PresDynamique {
    //FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String classDao=scanner.nextLine();
        Class Cdao=Class.forName(classDao);
        IDao dao=(IDao) Cdao.newInstance();
        String classMetier=scanner.nextLine();
        Class cMetier=Class.forName(classMetier);

        // injection de dépendence par constructeur
        //IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        // injection de dépendence par setter
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);
        System.out.println(metier.calcul());
    }
}
