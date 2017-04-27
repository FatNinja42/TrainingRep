package com.gabriel.tutorial.maven.boxing;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by marton.cserei on 4/27/2017.
 */
public class BoxFactoryTest {

  private static final double VALID_LENGTH = 10;
  private static final double ZERO_LENGTH = 0;
  private static final double HUNDRED_LENGTH = 100;

  @Rule
  public final ExpectedException expectedException = ExpectedException.none();

  private BoxFactory boxFactory;

  @Before
  public void setUp() {
    boxFactory = new BoxFactory();
  }

  @Test
  public void testEmptyBoxHasWeight1() {
    Box box = createBox(VALID_LENGTH, VALID_LENGTH, VALID_LENGTH);
    assertEquals(1, box.getWeight(), 0);
  }

  @Test
  public void testBoxCreationWithNullDimensionsFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    boxFactory.createEmptyBox(null);
  }

  @Test
  public void testBoxCreationWithZeroWidthXFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    createBox(ZERO_LENGTH, VALID_LENGTH, VALID_LENGTH);
  }

  @Test
  public void testBoxCreationWithZeroWidthYFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    createBox(VALID_LENGTH, ZERO_LENGTH, VALID_LENGTH);
  }

  @Test
  public void testBoxCreationWithZeroHeightFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    createBox(VALID_LENGTH, VALID_LENGTH, ZERO_LENGTH);
  }

  @Test
  public void testBoxCreationWithHundredWidthXFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    createBox(HUNDRED_LENGTH, VALID_LENGTH, VALID_LENGTH);
  }

  @Test
  public void testBoxCreationWithHundredWidthYFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    createBox(VALID_LENGTH, HUNDRED_LENGTH, VALID_LENGTH);
  }

  @Test
  public void testBoxCreationWithHundredHeightFails() throws Exception {
    expectedException.expect(IllegalArgumentException.class);
    createBox(VALID_LENGTH, VALID_LENGTH, HUNDRED_LENGTH);
  }

  private Box createBox(double widthX, double widthY, double height) {
    Dimensions dimensions = new Dimensions(widthX, widthY, height);
    return boxFactory.createEmptyBox(dimensions);
  }
}