package com.zipcoder.cryptonator_api.domain;

/**
 * Created by leon on 1/22/18.
 */
public class CryptoAPIResponse {

    private Ticker ticker;
    private Long timeStamp;
    private Boolean success;
    private String error;

    public CryptoAPIResponse() {
    }

    public CryptoAPIResponse(Ticker ticker, Long timeStamp, Boolean success, String error) {
        this.ticker = ticker;
        this.timeStamp = timeStamp;
        this.success = success;
        this.error = error;
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

    /*public CryptoEntity createEntity() {
        CryptoEntity entity = new CryptoEntity();
        entity.setTicker(this.ticker);
        entity.setTimeStamp(this.timeStamp);
        entity.setSuccess(this.success);
        entity.setError(this.error);

        return entity;
    }*/
}
