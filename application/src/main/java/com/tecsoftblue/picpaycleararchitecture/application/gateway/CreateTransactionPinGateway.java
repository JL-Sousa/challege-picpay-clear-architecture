package com.tecsoftblue.picpaycleararchitecture.application.gateway;

import com.tecsoftblue.picpaycleararchitecture.core.domain.TransactionPin;

public interface CreateTransactionPinGateway {
    void create(TransactionPin transactionPin);
}
