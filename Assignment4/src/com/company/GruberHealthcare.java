package com.company;

import java.util.*;
import java.text.ParseException;

public class GruberHealthcare {

    public static void main(String args[]) throws ParseException {

        int compare;
        int i;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String signUp[]=new String[n];
        String currentDate[]=new String[n];

        for(i=0;i<n;i++) {
            signUp[i]=sc.next();
            currentDate[i]=sc.next();
        }

        for(i=0;i<n;i++) {

            KYCDateRange kyc=new KYCDateRange(signUp[i],currentDate[i]);
            compare=kyc.compareDates(kyc.getSignUpDate(),kyc.getCurrDate());

            if(compare>=0)
                System.out.println("No range");
            else
                System.out.println(kyc.findRange());

        }
    }
}

