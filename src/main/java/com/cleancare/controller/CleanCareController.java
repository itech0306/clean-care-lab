package com.cleancare.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CleanCareController {

    @GetMapping("/api/services")
    public List<String> services() {
        return List.of(
                "Home Cleaning",
                "Office Cleaning",
                "Deep Cleaning",
                "Move-in / Move-out Cleaning"
        );
    }

    @GetMapping("/api/bookings")
    public List<Map<String, Object>> bookings() {
        return List.of(
                Map.of(
                        "bookingId", 1001,
                        "customer", "Raj Patel",
                        "service", "Home Cleaning",
                        "status", "CONFIRMED"
                ),
                Map.of(
                        "bookingId", 1002,
                        "customer", "Amit Shah",
                        "service", "Deep Cleaning",
                        "status", "PENDING"
                )
        );
    }
}
