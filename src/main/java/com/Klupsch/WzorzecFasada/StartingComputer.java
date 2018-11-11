package com.Klupsch.WzorzecFasada;

public class StartingComputer {

    private Setup cpu;
    private Setup hdd;
    private Setup ram;
    private Setup input;
    private Setup graphics;



    public StartingComputer() {

        cpu = new CPU();
        hdd = new HDD();
        ram = new Ram();
        input = new Input();
        graphics = new Graphics();


    }

    public void setupCPU() {
        cpu.start();
    }
    public void setupHDD() {
        hdd.start();
    }
    public void setupRam() {
        ram.start();
    }
    public void setupInput() {
        input.start();
    }
    public void setupGraphics() {
        graphics.start();
    }
}
