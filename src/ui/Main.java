package ui;

import parser.Parser;
import parser.ParserFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter File Name");
        String fileName = new Scanner(System.in).nextLine();
        System.out.println("Enter Font");
        String font = new Scanner(System.in).nextLine();
        System.out.println("Enter Style");
        String style = new Scanner(System.in).nextLine();
        System.out.println("Enter color");
        String color = new Scanner(System.in).nextLine();
        String filetype = fileName.split("\\.")[1];

        ParserFactory parserFactory = new ParserFactory();

        Parser parser = parserFactory.getParser(filetype,style,font,color);
    }
}
