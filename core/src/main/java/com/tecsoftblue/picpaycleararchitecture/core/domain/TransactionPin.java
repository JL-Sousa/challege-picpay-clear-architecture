package com.tecsoftblue.picpaycleararchitecture.core.domain;

import com.tecsoftblue.picpaycleararchitecture.core.exception.enums.ErrorCodeEnum;
import com.tecsoftblue.picpaycleararchitecture.core.exception.TransactionPinException;

import java.time.LocalDateTime;

public class TransactionPin {
    private Long id;
    private User user;
    private String pin;
    private Integer attempt;
    private boolean blocked;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public TransactionPin() {
    }

    public TransactionPin(User user, String pin) throws TransactionPinException {
        this.user = user;
        setPin(pin);
        this.attempt = 3;
        this.blocked = false;
        this.createdAt = LocalDateTime.now();
    }

    public TransactionPin(Long id, User user, String pin, Integer attempt, boolean blocked, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.user = user;
        this.pin = pin;
        this.attempt = attempt;
        this.blocked = blocked;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) throws TransactionPinException {
        pinIsValid(pin);
        this.pin = pin;
    }

    private void pinIsValid(String pin) throws TransactionPinException {
        if (pin.length() != 8) {
            throw new TransactionPinException(ErrorCodeEnum.TRP0001.getMessage(), ErrorCodeEnum.TRP0001.getCode());
        }
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
