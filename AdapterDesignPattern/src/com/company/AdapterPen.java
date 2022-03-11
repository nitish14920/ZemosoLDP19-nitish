package com.company;

public class AdapterPen implements Pen{

    BallPen bp = new BallPen();
    @Override
    public void write(String str) {
        bp.mark(str);
    }
}
