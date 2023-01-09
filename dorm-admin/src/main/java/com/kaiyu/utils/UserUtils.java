package com.kaiyu.utils;

import com.kaiyu.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

    private UserUtils() {
    }

    public static User getCurrentUser() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
