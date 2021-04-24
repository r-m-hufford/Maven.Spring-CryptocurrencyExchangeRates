package com.zipcoder.cryptonator_api.repositories;

import com.zipcoder.cryptonator_api.domain.CryptoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 1/22/18.
 */

@Repository
public interface CryptoRepository extends JpaRepository<CryptoEntity, Long> {
    //@Query (value = , nativeQuery = true)
    //can feed these back to my controller
    //i.e. select * from currency table where base currency is BTC
}
