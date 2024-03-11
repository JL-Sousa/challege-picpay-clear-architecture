package com.tecsoftblue.picpaycleararchitecture.application.usecaseimpl;

import com.tecsoftblue.picpaycleararchitecture.application.gateway.CreateWalletGateway;
import com.tecsoftblue.picpaycleararchitecture.core.domain.Wallet;
import com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase.CreateWalletUseCase;

public class CreateWalletUseCaseImpl implements CreateWalletUseCase {
    private final CreateWalletGateway createWalletGateway;

    public CreateWalletUseCaseImpl(CreateWalletGateway createWalletGateway) {
        this.createWalletGateway = createWalletGateway;
    }

    @Override
    public void create(Wallet wallet) {
        createWalletGateway.create(wallet);
    }
}
