package com.elementarial.helpers;

/**
 * Created by alvarohernandez on 5/23/17.
 */
public class Drawer {

    public void printAsterisk(){
        System.out.println("*");
    }

    public void drawHorizontalAsterisksLine(int n){
        drawHorizontalCharLine(n,'*');
    }


    public void drawVerticalAsterisksLine(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int n){
        for (int i = 0; i < n; i++) {
            drawHorizontalCharLine(i,'*');
            System.out.println();
        }
    }

    public void drawIsoscelesTriangle(int lines){
        drawIsoscelesTriangle(2*lines+1,1);
    }

    public void drawDiamond(int lines,String name){
        drawDiamond(2*lines+1,1,name);
    }

    private void drawHorizontalCharLine(int n,char character){
        for (int i = 0; i < n; i++) {
            System.out.print(character);
        }
    }

    private void drawHorizontalSpacesLine(int n){
        drawHorizontalCharLine(n,' ');
    }

    private void printHorizontalAsteriskLineWithSpaces(int length, int spaces){
        drawHorizontalSpacesLine(spaces/2);
        drawHorizontalAsterisksLine(length);
        drawHorizontalSpacesLine(spaces/2);
        System.out.println();
    }

    private void printHorizontalNameLineWithSpaces(int length, int spaces, String name){
        drawHorizontalSpacesLine(spaces/2);
        System.out.print(name);
        drawHorizontalSpacesLine(spaces/2);
        System.out.println();
    }

    private void drawIsoscelesTriangle(int maxLength, int currentLength){
        int spaces = maxLength-currentLength;
        if(currentLength == maxLength)
            return;

        printHorizontalAsteriskLineWithSpaces(currentLength,spaces);
        drawIsoscelesTriangle(maxLength,currentLength+2);
    }

    private void drawDiamond(int maxLength, int currentLength,String name){

        int spaces = maxLength-currentLength;

        if(currentLength == maxLength){
            if(name != null && name.length() > 0)
                printHorizontalNameLineWithSpaces(currentLength,maxLength-name.length(),name);
            else
                printHorizontalAsteriskLineWithSpaces(currentLength,spaces);
            return;
        }else if(currentLength == 0){
            return;
        }

        printHorizontalAsteriskLineWithSpaces(currentLength,spaces);
        drawDiamond(maxLength,currentLength+2,name);
        printHorizontalAsteriskLineWithSpaces(currentLength,spaces);

    }
}
