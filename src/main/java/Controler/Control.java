package Controler;

import java.util.Queue;

public abstract class Control<T> {
    private Queue<T> mTargetStates;
    private T mCurState;

    public Control(T curState) {
        mCurState = curState;
    }

    public final Control addTargetState(T state) {
        mTargetStates.add(state);
        return this;
    }

    public final T getCurState() {
        return mCurState;
    }

    public abstract void autoPilot();

}
