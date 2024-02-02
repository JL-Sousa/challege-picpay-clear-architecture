package com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase;

import com.tecsoftblue.picpaycleararchitecture.core.domain.User;

public interface FindUserByTaxNumberUseCase {

    User findByTaxNumber(String taxNumber);
}
