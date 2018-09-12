package day44.trywithresource;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            int i = 1;
            if (i == 1) {
                throw new IOException();
            } else {
                throw new SQLException();
            }
        } catch (SQLException |IOException  se) {
            System.out.println(se + " handled..");
        } 
    }
}