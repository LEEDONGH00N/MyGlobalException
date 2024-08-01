package com.example.exception.temp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class TempRequest {
    public record TempLoginRequest(
            @NotBlank(message = "이메일을 입력해주세요")
            @Email(message = "이메일을 형식에 맞게 다시 입력해주세요.")
            String email,

            @NotBlank(message = "비밀번호를 입력해주세요")
            String password
    ) {}
}