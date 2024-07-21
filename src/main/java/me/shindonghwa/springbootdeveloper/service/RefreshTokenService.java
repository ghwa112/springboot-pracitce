package me.shindonghwa.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.shindonghwa.springbootdeveloper.domain.RefreshToken;
import me.shindonghwa.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshtoken) {
        return refreshTokenRepository.findByRefreshToken(refreshtoken)
                .orElseThrow(()-> new IllegalStateException("Unexpected token"));
    }
}