package com.example.qualifier1;

/**
 * Created by qianbw on 2017/3/9.
 */
interface Rollable extends Playable, Bounceable {
    // 默认是public static final
    Ball ball = new Ball("PingPang");
}

