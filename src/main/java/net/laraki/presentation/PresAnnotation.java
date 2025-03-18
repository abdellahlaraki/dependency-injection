package net.laraki.presentation;

import net.laraki.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext("net.laraki.dao","net.laraki.metier");
        IMetier metier=(IMetier)  context.getBean("metier");
        System.out.println(metier.calcul());
    }
}
