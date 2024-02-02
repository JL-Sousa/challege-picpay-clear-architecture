package com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase;

import com.tecsoftblue.picpaycleararchitecture.core.domain.Transaction;

public interface UserNotificationUseCase {

    Boolean notificate(Transaction transaction, String email);
}
