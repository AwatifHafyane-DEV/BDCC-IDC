package net.hafyane.net.hafyane.ext;

import net.hafyane.dao.IDao;

import java.sql.SQLOutput;

public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs.....");
        double t = 12;
        return t;
    }
}
