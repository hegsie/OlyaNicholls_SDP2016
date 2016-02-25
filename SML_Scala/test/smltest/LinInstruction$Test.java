package smltest;

import junit.framework.Assert;
import sml.LinInstruction;

import static org.junit.Assert.*;

/**
 * Created by bhegarty on 08/02/2016.
 */
public class LinInstruction$Test {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testApply() throws Exception {

        LinInstruction blah = new LinInstruction("bah", "add", 123, 100);
        LinInstruction f0 = blah.apply("f0", 10, 123);

        assertEquals(f0.value(), 123);
        assertEquals(f0.register(), 15);
    }

    @org.junit.Test
    public void testApply1() throws Exception {

    }
}