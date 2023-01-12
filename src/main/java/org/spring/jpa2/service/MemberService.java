package org.spring.jpa2.service;

import lombok.RequiredArgsConstructor;
import org.spring.jpa2.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/*@RequiredArgsConstructor*/
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

/*    private final MemberRepository memberRepository;

    private MemberService(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }*/






}
