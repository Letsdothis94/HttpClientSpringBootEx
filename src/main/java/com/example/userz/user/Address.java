package com.example.userz.user;

public record Address(
        String street,
        String suite,
        String city,
        Geo geo
) {
}
