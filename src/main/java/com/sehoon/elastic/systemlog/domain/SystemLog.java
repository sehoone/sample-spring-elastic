package com.sehoon.elastic.systemlog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * WAS 로그 document(엘라스틱 서치)
 */
@Document(indexName = "log_was*", createIndex = false)
public class SystemLog {

    @Id
    @Field(type = FieldType.Text, name = "_id")
    private String id;

    @Field(type = FieldType.Date, name = "@timestamp")
    private String logDate;

    @Field(type = FieldType.Text, name = "message")
    private String bodyMessage;

    @Field(type = FieldType.Text, name = "url")
    private String url;

    @Field(type = FieldType.Text, name = "level")
    private String level;

    @Field(type = FieldType.Keyword, name = "system_name")
    private String systemName;

    @Field(type = FieldType.Text, name = "request_ip")
    private String requestIp;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogDate() {
        return this.logDate;
    }

    public void setLogDate(String logDate) {
        this.logDate = logDate;
    }

    public String getBodyMessage() {
        return this.bodyMessage;
    }

    public void setBodyMessage(String bodyMessage) {
        this.bodyMessage = bodyMessage;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSystemName() {
        return this.systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getRequestIp() {
        return this.requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }
}
