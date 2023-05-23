package server.api.kiwes.domain.group.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import server.api.kiwes.domain.category.entity.Category;
import server.api.kiwes.domain.group_member.entity.GroupMember;
import server.api.kiwes.domain.language.entity.Language;
import server.api.kiwes.domain.heart.entity.Heart;
import server.api.kiwes.global.entity.Gender;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Group {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "GROUP_ID")
    private Long id;
    

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

    private Boolean isActivated;


    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Category> categories = new ArrayList<>();

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Language> languages = new ArrayList<>();

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GroupMember> groupMembers = new ArrayList<>();

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Heart> hearts = new ArrayList<>();



}
