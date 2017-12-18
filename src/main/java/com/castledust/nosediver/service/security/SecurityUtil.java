package com.castledust.nosediver.service.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public final class SecurityUtil {

    private SecurityUtil() {}

    public static boolean isLoggedIn() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return (authentication != null && authentication.isAuthenticated());
    }

    public static boolean hasRole(String role) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return (authentication != null && authentication.getAuthorities().contains(new GrantedAuthorityImpl(role)));
    }
}
