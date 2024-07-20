package me.shindonghwa.springbootdeveloper.repository;


import me.shindonghwa.springbootdeveloper.domain.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository {
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
    Optional<RefreshToken> findByUserId(Long userId);

}
