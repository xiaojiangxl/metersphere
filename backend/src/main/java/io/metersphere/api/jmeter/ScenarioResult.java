package io.metersphere.api.jmeter;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ScenarioResult {

    private String id;

    private String name;

    private long responseTime;

    private int error = 0;

    private int success = 0;

    private int totalAssertions = 0;

    private int passAssertions = 0;

    private final List<RequestResult> requestResults = new ArrayList<>();

    public void addResponseTime(long time) {
        this.responseTime += time;
    }

    public void addError(int count) {
        this.error += count;
    }

    public void addSuccess() {
        this.success++;
    }

    public void addTotalAssertions(int count) {
        this.totalAssertions += count;
    }

    public void addPassAssertions(int count) {
        this.passAssertions += count;
    }
}
