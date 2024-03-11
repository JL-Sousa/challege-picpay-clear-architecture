package com.tecsoftblue.picpaycleararchitecture.application.gateway;

import com.tecsoftblue.picpaycleararchitecture.core.domain.User;

public interface CreateUserGateway {

    User create(User user);
}
