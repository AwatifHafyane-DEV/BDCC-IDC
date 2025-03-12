package net.hafyane.présentation;

import net.hafyane.dao.DaoImpl;
import net.hafyane.metier.MetierImpl;
import net.hafyane.net.hafyane.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d =new DaoImpl();
        MetierImpl metier=new MetierImpl();
        System.out.println("Res= "+metier.calcul());
    }
}
