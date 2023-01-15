package com.eldorado.relatorios.model;

import java.util.Date;
public class Invoice implements Comparable<Invoice>{
    String company;
    int month;
    int year;
    double value;
    Date emission_date;
    int billing;


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getEmission_date() {
        return emission_date;
    }

    public void setEmission_date(Date emission_date) {
        this.emission_date = emission_date;
    }

    public int getBilling() {
        return billing;
    }

    public void setBilling(int billing) {
        this.billing = billing;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "company='" + company + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", value=" + value +
                ", emission_date=" + emission_date +
                ", billing=" + billing +
                '}';
    }


    @Override
    public int compareTo(Invoice o) {
        return company.compareTo(o.getCompany());
    }
}
