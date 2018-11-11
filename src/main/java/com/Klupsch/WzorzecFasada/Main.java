package com.Klupsch.WzorzecFasada;

public class Main {

    public static void main(String[] args) {


        StartingComputer startingComputer = new StartingComputer();

        startingComputer.setupCPU();
        startingComputer.setupGraphics();
        startingComputer.setupHDD();
        startingComputer.setupInput();
        startingComputer.setupRam();

    }
}
