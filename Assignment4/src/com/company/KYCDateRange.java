package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class KYCDateRange {

    private Date signUpDate,currDate;
    private int compare1,compare2;
    private  Date date;
    private Date startKYCDate,endKYCDate;
    private String sKYCFormatted, eKYCFormatted;

    private SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy");

    public KYCDateRange( String date1,String date2) throws ParseException {
        this.signUpDate= sdf.parse(date1);
        this.currDate= sdf.parse(date2);
    }

    public int compareDates(Date d1,Date d2) {
        return d1.compareTo(d2);
    }

    public Date addDays(Date date ,int days) {
        Calendar c =Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    @SuppressWarnings("deprecation")
    public String findRange() {

        date = signUpDate;
        date.setYear(currDate.getYear());

        endKYCDate=addDays(date, 30);
        startKYCDate=addDays(date, -30);

        compare1 = compareDates(currDate,startKYCDate);
        compare2 = compareDates(currDate,endKYCDate);

        sKYCFormatted = sdf.format(startKYCDate);
        eKYCFormatted = sdf.format(endKYCDate);

        if(compare1 == 1 && compare2 == -1) {
            return sKYCFormatted +" "+sdf.format(currDate);
        }

        else {
            return sKYCFormatted +" "+ eKYCFormatted;
        }

    }

    public Date getSignUpDate() {
        return signUpDate;
    }

    public Date getCurrDate() {
        return currDate;
    }

}

