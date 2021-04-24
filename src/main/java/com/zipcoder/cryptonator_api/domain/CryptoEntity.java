package com.zipcoder.cryptonator_api.domain;

import javax.persistence.*;

@Entity
public class CryptoEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Embedded // gives a column to each field in the embedded object
    private Ticker ticker;
    private Long timeStamp;
    private Boolean success;
    private String error;

    public CryptoEntity() {
    }

    public CryptoEntity(Long id, Ticker ticker, Long timeStamp, Boolean success, String error) {
        this.id = id;
        this.ticker = ticker;
        this.timeStamp = timeStamp;
        this.success = success;
        this.error = error;
    }

    public CryptoEntity(CryptoAPIResponse response) {
        this.ticker = response.getTicker();
        this.timeStamp = response.getTimeStamp();
        this.success = response.getSuccess();
        this.error = response.getError();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
