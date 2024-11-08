package com.example.goormthon_univ_3th.domain.member.service;

import com.example.goormthon_univ_3th.domain.member.domain.Member;
import com.example.goormthon_univ_3th.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberRefreshTokenService {
    private final MemberRepository memberRepository;

    @Transactional
    public void saveRefreshToken(String refreshToken, Member member) {
        member.setRefreshToken(refreshToken);
    }

    @Transactional
    public void deleteRefreshToken(Member member) {
        member.setRefreshToken(null);
    }
}