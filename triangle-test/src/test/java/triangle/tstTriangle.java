package triangle;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.Assert;


public class tstTriangle {

   @DataProvider(name = "ordinary")
   public Object[][] ordinaryTriangle() {
      return new Object[][]{
              {new Triangle(3, 4, 6)},
      };
   }

   @Test (dataProvider = "ordinary")
   public void tstOrdinary(Triangle tr) {
      Assert.assertEquals(tr.detectTriangle(), tr.TR_ORDYNARY);
   }

   @DataProvider(name = "isosceles")
   public Object[][] isoscelesTriangle() {
      return new Object[][]{
              {new Triangle(1, 2, 2)},
      };
   }

   @Test (dataProvider = "isosceles")
   public void tstIsosceles(Triangle tr) {
      Assert.assertEquals(tr.detectTriangle(), tr.TR_ISOSCELES);
   }

   @DataProvider(name = "rectangular")
   public Object[][] rectangularTriangle() {
      return new Object[][]{
              {new Triangle(3, 4, 5)},
      };
   }

   @Test (dataProvider = "rectangular")
   public void tstRectangular(Triangle tr) {
      Assert.assertEquals(tr.detectTriangle(), tr.TR_RECTANGULAR);
   }

   @DataProvider(name = "equilateral")
   public Object[][] equilateralTriangle() {
      return new Object[][]{
              {new Triangle(5, 5, 5)},
      };
   }

   @Test (dataProvider = "equilateral")
   public void tstEquilateral(Triangle tr) {
      Assert.assertEquals(tr.detectTriangle(), tr.TR_EQUILATERAL);
   }

   @Test (dataProvider = "rectangular")
   public void tstSquare (Triangle tr) {
      Assert.assertEquals(tr.getSquare(), 6);
   }

   @Test (dataProvider = "ordinary")
   public void tstPositiveCheker(Triangle tr){
      Assert.assertTrue(tr.checkTriangle());
   }

   @DataProvider(name = "negativeCheker")
   public Object[][] negativeCheker() {
      return new Object[][]{
              {new Triangle(1, 2, 3)},
              {new Triangle(-7, 5, 5)},
              {new Triangle(5, -5, 5)},
              {new Triangle(5, 5, -5)},
      };
   }

   @Test (dataProvider = "negativeCheker")
   public void tstNegativeCheker(Triangle tr){
      Assert.assertFalse(tr.checkTriangle());
   }







}
