package io.gp.bsp.webmvc.controller.model;

import com.fasterxml.jackson.annotation.*;

/**
 * https://github.com/FasterXML/jackson-annotations/wiki/Jackson-Annotations
 * Jackson Library
 */
public class SampleRequest {
    /**
     * JsonProperty(parameterName) : JSON serialization, deserialization 시 parameterName으로 해당 필드 매핑
     * ex. request : {sample : "sampleTest"} -> sampleTest로 매핑 -> response : {sample : "sampleTest"}
     */
    @JsonProperty("sample")
    private final String test;

    /**
     * JsonAlias(parameterName) : parameterName으로 해당 필드 매핑
     * 다만, 마지막에 온 요청값으로 매핑됨
     * ex. aLong:123, bLong:1234 -> 1234로 매핑
     */
    @JsonAlias("bLong")
    private final long aLong;

    /**
     * JsonCreateor : JSON deserialization 시 해당 생성자를 사용하도록 강제
     * @param test
     * @param aLong
     */
    @JsonCreator
    public SampleRequest(String test, long aLong) {
        this.test = test;
        this.aLong = aLong;
    }

    public String getTest() {
        return test;
    }

    public long getaLong() {
        return aLong;
    }
}
