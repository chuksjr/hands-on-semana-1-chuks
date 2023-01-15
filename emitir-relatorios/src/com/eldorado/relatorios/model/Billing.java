package com.eldorado.relatorios.model;

import java.util.Date;
public class Billing implements Comparable<Billing> {
    String company;
    int month;
    int year;
    double first_parcel;
    double second_parcel;
    double third_parcel;
    Date date_first_parcel;
    Date date_second_parcel;
    Date date_third_parcel;

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

    public double getFirst_parcel() {
        return first_parcel;
    }

    public void setFirst_parcel(double first_parcel) {
        this.first_parcel = first_parcel;
    }

    public double getSecond_parcel() {
        return second_parcel;
    }

    public void setSecond_parcel(double second_parcel) {
        this.second_parcel = second_parcel;
    }

    public double getThird_parcel() {
        return third_parcel;
    }

    public void setThird_parcel(double third_parcel) {
        this.third_parcel = third_parcel;
    }

    public Date getDate_first_parcel() {
        return date_first_parcel;
    }

    public void setDate_first_parcel(Date date_first_parcel) {
        this.date_first_parcel = date_first_parcel;
    }

    public Date getDate_second_parcel() {
        return date_second_parcel;
    }

    public void setDate_second_parcel(Date date_second_parcel) {
        this.date_second_parcel = date_second_parcel;
    }

    public Date getDate_third_parcel() {
        return date_third_parcel;
    }

    public void setDate_third_parcel(Date date_third_parcel) {
        this.date_third_parcel = date_third_parcel;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "company='" + company + '\'' +
                ", month=" + month +
                ", year=" + year +
                ", first_parcel=" + first_parcel +
                ", second_parcel=" + second_parcel +
                ", third_parcel=" + third_parcel +
                ", date_first_parcel=" + date_first_parcel +
                ", date_second_parcel=" + date_second_parcel +
                ", date_third_parcel=" + date_third_parcel +
                '}';
    }

    @Override
    public int compareTo(Billing o) {
        return company.compareTo(o.getCompany());
    }
}
