package com.company;
import java.util.Scanner;

public class SentenceCheckMain {

    public static void main(String[] args) {

	SentenceCheck sentenceCheck = new SentenceCheck();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number of sentences");
	int num = scanner.nextInt();
	System.out.println("Enter the sentences");

	for (int i=0;i<num;i++) {
        sentenceCheck.check(scanner.nextLine());
	}

	scanner.close();
    }
}
