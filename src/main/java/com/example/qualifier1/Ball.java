package com.example.qualifier1;

/**
 * Created by qianbw on 2017/3/9.
 */
class Ball implements Rollable {

    public Ball() {
    }

    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    public void play() {
        // ball默认是public static final, 不能修改
        //ball = new Ball("Football");
        System.out.println(ball.getName());
    }

    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.play();
    }
}

