package com.sehoon.elastic.systemlog.controller;

import javax.validation.Valid;

import com.sehoon.elastic.systemlog.service.SystemLogService;
import com.sehoon.elastic.systemlog.vm.SystemLogSearchVM;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/system-log")
public class SystemLogController {

    private final SystemLogService systemLogService;

    public SystemLogController(SystemLogService systemLogService) {
        this.systemLogService = systemLogService;
    }

    /**
     * {@code GET  /} : 시스템 로그 조회
     *
     * @param PageViewSearchVM the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of adminAccounts in body.
     */
    @GetMapping
    public void getSystemLog(
        @Valid @ParameterObject SystemLogSearchVM systemLogSearchVM,
        @ParameterObject Pageable pageable
    ) {
      log.debug("request getSystemLog");
        // 시스템 로그 조회
        systemLogService.searchSystemLog(
            systemLogSearchVM.getStrDate(),
            systemLogSearchVM.getEndDate(),
            systemLogSearchVM.getUrl(),
            systemLogSearchVM.getBodyMessage(),
            pageable
        );

    }
}
