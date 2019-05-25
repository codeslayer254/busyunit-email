/**
 * {@code BookRequest} represents a request during book creation.
 * <p/>
 *
 * @author Ram Ayall
 * @since 17/03/19
 */
package com.busyunit.email.docker.dto;

public class EBook {

    private String year;
    private String income;
    private String comanyName;

    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getIncome() {
        return income;
    }
    public void setIncome(String income) {
        this.income = income;
    }
    public String getComanyName() {
        return comanyName;
    }
    public void setComanyName(String comanyName) {
        this.comanyName = comanyName;
    }
}
