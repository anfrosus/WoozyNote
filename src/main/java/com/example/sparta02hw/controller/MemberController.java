package com.example.sparta02hw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MemberController {

    @PostMapping("/api/members")

    @GetMapping("/api/members")

    @PutMapping("/api/members/{id}")

    @DeleteMapping("/api/members/{id}")

}
