package com.jdc;

import java.util.List;
import java.util.Optional;

record ServerInstance(String nodeId, String region, int cpuLoad, boolean isActive){}
public class FindingTerminalExample {
    static void main() {
        List<ServerInstance> clusters = List.of(
                new ServerInstance("SG-01","AP-SOUTH",85,true),
                new ServerInstance("SG-02","AP-SOUTH",35,true),
                new ServerInstance("SG-03","AP-SOUTH",20,true)

        );

        Optional<ServerInstance> primaryTarget = clusters
                .stream()
                .filter(s -> s.isActive() && s.cpuLoad() < 50)
                .findFirst();

        primaryTarget.ifPresentOrElse(s -> {
            System.out.println("Routed to First Available: " + s.nodeId());
        }, () -> {
            System.out.println("No server available!");
        });
    }
}
