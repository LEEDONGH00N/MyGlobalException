package com.example.exception.controller;

import com.example.exception.common.ApiResponse;
import com.example.exception.service.TempService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.exception.temp.TempRequest.*;

@RestController
@RequiredArgsConstructor
public class TempController {

    private final TempService tempService;

    @GetMapping("/binding")
    public ApiResponse<?> bindingTest(@Valid @RequestBody TempLoginRequest request){
        return ApiResponse.onSuccess(tempService.logic(request));
    }

    @GetMapping("/search")
    public ApiResponse<?> validationTest(@RequestParam String keyword){
        return ApiResponse.onSuccess(tempService.searchEngine(keyword));
    }
}