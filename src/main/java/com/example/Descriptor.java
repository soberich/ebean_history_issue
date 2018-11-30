package com.example;

import com.fasterxml.jackson.databind.JsonNode;
import io.ebean.annotation.DbArray;
import io.ebean.annotation.DbJsonB;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public abstract class Descriptor extends Identity<Long> {
    private static final long serialVersionUID = 1L;

    @Id
    protected final Long         id;
    protected final String       type;
    protected final String       severity;
    protected final String       providerHttpLocation;
    protected final String       jsonPath;
    @DbArray(length = 500)
    protected final List<String> argsJsonPaths;
    @DbJsonB(length = 1000)
    protected final JsonNode     request;

    public Descriptor(Long id, String type, String severity, String providerHttpLocation, String jsonPath, List<String> argsJsonPaths, JsonNode request) {
        this.id = id;
        this.type = type;
        this.severity = severity;
        this.providerHttpLocation = providerHttpLocation;
        this.jsonPath = jsonPath;
        this.argsJsonPaths = argsJsonPaths;
        this.request = request;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSeverity() {
        return severity;
    }

    public String getProviderHttpLocation() {
        return providerHttpLocation;
    }

    public String getJsonPath() {
        return jsonPath;
    }

    public List<String> getArgsJsonPaths() {
        return argsJsonPaths;
    }

    public JsonNode getRequest() {
        return request;
    }

    public enum Severity {
        ERROR,
        WARNING,
        NONE
    }
}
