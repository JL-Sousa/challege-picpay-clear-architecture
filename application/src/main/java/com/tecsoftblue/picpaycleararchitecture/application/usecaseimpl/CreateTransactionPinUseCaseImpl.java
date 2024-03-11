package com.tecsoftblue.picpaycleararchitecture.application.usecaseimpl;

import com.tecsoftblue.picpaycleararchitecture.application.gateway.CreateTransactionPinGateway;
import com.tecsoftblue.picpaycleararchitecture.core.domain.TransactionPin;
import com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase.CreateTransactionPinUseCase;

public class CreateTransactionPinUseCaseImpl implements CreateTransactionPinUseCase {
    private final CreateTransactionPinGateway createTransactionPinGateway;

    public CreateTransactionPinUseCaseImpl(CreateTransactionPinGateway createTransactionPinGateway) {
        this.createTransactionPinGateway = createTransactionPinGateway;
    }

    @Override
    public void create(TransactionPin transactionPin) {
        createTransactionPinGateway.create(transactionPin);
    }
}
