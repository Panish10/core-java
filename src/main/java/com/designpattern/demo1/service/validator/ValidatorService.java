package com.designpattern.demo1.service.validator;

import com.designpattern.demo1.dto.CreditCard;

public interface ValidatorService {

    boolean validateCard(CreditCard request);
}
