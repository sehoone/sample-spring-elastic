package com.sehoon.elastic.systemlog.service;

import java.time.Instant;

import com.sehoon.elastic.systemlog.repository.SystemLogRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * Service Implementation for managing {@link AdminAccount}.
 */
@Slf4j
@Service
public class SystemLogService {

    private final SystemLogRepository systemLogRepository;

    public SystemLogService(SystemLogRepository systemLogRepository) {
        this.systemLogRepository = systemLogRepository;
    }

    /**
     * findSystemLogByTimestamp
     * 시스템로그 조회 by 시간
     */
    public void searchSystemLog(Instant strDate, Instant endDate, String url, String bodyMessage, Pageable pageable) {
        log.debug(systemLogRepository.findByLogDateBetween(strDate, endDate, pageable).toString());
    }

    
}
