package Controler;

import java.util.Queue;

public abstract class AutoPilotControl<T> {
    private Queue<T> mTargetStates;
    private T mCurState;

    public AutoPilotControl(T curState) {
        mCurState = curState;
    }

    public final AutoPilotControl addTargetState(T state) {
        mTargetStates.add(state);
        return this;
    }

    public final T getCurState() {
        return mCurState;
    }

    public abstract void autoPilot();

}
