package org.flaad.dsm.client.request;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CameraListRequest {

    @Builder.Default
    int version = 9;
    @Builder.Default
    String method = "List";

    private String idList;
    private int offset;
    private int limit;
    private boolean blFromCamList;
    private boolean blIncludeDeletedCam;
    private int privCamType;
    private boolean basic;
    private boolean streamInfo;
    private boolean blPrivilege;
    private int camStm;

}
