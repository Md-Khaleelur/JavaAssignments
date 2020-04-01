package com.company;
import java.util.*;

public class GruberHealthcare {

    public static void main(String[] args) {

        KYCDateRange kyc=new KYCDateRange();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of dates");
        int n=scanner.nextInt();

        String[] signUpDates=new String[n];
        String[] currDate=new String[n];

        for(int i=0;i<n;i++) {

            signUpDates[i]=scanner.next();
            currDate[i]=scanner.next();

            kyc.findRange(signUpDates[i],currDate[i]);

        }

    }
}


