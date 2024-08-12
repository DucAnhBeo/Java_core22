package logic;

import entity.Receiver;

public class ReceiverLogic {

    private Receiver receiver = new Receiver();

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "ReceiverLogic{" +
                "receiver=" + receiver +
                '}';
    }

    public void addReceiver() {
        receiver.input();
    }
}
