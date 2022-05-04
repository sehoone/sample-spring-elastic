package com.sehoon.elastic.systemlog.vm;

import java.time.Instant;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 시스템 로그 조회 요청모델
 */
@Data
public class SystemLogSearchVM {

    @NotNull
    private Instant strDate; // 시작일자

    @NotNull
    private Instant endDate; // 종료일자

    private String url; // url

    private String bodyMessage; //로그body메세지
}
