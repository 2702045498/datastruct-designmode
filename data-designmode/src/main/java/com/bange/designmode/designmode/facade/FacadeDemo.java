package com.bange.designmode.designmode.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        MovieFacde movieFacde = new MovieFacde();
        movieFacde.ready();
        movieFacde.play();
        movieFacde.pause();
        movieFacde.end();
    }
}
