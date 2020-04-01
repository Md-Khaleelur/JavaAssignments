package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class KYCDateRange {

    public void findRange(String signUpDates, String currDates){

        String newDate = signUpDates.substring(0,6)+ currDates.substring(6);

        LocalDate lowerRangeDate = LocalDate.parse(newDate, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        LocalDate currLocalDate = LocalDate.parse(currDates, DateTimeFormatter.ofPattern("dd-LL-yyyy"));

        String pastDate = lowerRangeDate.minusDays(30).format(DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        String futureDate = lowerRangeDate.plusDays(30).format(DateTimeFormatter.ofPattern("dd-LL-yyyy"));

        String signUpYear = signUpDates.substring(6,10);
        String currYear = currDates.substring(6,10);

        if(signUpYear.equals(currYear))
            System.out.println("No range");

        else {

            System.out.print("\n"+pastDate);
            int result = lowerRangeDate.plusDays(30).compareTo(currLocalDate);

            if (result <= 0)
                System.out.print("  " + futureDate);
            else
                System.out.print("  " + currDates);

        }
    }

}

