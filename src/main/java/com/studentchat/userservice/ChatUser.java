package com.studentchat.userservice;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@Container(containerName = "users")
public class ChatUser {

    @Id
    private String id;

    private String name;
    @PartitionKey
    private String major;
    private String classYear;
    private String degreeProgram;

    @Version
    private String _etag;

    public ChatUser() {
    }

    public ChatUser(String id, String _etag, String degreeProgram, String classYear, String name, String major) {
        this.id = id;
        this._etag = _etag;
        this.degreeProgram = degreeProgram;
        this.classYear = classYear;
        this.name = name;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getClassYear() {
        return classYear;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public String get_etag() {
        return _etag;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
    }

    public void set_etag(String _etag) {
        this._etag = _etag;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }
}
