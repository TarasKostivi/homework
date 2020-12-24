package homeWork7.second;

import homeWork7.first.*;

public class MyCalculator implements Plus, Minus, Myltiply, Devide {
    @Override
    public int minus() {
        return 0;
    }

    @Override
    public int myltiply() {
        return 2;
    }

    @Override
    public int plus() {
        return 4;
    }

    @Override
    public int devide() {
        return 5;
    }
}
