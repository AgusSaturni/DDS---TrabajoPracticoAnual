
package com.krds.accuweatherapi.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Rise",
    "EpochRise",
    "Set",
    "EpochSet",
    "Phase",
    "Age"
})
public class Moon implements Serializable
{

    @JsonProperty("Rise")
    private String rise;
    @JsonProperty("EpochRise")
    private Integer epochRise;
    @JsonProperty("Set")
    private String set;
    @JsonProperty("EpochSet")
    private Integer epochSet;
    @JsonProperty("Phase")
    private String phase;
    @JsonProperty("Age")
    private Integer age;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 5390424344172578681L;

    @JsonProperty("Rise")
    public String getRise() {
        return rise;
    }

    @JsonProperty("Rise")
    public void setRise(String rise) {
        this.rise = rise;
    }

    @JsonProperty("EpochRise")
    public Integer getEpochRise() {
        return epochRise;
    }

    @JsonProperty("EpochRise")
    public void setEpochRise(Integer epochRise) {
        this.epochRise = epochRise;
    }

    @JsonProperty("Set")
    public String getSet() {
        return set;
    }

    @JsonProperty("Set")
    public void setSet(String set) {
        this.set = set;
    }

    @JsonProperty("EpochSet")
    public Integer getEpochSet() {
        return epochSet;
    }

    @JsonProperty("EpochSet")
    public void setEpochSet(Integer epochSet) {
        this.epochSet = epochSet;
    }

    @JsonProperty("Phase")
    public String getPhase() {
        return phase;
    }

    @JsonProperty("Phase")
    public void setPhase(String phase) {
        this.phase = phase;
    }

    @JsonProperty("Age")
    public Integer getAge() {
        return age;
    }

    @JsonProperty("Age")
    public void setAge(Integer age) {
        this.age = age;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
