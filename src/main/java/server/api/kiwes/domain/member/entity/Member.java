package server.api.kiwes.domain.member.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import server.api.kiwes.domain.category.entity.Category;
import server.api.kiwes.domain.group_member.entity.GroupMember;
import server.api.kiwes.domain.language.entity.Language;
import server.api.kiwes.domain.like.entity.Likes;
import server.api.kiwes.global.entity.Gender;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    private String profileImg;
    private String nickName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String birth;
    private String introduction;
    private String nationality;

    @OneToMany(mappedBy = "member")
    private List<Category> categoryList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Language> languageList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<GroupMember> groupMemberList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Likes> likesList = new ArrayList<>();





}
