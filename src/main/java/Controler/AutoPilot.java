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

        public Vector2 getPosition() {
            return mPosition;
        }

        public void setPosition(Vector2 position) {
            setPosition(position.x, position.y);
        }

        public void setPosition(float x, float y) {
            mPosition.x = x;
            mPosition.y = y;
        }

        public Vector2 getDirection() {
            return mDirection;
        }

        public void setDirection(Vector2 direction) {
            setDirection(direction.x, direction.y);
        }

        public void setDirection(float x, float y) {
            mDirection.x = x;
            mDirection.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof State) {
                State tmp = (State) obj;
                return mPosition.equals(tmp.getPosition()) && mDirection.equals(tmp.getDirection());
            }
            return false;
        }
    }
}
