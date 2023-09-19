package com.codebase;

public class Bottle {
    private int volume;

    public Bottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){
        this.setVolume(this.getVolume()-10);
    }

    public void empty(){
        this.setVolume(0);
    }

    public void fill(){
        this.setVolume(100);
    }
}
