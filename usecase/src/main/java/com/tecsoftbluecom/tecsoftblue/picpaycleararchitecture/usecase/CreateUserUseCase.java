package com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase;

import com.tecsoftblue.picpaycleararchitecture.core.domain.User;
import com.tecsoftblue.picpaycleararchitecture.core.exception.EmailException;
import com.tecsoftblue.picpaycleararchitecture.core.exception.TaxNumberException;
import com.tecsoftblue.picpaycleararchitecture.core.exception.TransactionPinException;

public interface CreateUserUseCase {

    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException;
}
