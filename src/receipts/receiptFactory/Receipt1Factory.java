package receipts.receiptFactory;

import receipts.IReceipt;
import receipts.ReceiptFactory;
import receipts.serviceImpl.Receipt1;

public class Receipt1Factory extends ReceiptFactory {

    @Override
    protected IReceipt createReceipt() {
        return new Receipt1();
    }

}
