package QuantityMesurement;

public class AdditionOfQuantity {
    private QuantityMeasurement quantityMeasurement;
    public AdditionOfQuantity() {
        quantityMeasurement = new QuantityMeasurement();
    }
    public void convertor(QuantityMeasurement... measurement) throws MesurementException {
        if (measurement[0].unit.unitType != (measurement[1].unit.unitType)) {
            throw new MesurementException(MesurementException.Type.TYPE_MISMATCH);
        }

        measurement[0].measurement = (measurement[0].measurement * measurement[0].unit.unitValue);
        measurement[1].measurement = (measurement[1].measurement * measurement[1].unit.unitValue);
    }

    public QuantityMeasurement getAddition(QuantityMeasurement first,QuantityMeasurement second, Unit resultantUnit) throws MesurementException {
        if(!first.unit.equals(second.unit))
        this.convertor(first, second);

        return new QuantityMeasurement(resultantUnit,first.measurement + second.measurement);
    }
}
