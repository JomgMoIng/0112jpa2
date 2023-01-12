package org.spring.jpa2.dto;

import lombok.*;
import org.spring.jpa2.entity.MemberEntity;

import javax.persistence.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDto {

    private Long id;
    private String email;
    private String userName;
    private String userPw;



    // Dto > Entity 변환

    public static MemberEntity toMemberEntity(MemberDto memberDto){

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDto.getId());
        memberEntity.setUserName(memberDto.getUserName());
        memberEntity.setUserPw(memberDto.getUserPw());
        memberEntity.setEmail(memberDto.getEmail());

        return memberEntity;
    }








}
