package com.bange.designmode.designmode.facade;
// 外观模式--外观类组合所有需要操作的类
public class MovieFacde {
    private DVDPlayer dvdPlayer;
    private Lamplight lamplight;
    private LoudspeakerBox loudspeakerBox;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;

    public MovieFacde() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.lamplight = Lamplight.getInstance();
        this.loudspeakerBox = LoudspeakerBox.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    //准备阶段
    public void ready() {
        //灯光打开
        lamplight.on();
        // dvd打开
        dvdPlayer.on();
        // 屏幕放下来
        screen.down();
        // 音箱打开
        loudspeakerBox.on();
        projector.on();
        popcorn.on();
    }

    public void play() {
        dvdPlayer.play();
        loudspeakerBox.turn();
        projector.projector();

    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        lamplight.off();
        dvdPlayer.off();
        screen.up();
        loudspeakerBox.off();
        projector.off();
        popcorn.off();
    }


}
