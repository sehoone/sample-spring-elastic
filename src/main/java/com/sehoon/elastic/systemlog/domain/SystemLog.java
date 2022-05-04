package com.sehoon.elastic.systemlog.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * WAS 로그 document(엘라스틱 서치)
 */
@Document(indexName = "log_osp_was*", createIndex = false)
public class SystemLog {

    @Id
    @Field(type = FieldType.Text, name = "_id")
    private String id;

    @Field(type = FieldType.Date, name = "@timestamp")
    private String logDate;

    @Field(type = FieldType.Text, name = "body_message")
    private String bodyMessage;

    @Field(type = FieldType.Text, name = "url")
    private String url;

    @Field(type = FieldType.Text, name = "level")
    private String level;

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
}
