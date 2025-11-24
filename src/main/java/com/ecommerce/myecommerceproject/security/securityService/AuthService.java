package com.ecommerce.myecommerceproject.security.securityService;

import com.ecommerce.myecommerceproject.payload.AuthenticationResult;
import com.ecommerce.myecommerceproject.dto.request.LoginRequest;
import com.ecommerce.myecommerceproject.dto.request.SignupRequest;
import com.ecommerce.myecommerceproject.dto.response.MessageResponse;
import com.ecommerce.myecommerceproject.dto.response.UserInfoResponse;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {

    AuthenticationResult login(LoginRequest loginRequest);

    ResponseEntity<MessageResponse> register(SignupRequest signUpRequest);

    UserInfoResponse getCurrentUserDetails(Authentication authentication);

    ResponseCookie logoutUser();

    UserInfoResponse getAllSellers(Pageable pageable);
}
