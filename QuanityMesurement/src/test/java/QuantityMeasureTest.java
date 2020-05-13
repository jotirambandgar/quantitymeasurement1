import QuantityMesurement.*;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasureTest {
    @Test
    public void givenZeroFeetAndZeroFeet_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInFeet_shouldReturnException() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfFeet_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 0.0);

    //    System.out.println(first.hashCode() == second.hashCode());

      //  Assert.assertTrue(first == second);
        Assert.assertEquals(first,second);
    }

    @Test
    public void givenZeroInchAndZeroInch_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameTypeSameValueInInch_shouldReturnTrue() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenSameReferenceOfInch_shouldReturnEqual() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 0.0);
        Assert.assertTrue(first.equals(first));
    }

    @Test
    public void givenZeroFeetAndZeroInch_shouldReturnEquals() {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 0);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 0);
        Assert.assertEquals(first, second);
    }

    @Test
    public void givenOneFeetAndOneInch_shouldReturnNotEquals() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void givenOneInchAndOneFeet_shouldReturnNotEquals() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        Assert.assertNotEquals(inch, feet);
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12);
        Assert.assertEquals(feet, inch);
    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12);
        Assert.assertEquals(inch, feet);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(feet, yard);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertNotEquals(feet, yard);
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertNotEquals(inch, yard);
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(yard, inch);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(inch, yard);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqual() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        Assert.assertEquals(yard, feet);
    }

    @Test
    public void given2InchAnd5Centimeter_shouldReturnEqual() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1.968503935);
        QuantityMeasurement cm = new QuantityMeasurement(Unit.CM, 5);
        Assert.assertEquals(inch, cm);
    }

    @Test
    public void given1GallonAnd3Liters780ml_shouldReturnEqual() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement liter = new QuantityMeasurement(Unit.LITER, 3.78);
        Assert.assertEquals(gallon, liter);
    }

    @Test
    public void given1LiterAnd1000ml_shouldReturnEqual() {
        QuantityMeasurement liter = new QuantityMeasurement(Unit.LITER, 1);
        QuantityMeasurement millileter = new QuantityMeasurement(Unit.ML, 1000);
        Assert.assertEquals(liter, millileter);
    }

    @Test
    public void given1KGAnd1000Grams_shouldReturnEqual() {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.KG, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1000);
        Assert.assertEquals(kg, grams);
    }

    @Test
    public void given1TonAnd1000Kgs_shouldReturnEqual() {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.TON, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.KG, 1000);
        Assert.assertEquals(kg, grams);
    }

    @Test
    public void givenFahrenheitToCelsius_shouldReturnEqual() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 212);
        QuantityMeasurement celsius = new QuantityMeasurement(Unit.CELSIUS, 100);
        Assert.assertEquals(fahrenheit, celsius);
    }

    @Test
    public void givenDiffrentTypeUnit_shouldReturnException() {
        try {
            QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 212);
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 100);
            fahrenheit.equals(inch);
        } catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.TYPE_MISMATCH, e.type);
        }
    }
}
