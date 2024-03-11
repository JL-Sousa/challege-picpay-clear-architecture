package com.tecsoftblue.picpaycleararchitecture.application.usecaseimpl;

import com.tecsoftblue.picpaycleararchitecture.application.gateway.EmailAvailableGateway;
import com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase.EmailAvailableUseCase;

public class EmailAvailableUseCaseImpl implements EmailAvailableUseCase {
    private final EmailAvailableGateway emailAvailableGateway;

    public EmailAvailableUseCaseImpl(EmailAvailableGateway emailAvailableGateway) {
        this.emailAvailableGateway = emailAvailableGateway;
    }

    @Override
    public Boolean emailAvailableEmail(String email) {
        return emailAvailableGateway.emailAvailable(email);
    }
}
