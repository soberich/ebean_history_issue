package com.example;

import com.fasterxml.jackson.databind.JsonNode;
import io.ebean.Finder;
import io.ebean.annotation.Cache;
import io.ebean.annotation.History;

import javax.persistence.Entity;
import java.util.List;

@Entity
@History //HERE
@Cache(enableQueryCache = true)
public class GeneralDescriptor extends Descriptor {
    private static final long serialVersionUID = 1L;

    public static final Finder<Long, GeneralDescriptor> find = new Finder<>(GeneralDescriptor.class);

    public GeneralDescriptor(Long id, String type, String severity, String providerHttpLocation, String jsonPath, List<String> argsJsonPaths, JsonNode request) {
        super(id, type, severity, providerHttpLocation, jsonPath, argsJsonPaths, request);
    }
}
