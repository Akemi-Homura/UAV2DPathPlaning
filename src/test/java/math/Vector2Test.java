package math;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Vector2Test {
    private Vector2 mV1;
    private Vector2 mV2;
    final double esp = 1e-7;

    @Before
    public void setUp() throws Exception {
        mV1 = new Vector2(2f, 1f);
        mV2 = new Vector2(-3f, 5f);
    }

    @Test
    public void add() throws Exception {
        Vector2 v3 = new Vector2(-1f, 6f);
        Vector2 v = mV1.add(mV2);
        assertEquals(v, v3);
    }

    @Test
    public void sub() throws Exception {
        Vector2 v = mV1.sub(mV2);
        Vector2 v3 = new Vector2(5f, -4f);
        assertEquals(v, v3);
    }

    @Test
    public void cpy() throws Exception {
        Vector2 v = mV1.cpy();
        assertEquals(v, mV1);
        assertEquals(v, mV1);
    }

    @Test
    public void dot() throws Exception {
        float ans = -1f;
        assertEquals(mV1.dot(mV2), ans, esp);
    }

    @Test
    public void mul() throws Exception {
        float ans = 13f;
        assertEquals(mV1.mul(mV2), ans, esp);
    }

    @Test
    public void mulLeft() throws Exception {
        float ans = -13f;
        assertEquals(mV1.mulLeft(mV2), ans, esp);
    }

    @Test
    public void testEquals() throws Exception {
        Vector2 v = new Vector2(2f, 1.1111f);
        Vector2 v1 = new Vector2(2.00001f, 1f);
        Vector2 v2 = new Vector2(1.9999f, 0.99999f);
        Vector2 v3 = new Vector2(7f, 8f);
        List<Vector2> list = new ArrayList<Vector2>();
        list.add(v);
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(mV1);
        list.add(mV2);
        Vector2 v4 = new Vector2(2f, 1f);
        Vector2 v5 = new Vector2(-3f, 5f);
        assertEquals(mV1, v4);
        assertEquals(mV2, v5);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    assertNotEquals(list.get(i), list.get(j));
                }
            }
        }

        Object o = new Vector2(2f, 1f);
        Object o1 = new String("(2f,1f)");
        assertEquals(mV1, o);
        assertNotEquals(mV1, o1);
    }

    @Test
    public void testToString() throws Exception {
        String v1 = String.format("(%f,%f)", 2f, 1f);
        String v2 = String.format("(%f,%f)", -3f, 5f);
        assertEquals(mV1.toString(), v1);
        assertEquals(mV2.toString(), v2);
    }


}
