package com.csp.payloads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class ResponseStatus {
    static Function<String, String> statusCode= message-> {
       return "SC_".concat(new ArrayList<>(Arrays.asList(message.split("-"))).get(2));
    };

    public static int getResolvedStatusCode(String responseKeyword) {
        return HttpStatus.valueOf(statusCode.apply(responseKeyword)).getCode();
    }


}


