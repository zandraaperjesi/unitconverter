import org.junit.Assert;
import org.junit.Test;

public class UnitConverterTest {

    final static UnitConverter unitConverterUnderTest = new UnitConverter();

    @Test
    public void testExchangeFromCentimeterToDecimeter() {
        Assert.assertEquals("Conversion was incorrect", 10.0, unitConverterUnderTest.convertFromTo(100, "cm", "dm"), 0.001);
    }

    @Test
    public void testExchangeFromCentimeterToDecimeter() {
        Assert.assertEquals("Conversion was incorrect", 1.0, unitConverterUnderTest.convertFromTo(100, "cm", "dm"), 0.001);
    }

    @Test
    public void testExchangeFromMillimeterToKilometer() {
        Assert.assertEquals("Conversion was incorrect", 0.05372, unitConverterUnderTest.convertFromTo(53720, "mm", "km"), 0.001);
    }

    @Test
    public void testExchangeFromKilometerToMeter() {
        Assert.assertEquals("Conversion was incorrect", 1200, unitConverterUnderTest.convertFromTo(1.2, "km", "m"), 0.001);
    }

    @Test
    public void testExchangeFromMeterToMeter() {
        Assert.assertEquals("Conversion was incorrect", 666, unitConverterUnderTest.convertFromTo(666, "m", "m"), 0.001);
    }

    @Test
    public void testExchangeFromDecilitreToMicrolitre() {
        Assert.assertEquals("Conversion was incorrect", 15200000, unitConverterUnderTest.convertFromTo(152, "dl", "µl"), 0.001);
    }

    @Test
    public void testExchangeFromDecagramToKilogram() {
        Assert.assertEquals("Conversion was incorrect", 5.46, unitConverterUnderTest.convertFromTo(546, "dag", "kg"), 0.001);
    }
}