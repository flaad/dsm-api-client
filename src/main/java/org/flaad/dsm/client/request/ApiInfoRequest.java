package org.flaad.dsm.client.request;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ApiInfoRequest {

    @Builder.Default
    int version = 1;
    @Builder.Default
    String method = "query";

    private String query;

}
