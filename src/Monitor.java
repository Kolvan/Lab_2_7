public class Monitor extends Device {
    private int resolutionX, resolutionY;

    public Monitor(String manufactuer, String serialNumber, Float price, int resolutionX, int resolutionY) {
        super(manufactuer, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() + ",  resolutionX = " + this.resolutionX + ", resolutionY = " + this.resolutionY;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }
}