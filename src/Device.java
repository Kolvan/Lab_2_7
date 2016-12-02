
/**
 * Created by user on 25.11.2016.
 */
public class Device {
    private String manufacturer, serialNumber;
    private Float price;

    public Device(String manufacturer, String serialNumber, Float price) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Manufacter = " + this.manufacturer + ", srialNumber = " + this.serialNumber + ", price = " + this.price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(String srialNumber) {
        this.serialNumber = srialNumber;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Float getPrice() {
        return price;
    }
}