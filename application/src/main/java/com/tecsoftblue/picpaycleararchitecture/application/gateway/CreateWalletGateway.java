package com.tecsoftblue.picpaycleararchitecture.application.gateway;

import com.tecsoftblue.picpaycleararchitecture.core.domain.Wallet;

public interface CreateWalletGateway {
    void create(Wallet wallet);
}
