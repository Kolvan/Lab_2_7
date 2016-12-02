/**
 * Created by Lena on 28.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Device[] devices = new Device[15];
        for (int i = 0; i < 5; i++) {
            devices[i] = new Device("Philips", "ser: " + i, (float) (100 + i * 10));
        }
        for (int i = 5; i < 10; i++) {
            devices[i] = new Monitor("Philips", "ser: " + i, (float) (100 + i * 10), 1920, 1080);
        }
        for (int i = 10; i < 15; i++) {
            devices[i] = new EthernetAdapter("Philips", "ser: " + i, (float) (100 + i * 10), 100, "mac 10" + i);
        }
        for (Device device : devices) {
            System.out.println(device);
        }
    }

}