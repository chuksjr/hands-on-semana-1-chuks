
package com.eldorado.relatorios.utilities;

import com.eldorado.relatorios.model.Billing;
import com.eldorado.relatorios.model.Invoice;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class FileManager {

    private static final Logger LOGGER = Logger.getLogger(FileManager.class.getName());

    static final String CAMINHO = "C:/Users/Chuks Jr/Documents/Bootcamp/hands-on-semana-1-chuks/emitir-relatorios/resources/";

    public void invoiceWriter(List<Invoice> invoices, String nomeDoArquivo) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("%s/%s.txt", CAMINHO, nomeDoArquivo), true))) {
            for (Invoice invoice : invoices) {
                bufferedWriter.append(invoice.toString()).append("\n");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    public void billingWriter(List<Billing> billings, String nomeDoArquivo) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("%s/%s.txt", CAMINHO, nomeDoArquivo), true))) {
            for (Billing billing : billings) {
                bufferedWriter.append(billing.toString()).append("\n");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    public List<Invoice>  invoiceReader(String nomeArquivo) {
        List<Invoice> invoices = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format("%s/%s.txt", CAMINHO, nomeArquivo)))) {
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] vetor = line.split(";", 6);
                var invoice = new Invoice();
                invoice.setCompany(vetor[0]);
                invoice.setMonth(Utilities.readInteger(vetor[1]));
                invoice.setYear(Utilities.readInteger(vetor[2]));
                invoice.setValue(Utilities.readDouble(vetor[3]));
                invoice.setEmission_date(Utilities.readDate(vetor[4]));
                invoice.setBilling(Utilities.readInteger(vetor[5]));
                invoices.add(invoice);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        return invoices;
    }

    public List<Billing> billingReader(String nomeArquivo) {
        List<Billing> billings = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format("%s/%s.txt", CAMINHO, nomeArquivo)))) {
            bufferedReader.readLine();
            String line = bufferedReader.readLine();
            while (line != null) {
                String[] vetor = line.split(";");
                var billing = new Billing();
                billing.setCompany(vetor[0]);
                billing.setMonth(Utilities.readInteger(vetor[1]));
                billing.setYear(Utilities.readInteger(vetor[2]));
                billing.setDate_first_parcel(Utilities.readDate(vetor[3]));
                billing.setFirst_parcel(Utilities.readDouble(vetor[4]));
                billing.setDate_second_parcel(Utilities.readDate(vetor[5]));
                billing.setSecond_parcel(Utilities.readDouble(vetor[6]));
                billing.setDate_third_parcel(Utilities.readDate(vetor[7]));
                billing.setThird_parcel(Utilities.readDouble(vetor[8]));
                billings.add(billing);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
        return billings;
    }

}
