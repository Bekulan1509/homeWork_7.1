package com.company;

public abstract class  Transport {
    private int move;
   private String color;
    private int year;

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public abstract  void voiceEngine ();
    public abstract void planChecking ();
}
