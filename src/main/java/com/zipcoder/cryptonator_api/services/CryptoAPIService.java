package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.domain.CryptoAPIResponse;
import com.zipcoder.cryptonator_api.domain.enums.Currency;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by leon on 1/22/18.
 */
@Component
public class CryptoAPIService {

    private RestTemplate restTemplate;
    // base vs final url - or some more specific name
    private final String baseUrl = "https://api.cryptonator.com/api/ticker/";


    @Autowired
    public CryptoAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CryptoAPIResponse getConversion(Currency base, Currency target) {
        String finalUrl = baseUrl + base.toString() + "-" + target.toString();
        ResponseEntity<CryptoAPIResponse> response = restTemplate.getForEntity(finalUrl, CryptoAPIResponse.class);
        return response.getBody();
        //returning a CryptoObject as opposed to a response entity could help manage errors
    }
}
