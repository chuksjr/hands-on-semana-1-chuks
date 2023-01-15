package com.eldorado.relatorios.generate;

import com.eldorado.relatorios.model.Billing;
import com.eldorado.relatorios.model.Invoice;
import com.eldorado.relatorios.utilities.FileManager;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class GenerateReport {

    public void generateBillingReport() {
        final FileManager billingManager = new FileManager();

        final List<Billing> billings = billingManager.billingReader("nota");
    }


    public void generateInvoiceReport() {
        final FileManager invoiceManager = new FileManager();

        final List<Invoice> invoice = invoiceManager.invoiceReader("faturamento");
    }

}
