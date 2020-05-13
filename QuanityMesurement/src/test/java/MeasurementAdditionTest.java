import QuantityMesurement.AdditionOfQuantity;
import QuantityMesurement.MesurementException;
import QuantityMesurement.QuantityMeasurement;
import QuantityMesurement.Unit;
import org.junit.Assert;
import org.junit.Test;

public class MeasurementAdditionTest {
    AdditionOfQuantity additionOfQuantity = new AdditionOfQuantity();
    @Test
    public void givenTwoInchesValues_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double addition = first.getAddition(second);
        Assert.assertEquals(4, addition, 0);
    }
    //test case to test addition in inch object
    @Test
    public void givenTwoInchesValues_shouldReturnAdditionInInchObject() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);

        QuantityMeasurement result = additionOfQuantity.getAddition(first, second,Unit.INCH);
        QuantityMeasurement expected = new QuantityMeasurement(Unit.INCH,5);
        Assert.assertEquals(expected, result);
    }
    //new method
    @Test
    public void given1FeetAnd2Inch_shouldReturnAdditionInInchObject() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement result = additionOfQuantity.getAddition(first, second,Unit.INCH);
        QuantityMeasurement expected = new QuantityMeasurement(Unit.INCH,14);
        Assert.assertEquals(expected, result);
    }
    //new Method
    @Test
    public void given1FeetAnd2Inch_shouldReturnAdditionInFeetObject() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement result = additionOfQuantity.getAddition(first, second,Unit.FEET);
        QuantityMeasurement expected = new QuantityMeasurement(Unit.FEET,2);
        System.out.println("result--->"+result);
        System.out.println("expected-->"+expected);
        Assert.assertEquals(expected, result);
    }
    @Test
    public void givenTwoQuantity_WithSameType_shouldReturnTrue() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double addition = first.getAddition(second);
        Assert.assertEquals(4, addition, 0);
    }
    @Test
    public void given1FeetAnd2Inch_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.INCH, 2);
        double addition = first.getAddition(second);
        Assert.assertEquals(14, addition, 0);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.FEET, 1);
        double addition = first.getAddition(second);
        Assert.assertEquals(24, addition, 0);
    }

    @Test
    public void given2InchAndCentimeter_shouldReturnAdditionInInch() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement second = new QuantityMeasurement(Unit.CM, 2.5);
        double addition = first.getAddition(second);
        Assert.assertEquals(3, addition, 0.03);
    }

    @Test
    public void given1GallonAnd3Liter780MilliLiter_shouldReturnAdditionInLiter() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.LITER, 3.78);
        double addition = first.getAddition(second);
        Assert.assertEquals(7.56, addition, 0);
    }

    @Test
    public void given1LiterAnd1000MilliLiter_shouldReturnAdditionInLiter() throws MesurementException {
        QuantityMeasurement first = new QuantityMeasurement(Unit.LITER, 1);
        QuantityMeasurement second = new QuantityMeasurement(Unit.ML, 1000);
        double addition = first.getAddition(second);
        Assert.assertEquals(2, addition, 0);
    }

    @Test
    public void given1TonAnd1000Grams_shouldReturnAdditionInKG() throws MesurementException {
        QuantityMeasurement kg = new QuantityMeasurement(Unit.TON, 1);
        QuantityMeasurement grams = new QuantityMeasurement(Unit.GRAMS, 1000);
        double addition = kg.getAddition(grams);
        Assert.assertEquals(1001, addition, 0);
    }

    @Test
    public void givenDiffrentTypeUnit_shouldReturnException() {
        try {
            QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 212);
            QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 100);
            double addition = fahrenheit.getAddition(inch);
        } catch (MesurementException e) {
            Assert.assertEquals(MesurementException.Type.TYPE_MISMATCH, e.type);
        }
    }
}
