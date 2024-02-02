package com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase;

import com.tecsoftblue.picpaycleararchitecture.core.domain.Transaction;

public interface TransferUseCase {

    Boolean transfer(Transaction transaction);
}
