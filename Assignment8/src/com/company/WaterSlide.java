package com.company;

import java.util.Scanner;

public class WaterSlide {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight ");
        String weight = scanner.nextLine();
        scanner.close();

        try {
            if (weight.isEmpty())
                throw new EmptyWeightException("Enter valid weight");
            else if (Integer.parseInt(weight)<40)
                throw new LessWeightException("Less Weight");
            else if (Integer.parseInt(weight)>60)
                throw new OverWeightException("Over Weight");
        }

        catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
            e.printStackTrace();
        }

        finally {
            System.out.println("This is inside the finally block");
        }
    }
}
