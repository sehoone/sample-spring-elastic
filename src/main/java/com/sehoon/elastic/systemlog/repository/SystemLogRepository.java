package com.sehoon.elastic.systemlog.repository;

import java.time.Instant;

import com.sehoon.elastic.systemlog.domain.SystemLog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data elastic repository for the SystemLog entity.
 */
@Repository
public interface SystemLogRepository extends ElasticsearchRepository<SystemLog, Long> {
    public Page<SystemLog> findByUrlAndBodyMessageAndLogDateBetween(
        String url,
        String bodyMessage,
        Instant strDate,
        Instant endDate,
        Pageable pageable
    );

    public Page<SystemLog> findByUrlAndLogDateBetween(String url, Pageable pageable, Instant strDate, Instant endDate);

    public Page<SystemLog> findByBodyMessageAndLogDateBetween(String bodyMessage, Instant strDate, Instant endDate, Pageable pageable);

    public Page<SystemLog> findByLogDateBetween(Instant strDate, Instant endDate, Pageable pageable);
}
