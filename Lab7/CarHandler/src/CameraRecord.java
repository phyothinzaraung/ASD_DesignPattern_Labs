public class CameraRecord {
    private int camera_id;
    private String license_plate;
    private int speed;
    private boolean isStolen;
    private boolean overSpeed;

    private int unpaidTicket;

    public CameraRecord(int camera_id, String license_plate, int speed, boolean isStolen, boolean overSpeed, int unpaidTicket){
        this.camera_id = camera_id;
        this.license_plate = license_plate;
        this.speed = speed;
        this.isStolen = isStolen;
        this.overSpeed = overSpeed;
        this.unpaidTicket = unpaidTicket;
    }

    public int getCamera_id() {
        return camera_id;
    }

    public void setCamera_id(int camera_id) {
        this.camera_id = camera_id;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStolen() {
        return isStolen;
    }

    public void setStolen(boolean stolen) {
        isStolen = stolen;
    }

    public boolean isOverSpeed() {
        return overSpeed;
    }

    public void setOverSpeed(boolean overSpeed) {
        this.overSpeed = overSpeed;
    }

    public int getUnpaidTicket() {
        return unpaidTicket;
    }

    public void setUnpaidTicket(int unpaidTicket) {
        this.unpaidTicket = unpaidTicket;
    }
}
