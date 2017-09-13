package Controler;

import math.Vector2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UAVDFStateTest {

    private Vector2 mPos1;
    private Vector2 mDir1;
    private Vector2 mPos2;
    private Vector2 mDir2;
    private Vector2 mPos_cpy1;
    private Vector2 mPos_cpy2;
    private Vector2 mDir1_cpy1;
    private Vector2 mDir2_cpy2;
    private UAVDFState mSt1;
    private UAVDFState mSt2;
    private UAVDFState mSt3;
    private UAVDFState mSt4;

    @Before
    public void setUp() {
        mPos1 = new Vector2(2f, 1f);
        mDir1 = new Vector2(3f, 4f);
        mPos2 = new Vector2(-1f, -2f);
        mDir2 = new Vector2(-3f, -6f);
        mPos_cpy1 = mPos1.cpy();
        mPos_cpy2 = mPos2.cpy();
        mDir1_cpy1 = mDir1.cpy();
        mDir2_cpy2 = mDir2.cpy();
        mSt1 = new UAVDFState(mPos1, mDir1);
        mSt2 = new UAVDFState(mPos2, mDir2);
        mSt3 = new UAVDFState(mPos1);
        mSt4 = new UAVDFState(mPos2);
    }

    @Test
    public void testEquals() {
        // equals test

        assertNotEquals(mSt1, mSt2);
        assertNotEquals(mSt2, mSt3);
        assertNotEquals(mSt1, mSt4);
        assertEquals(mSt1, mSt3);
        assertEquals(mSt2, mSt4);
    }

    @Test
    public void testSet() {
        mSt1.setPosition(mPos2);
        mSt1.setDirection(mDir2);
        assertEquals(mSt1.getPosition(), mPos2);
        assertEquals(mSt1.getDirection(), mDir2);
        assertEquals(mPos1, mPos_cpy1);
        assertEquals(mPos2, mPos_cpy2);
        assertEquals(mDir1, mDir1_cpy1);
        assertEquals(mDir2, mDir2_cpy2);
        assertEquals(mSt1, mSt2);
        mSt4.setDirection(mPos1);
        assertNotEquals(mSt2, mSt4);
    }
}