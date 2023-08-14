public class Application {

    public static void main(String[] args) {
        CameraRecordHandler cameraRecordHandler = new CameraRecordHandler();
        UnpaidTicketHandler unpaidTicketHandler = new UnpaidTicketHandler(null);
        StolenCarHandler stolenCarHandler = new StolenCarHandler(unpaidTicketHandler);
        SpeedHandler speedHandler = new SpeedHandler(stolenCarHandler);
        RegistrationHandler registrationHandler = new RegistrationHandler(speedHandler);

        cameraRecordHandler.setChainOfHandlers(registrationHandler);

        cameraRecordHandler.handleCameraRecord(new CameraRecord(1, "AX123", 60, true, false, 0));
        cameraRecordHandler.handleCameraRecord(new CameraRecord(2, null, 60, false, false, 0));
        cameraRecordHandler.handleCameraRecord(new CameraRecord(3, "AA114", 80, false, true, 0));
        cameraRecordHandler.handleCameraRecord(new CameraRecord(4, "BB112", 50, false, false, 3));

    }
}
