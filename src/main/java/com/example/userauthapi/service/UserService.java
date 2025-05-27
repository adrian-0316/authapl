package com.example.userauthapi.service;

import com.example.userauthapi.dto.JwtResponse;
import com.example.userauthapi.dto.LoginRequest;
import com.example.userauthapi.dto.RegisterRequest;

public interface UserService {
    JwtResponse register(RegisterRequest request);
    JwtResponse login(LoginRequest request);
}