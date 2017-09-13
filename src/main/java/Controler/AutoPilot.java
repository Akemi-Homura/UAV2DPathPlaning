package Controler;

import math.Vector2;

public class AutoPilot {

    public static class State {
        private Vector2 mPosition;
        private Vector2 mDirection;

        public State(Vector2 position, Vector2 mDirection) {
            this.mPosition = position;
            this.mDirection = mDirection;
        }

        public State(Vector2 position) {
            this(position, new Vector2(0, 0));
        }
    }
}
