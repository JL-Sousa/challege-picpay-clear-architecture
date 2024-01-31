package com.tecsoftblue.picpaycleararchitecture.core.domain;

import com.tecsoftblue.picpaycleararchitecture.core.domain.enums.TrasactionStatusEnum;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {

    private Long id;
    private Wallet fromWallet;
    private Wallet toWallet;
    private BigDecimal value;
    private TrasactionStatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Transaction() {
    }

    public Transaction(Wallet fromWallet, Wallet toWallet, BigDecimal value) {
        this.fromWallet = fromWallet;
        this.toWallet = toWallet;
        this.value = value;
        this.status = TrasactionStatusEnum.CREATED;
        this.createdAt = LocalDateTime.now();
    }

    public Transaction(Long id, Wallet fromWallet, Wallet toWallet, BigDecimal value, TrasactionStatusEnum status, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.fromWallet = fromWallet;
        this.toWallet = toWallet;
        this.value = value;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Wallet getFromWallet() {
        return fromWallet;
    }

    public void setFromWallet(Wallet fromWallet) {
        this.fromWallet = fromWallet;
    }

    public Wallet getToWallet() {
        return toWallet;
    }

    public void setToWallet(Wallet toWallet) {
        this.toWallet = toWallet;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public TrasactionStatusEnum getStatus() {
        return status;
    }

    public void setStatus(TrasactionStatusEnum status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id) && Objects.equals(fromWallet, that.fromWallet) && Objects.equals(toWallet, that.toWallet) && Objects.equals(value, that.value) && status == that.status && Objects.equals(createdAt, that.createdAt) && Objects.equals(updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromWallet, toWallet, value, status, createdAt, updateAt);
    }
}
