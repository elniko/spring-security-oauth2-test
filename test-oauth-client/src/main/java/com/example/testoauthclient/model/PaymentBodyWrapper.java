package com.example.testoauthclient.model;

import lombok.Data;

@Data
public class PaymentBodyWrapper {
    AccountResource debtor;
    AccountIdentification creditor;
    AmountType amount;
}
