package QuantityMesurement;

import java.util.Objects;

public class QuantityMeasurement {

    public Unit unit;
    public double measurement;

    public QuantityMeasurement() {

    }

    public QuantityMeasurement(Unit unit, double measurement) {
        this.unit = unit;
        this.measurement = measurement;
    }

    public void convertor(QuantityMeasurement... measurement) throws MesurementException {
        if (measurement[0].unit.unitType != (measurement[1].unit.unitType)) {
            throw new MesurementException(MesurementException.Type.TYPE_MISMATCH);
        }
        measurement[0].measurement = (measurement[0].measurement * measurement[0].unit.unitValue);
        measurement[1].measurement = (measurement[1].measurement * measurement[1].unit.unitValue);
    }

    @Override
    public boolean equals(Object o) {

        if(this.hashCode() == o.hashCode()){
            System.out.println("hash code check");
            return true;
        }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuantityMeasurement that = (QuantityMeasurement) o;

        if(this.unit.equals(that.unit) && this.measurement == that.measurement) return true;

        try {
            convertor(this, that);
        } catch (MesurementException e) {
        }
        return Double.compare(that.measurement, measurement) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, measurement);
    }

    public double getAddition(QuantityMeasurement that) throws MesurementException {
        convertor(this, that);
        return this.measurement + that.measurement;
    }

    @Override
    public String toString() {
        return "QuantityMeasurement{" +
                "unit=" + unit +
                ", measurement=" + measurement +
                '}';
    }
}
