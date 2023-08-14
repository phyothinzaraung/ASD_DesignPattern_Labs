public class SpeedHandler extends Handler{
    public SpeedHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.isOverSpeed()){
            System.out.println("Notify to the owner: Speeding Ticket");
        }else {
            nextHandler.handle(cameraRecord);
        }
    }
}
