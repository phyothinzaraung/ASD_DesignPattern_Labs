public class StolenCarHandler extends Handler{

    public StolenCarHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.isStolen()){
            System.out.println("Notify to the police: the car is stolen");
        }else {
            nextHandler.handle(cameraRecord);
        }
    }
}
