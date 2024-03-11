package com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase;

import com.tecsoftblue.picpaycleararchitecture.core.domain.Transaction;

public interface TransactionValidateUseCase {

    Boolean validate(Transaction transaction);
}
