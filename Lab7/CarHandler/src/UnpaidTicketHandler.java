public class UnpaidTicketHandler extends Handler{
    public UnpaidTicketHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(CameraRecord cameraRecord) {
        if(cameraRecord.getUnpaidTicket() > 0){
            System.out.println("Notify to the owner: " + cameraRecord.getUnpaidTicket() + " Unpaid Ticket");
        }
    }
}
