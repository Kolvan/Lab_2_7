import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

/**
 * Created by Lena on 25.11.2016.
 */
public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, String srialNumber, Float price, int speed, String mac) {
        super(manufacturer, srialNumber, price);
        this.speed = speed;
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",  speed = " + speed +
                ", mac = " + mac;
    }


    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}