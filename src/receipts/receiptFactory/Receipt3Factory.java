package receipts.receiptFactory;

import receipts.IReceipt;
import receipts.ReceiptFactory;
import receipts.serviceImpl.Receipt3;

public class Receipt3Factory extends ReceiptFactory {

    @Override
    protected IReceipt createReceipt() {
        return new Receipt3();
    }
}
