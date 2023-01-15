
package com.eldorado.relatorios;

import com.eldorado.relatorios.generate.GenerateReport;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main{

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        LOGGER.info("Aplicação Iniciada");

        while (true) {
            System.out.println("Digite:\n1 para Gerar relatório de Empresas em conformidades \n2 para Gerar relatório de Empresas em não conformidades \n3 para sair");
            var option = SCANNER.nextLine();
            final GenerateReport generateReports = new GenerateReport();

            if (Objects.equals(option, "1")) {
                generateReports.generateInvoiceReport();
            } else if (Objects.equals(option, "2")) {
                generateReports.generateBillingReport();
            } else if (Objects.equals(option, "3")) {
                break;
            } else {
                LOGGER.info("Valor Digitado Invalido");
            }
        }
    }
}