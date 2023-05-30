package com.GreenStitch.Service;

import com.GreenStitch.Payloads.EmailDto;
import com.GreenStitch.Payloads.ForgetPassword;
import com.GreenStitch.Payloads.OtpDto;
import com.GreenStitch.Payloads.UserDto;
import com.GreenStitch.Security.JwtAuthRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;

import java.util.concurrent.ExecutionException;

public interface AuthService {
    ResponseEntity<?> LoginAPI(JwtAuthRequest request, Integer RoleID);
    ResponseEntity<?> registerEmail(EmailDto emailDto) throws Exception;
    ResponseEntity<?> verifyToRegister(OtpDto otpDto) throws ExecutionException;
    ResponseEntity<?> signupUser(UserDto userDto) throws ExecutionException;
    ResponseEntity<?> verifyOTPPasswordChange(OtpDto otpDto) throws ExecutionException;
    ResponseEntity<?> resetPassword(ForgetPassword forgetPassword) throws ExecutionException;
    ResponseEntity<?> sendOTPForget(EmailDto emailDto) throws Exception;
}
