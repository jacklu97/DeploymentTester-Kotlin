package com.github.jacklu.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @GetMapping("/")
    fun home(): String {
        return "Hello, World from Kotlin!"
    }
}