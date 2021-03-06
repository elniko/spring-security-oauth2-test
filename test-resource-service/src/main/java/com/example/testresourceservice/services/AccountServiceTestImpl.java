package com.example.testresourceservice.services;

import com.example.testresourceservice.stet.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccountServiceTestImpl implements AccountService{

    Map<String, List<AccountResource>> accounts = new HashMap<>();
    {
        AccountResource acc1 = new AccountResource();
            GenericIdentification gi1 = new GenericIdentification();
            gi1.setSchemeName("BANK");
            gi1.setIssuer("SG");
            gi1.setIdentification(UUID.randomUUID().toString());
        acc1.setAccountId(new AccountIdentification().iban("USA0000000000000000").other(gi1));
        acc1.setBicFi("LOLbic");
        acc1.setCurrency("EUR");
        acc1.setDetails("to make America great again");
        acc1.setName("Donald Trump");
        acc1.setProduct("American dream");
        acc1.setPsuStatus("Account Holder");
        acc1.setResourceId("000001");

            BalanceResource br1 = new BalanceResource();
            br1.setName("BalanceResource1");
            br1.setBalanceAmount(new AmountType().amount("99999999999999999999999999").currency("EUR"));

        acc1.addBalancesItem(br1);
        acc1.setUsage(AccountResource.UsageEnum.PRIV);
        acc1.setCashAccountType(AccountResource.CashAccountTypeEnum.CACC);


        AccountResource acc3 = new AccountResource();
        GenericIdentification gi3 = new GenericIdentification();
        gi3.setSchemeName("BANK");
        gi3.setIssuer("SG");
        gi3.setIdentification(UUID.randomUUID().toString());
        acc3.setAccountId(new AccountIdentification().iban("USA0000000000000001").other(gi1));
        acc3.setBicFi("bic");
        acc3.setCurrency("EUR");
        acc3.setDetails("to make color revolutions");
        acc3.setName("Donald Trump");
        acc3.setProduct("Revolution activists");
        acc3.setPsuStatus("Account Holder");
        acc3.setResourceId("000002");

        BalanceResource br3 = new BalanceResource();
        br3.setName("BalanceResource2");
        br3.setBalanceAmount(new AmountType().amount("10000000000").currency("EUR"));

        acc3.addBalancesItem(br3);
        acc3.setUsage(AccountResource.UsageEnum.PRIV);
        acc3.setCashAccountType(AccountResource.CashAccountTypeEnum.CACC);



        List<AccountResource> res = new ArrayList<>();
        res.add(acc1);
        res.add(acc3);

        AccountResource acc2 = new AccountResource();
        GenericIdentification gi2 = new GenericIdentification();
        gi2.setSchemeName("BANK");
        gi2.setIssuer("SG");
        gi2.setIdentification(UUID.randomUUID().toString());
        acc2.setAccountId(new AccountIdentification().iban("RU0000000000000000").other(gi1));
        acc2.setBicFi("LOLbic2");
        acc2.setCurrency("EUR");
        acc2.setDetails("to conquer the whole world");
        acc2.setName("Vladimir Putin");
        acc2.setProduct("GAZPROM");
        acc2.setPsuStatus("Account Holder");
        acc2.setResourceId("000002");

        BalanceResource br2 = new BalanceResource();
        br2.setName("BalanceResource1");
        br2.setBalanceAmount(new AmountType().amount("5000000000000000").currency("EUR"));

        acc2.addBalancesItem(br1);
        acc2.setUsage(AccountResource.UsageEnum.PRIV);
        acc2.setCashAccountType(AccountResource.CashAccountTypeEnum.CACC);

        List<AccountResource> res2 = new ArrayList<>();
        res2.add(acc2);

        accounts.put("trump", res);
        accounts.put("putin", res2);
    }

    @Override
    public HalAccounts getAccounts(String sub) {
        HalAccounts ha = new HalAccounts();
        if(accounts.containsKey(sub)) {
            return ha.accounts(accounts.get(sub));
        }
        return ha;
    }

    @Override
    public List<AccountResource> getAccountResources(String sub) {
        return accounts.getOrDefault(sub, new ArrayList<>());
    }

}
