package server.api.kiwes.domain.group.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import server.api.kiwes.domain.category.entity.Category;
import server.api.kiwes.domain.group_member.entity.GroupMember;
import server.api.kiwes.domain.language.entity.Language;
import server.api.kiwes.domain.like.entity.Likes;
import server.api.kiwes.global.entity.Gender;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    private String date;
    private String dueTo;
    private int cost;
    private int peopleCnt;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String title;
    private String profileImg;
    private String introduction;
    private String locationKeyword;
    private String location;
    private String status;


    @OneToMany(mappedBy = "group")
    private List<Category> categoryList = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<Language> languageList = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<GroupMember> groupMemberList = new ArrayList<>();

    @OneToMany(mappedBy = "group")
    private List<Likes> likesList = new ArrayList<>();



}
