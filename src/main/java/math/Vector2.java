package math;

public class Vector2 {
    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 tmp) {
        this(tmp.x, tmp.y);
    }

    public Vector2 add(Vector2 tmp) {
        x += tmp.x;
        y += tmp.y;
        return this;
    }

    public Vector2 sub(Vector2 tmp) {
        x -= tmp.x;
        y -= tmp.y;
        return this;
    }

    public Vector2 cpy() {
        return new Vector2(this);
    }

    public float dot(Vector2 tmp) {
        return x * tmp.x + y * tmp.y;
    }

    public float mul(Vector2 tmp) {
        return x * tmp.y - tmp.x * y;
    }

    public float mulLeft(Vector2 tmp) {
        return tmp.x * y - x * tmp.y;
    }

    public boolean isZero() {
        return Float.compare(0f, x) == 0 && Float.compare(0f, y) == 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Vector2) {
            Vector2 tmp = (Vector2) obj;
            return Float.compare(x, tmp.x) == 0 && Float.compare(y, tmp.y) == 0;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }
}
