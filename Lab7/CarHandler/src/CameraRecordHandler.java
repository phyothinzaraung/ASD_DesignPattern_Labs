public class CameraRecordHandler {
    private Handler chainOfHandlers;

    public void setChainOfHandlers(Handler chainOfHandlers) {
        this.chainOfHandlers = chainOfHandlers;
    }

    public void handleCameraRecord(CameraRecord cameraRecord){
        chainOfHandlers.handle(cameraRecord);
    }
}
