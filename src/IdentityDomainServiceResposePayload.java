package com.csp.payloads;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IdentityDomainServiceResposePayload {
    private String token;
    private String code;
    private String message;
    private String status;
}
