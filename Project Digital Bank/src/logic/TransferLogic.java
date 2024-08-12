package logic;

import entity.Transfer;

public class TransferLogic {
    private Transfer transfer = new Transfer();

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "TransferLogic{" +
                "transfer=" + transfer +
                '}';
    }


}
