package com.zipcoder.cryptonator_api.domain;

import com.zipcoder.cryptonator_api.domain.enums.Currency;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Ticker {


    private Currency base; // change to enum
    private Currency target; // change to enum
    private Double price;
    private Double volume;
    private Double change;

    public Ticker() {
    }

    public Ticker(Currency base, Currency target, Double price, Double volume, Double change) {
        this.base = base;
        this.target = target;
        this.price = price;
        this.volume = volume;
        this.change = change;
    }

    public Currency getBase() {
        return base;
    }

    public void setBase(Currency base) {
        this.base = base;
    }

    public Currency getTarget() {
        return target;
    }

    public void setTarget(Currency target) {
        this.target = target;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }
}
