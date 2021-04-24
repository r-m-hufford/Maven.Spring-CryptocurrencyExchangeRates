package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.domain.CryptoEntity;
import com.zipcoder.cryptonator_api.domain.enums.Currency;
import com.zipcoder.cryptonator_api.repositories.CryptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class DBManager {

    private CryptoAPIService service;
    private CryptoRepository repository;

    @Autowired
    public DBManager(CryptoAPIService service, CryptoRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @Scheduled (fixedRate = 300000)
    @PostConstruct // this method runs as soon as I run the app. can be used for set ups. i.e crypto informaiton
    public void initializeDatabase() {
        //use api to service to get info on my enum id'd cryptos
        for (Currency base : Currency.values()) {
            for (Currency target : Currency.values()) {
                if (base != target) {
                    repository.save(new CryptoEntity(service.getConversion(base, target)));
                }
            }
        }
    }

    // fetch from API the items I have saved as enums
    // conversion algo
    // replace in database
    // if I do not want historical information




    //
}
