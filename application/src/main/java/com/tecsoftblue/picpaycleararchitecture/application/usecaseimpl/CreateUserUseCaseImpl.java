package com.tecsoftblue.picpaycleararchitecture.application.usecaseimpl;

import com.tecsoftblue.picpaycleararchitecture.application.gateway.CreateUserGateway;
import com.tecsoftblue.picpaycleararchitecture.core.domain.TransactionPin;
import com.tecsoftblue.picpaycleararchitecture.core.domain.User;
import com.tecsoftblue.picpaycleararchitecture.core.domain.Wallet;
import com.tecsoftblue.picpaycleararchitecture.core.exception.EmailException;
import com.tecsoftblue.picpaycleararchitecture.core.exception.TaxNumberException;
import com.tecsoftblue.picpaycleararchitecture.core.exception.TransactionPinException;
import com.tecsoftblue.picpaycleararchitecture.core.exception.enums.ErrorCodeEnum;
import com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {


    private final TaxNumberAvaliableUseCase taxNumberAvaliableUseCase;
    private final EmailAvailableUseCase emailAvailableUseCase;
    private final CreateUserGateway createUserGateway;
    private final CreateWalletUseCase createWalletUseCase;
    private final CreateTransactionPinUseCase createTransactionPinUseCase;

    public CreateUserUseCaseImpl(
            TaxNumberAvaliableUseCase taxNumberAvaliableUseCase,
            EmailAvailableUseCase emailAvailableUseCase,
            CreateUserGateway createUserGateway,
            CreateWalletUseCase createWalletUseCase,
            CreateTransactionPinUseCase createTransactionPinUseCase) {
        this.taxNumberAvaliableUseCase = taxNumberAvaliableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
        this.createWalletUseCase = createWalletUseCase;
        this.createTransactionPinUseCase = createTransactionPinUseCase;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException {

        if (!taxNumberAvaliableUseCase.taxNumberAvaliable(user.getTaxNumber().getValue())) {
            throw new TaxNumberException(
                    ErrorCodeEnum.ON0002.getMessage(),
                    ErrorCodeEnum.ON0002.getCode());
        }
        if (!emailAvailableUseCase.emailAvailableEmail(user.getEmail())){
            throw new EmailException(
                    ErrorCodeEnum.ON0003.getMessage(),
                    ErrorCodeEnum.ON0003.getCode());
        }

        var userSaved = createUserGateway.create(user);

        createWalletUseCase.create(new Wallet(BigDecimal.ZERO, userSaved));
        createTransactionPinUseCase.create(new TransactionPin(userSaved, pin));
    }
}
