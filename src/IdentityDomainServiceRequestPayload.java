package com.csp.payloads;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class IdentityDomainServiceRequestPayload {
    private String emailId;
    private String password;
}

