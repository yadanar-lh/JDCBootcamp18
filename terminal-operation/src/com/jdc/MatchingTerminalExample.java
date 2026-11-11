package com.jdc;

import java.util.List;

record DeploymentTask(String serviceName, int severity, boolean passedHealthCheck, boolean hasVulnerability){}
public class MatchingTerminalExample {
    static void main() {
        List<DeploymentTask> services = List.of(
                new DeploymentTask("Auth-Service",1,true,false),
                new DeploymentTask("Payment-Service",1,false,false),
                new DeploymentTask("Report-Service", 3,true,false)
        );

        boolean hasCriticalFailure = services
                .stream()
                .anyMatch(s -> s.severity() == 1 && !s.passedHealthCheck());

        boolean allHealthy = services
                .stream()
                .allMatch(DeploymentTask::passedHealthCheck);

        boolean securityClean = services
                .stream()
                .noneMatch(DeploymentTask::hasVulnerability);

        System.out.println("Critical Failure: " + hasCriticalFailure +
                " All Healthy: " + allHealthy +
                " Security Clean: " + securityClean);
    }
}
