package org.spring.jpa2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.spring.jpa2.dto.MemberDto;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="member_tb")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    @Column(name = "member_Id")     // 칼럼명
    private Long id;

    @Column(nullable = false, length = 255 , unique = true)
    private String email;
    @Column(nullable = false, length = 255)
    private String userName;
    @Column(nullable = false, length = 45)
    private String userPw;




    // Entity > Dto 변환

    public static MemberDto toMemberDto(MemberEntity memberentity){

        MemberDto memberDto = new MemberDto();
        memberDto.setId(memberentity.getId());
        memberDto.setUserName(memberentity.getUserName());
        memberDto.setUserPw(memberentity.getUserPw());
        memberDto.setEmail(memberentity.getEmail());

        return memberDto;
    }



    
    
}
