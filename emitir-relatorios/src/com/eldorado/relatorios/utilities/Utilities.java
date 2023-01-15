package com.eldorado.relatorios.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utilities {
    private static final Logger LOGGER = Logger.getLogger(Utilities.class.getName());

    public static Integer readInteger(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor informado incorreto -> %s", value));
        }
        return Integer.MIN_VALUE;


    }
    public static Double readDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor informado incorreto -> %s", value));
        }
        return Double.MIN_NORMAL;
    }

    public static Date readDate(String value) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(value);
            return date;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, String.format("Valor informado incorreto -> %s", value));
        }
        return null;
    }
}