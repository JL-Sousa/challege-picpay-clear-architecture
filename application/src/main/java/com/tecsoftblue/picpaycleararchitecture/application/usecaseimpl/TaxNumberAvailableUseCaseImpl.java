package com.tecsoftblue.picpaycleararchitecture.application.usecaseimpl;

import com.tecsoftblue.picpaycleararchitecture.application.gateway.TaxNumberAvailableGateway;
import com.tecsoftbluecom.tecsoftblue.picpaycleararchitecture.usecase.TaxNumberAvailableUseCase;

public class TaxNumberAvailableUseCaseImpl implements TaxNumberAvailableUseCase {
    private final TaxNumberAvailableGateway taxNumberAvailableGateway;

    public TaxNumberAvailableUseCaseImpl(TaxNumberAvailableGateway taxNumberAvailableGateway) {
        this.taxNumberAvailableGateway = taxNumberAvailableGateway;
    }

    @Override
    public Boolean taxNumberAvailable(String taxNumber) {
        return taxNumberAvailableGateway.taxNumberAvailable(taxNumber);
    }
}
