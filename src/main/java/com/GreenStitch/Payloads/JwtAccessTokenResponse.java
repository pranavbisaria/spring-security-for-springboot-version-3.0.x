package com.GreenStitch.Payloads;

import com.GreenStitch.Models.Role;

import java.util.Set;

public record JwtAccessTokenResponse (
    String accessToken,
    String firstname,
    String lastname,
    String Email,
    Set<Role> roles
){}
