public class RegistrationHandler extends Handler{
    public RegistrationHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.getLicense_plate() == null){
            System.out.println("Notify to the owner: No Registration Ticket");
        }else {
            nextHandler.handle(cameraRecord);
        }
    }
}
