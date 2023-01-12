package org.spring.jpa2.repository;

import org.spring.jpa2.entity.MemberEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {


/*
    @Override
    Optional<MemberEntity> findById(Long aLong); //  optional (상세조회)

    @Override
    <S extends MemberEntity> S save(S entity);  //가입, 수정

    @Override
    List<MemberEntity> findAll(); // 리스트 조회

    @Override
    List<MemberEntity> findAllById(Iterable<Long> longs); // id에 해당하는 리스트 조회

    
    // 직접 생성  select * from member_tb where email=?
   Optional<MemberEntity> findByEmail(String email); // email에 해당하는 멤버 조회

    // 직접 생성 select * from member_tb where email=? or username=?
    Optional<MemberEntity> findByEmailOrUsername(String email, String username); // email이나 이름이 같은것들

*/








}
