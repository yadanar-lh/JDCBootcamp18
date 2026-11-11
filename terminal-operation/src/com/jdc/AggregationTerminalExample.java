package com.jdc;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

record Candidate(String name, int experienceYears , double expectedSalary){}
public class AggregationTerminalExample {
    static void main() {
        List<Candidate> candidates = List.of(
                new Candidate("Ko Aung", 5, 1800),
                new Candidate("Ma Thuza", 5, 1800),
                new Candidate("Ko Min", 8, 2500)
        );

        candidates.stream()
                .max(Comparator.comparingInt(Candidate::experienceYears))
                .ifPresent(c-> System.out.println("Most Experienced: " + c.name()));

        DoubleSummaryStatistics statistics = candidates
                .stream()
                .mapToDouble(Candidate::expectedSalary)
                .summaryStatistics();

        System.out.printf("Count: %d | Min: $%.1f | Max: $%.1f| Avg: $%.1f%n",
                statistics.getCount(),
                statistics.getMin(),
                statistics.getMax(),
                statistics.getAverage());


    }
}
