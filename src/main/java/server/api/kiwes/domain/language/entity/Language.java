package server.api.kiwes.domain.language.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import server.api.kiwes.domain.group.entity.Group;
import server.api.kiwes.domain.member.entity.Member;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Language {

    private Long languageId;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_Id")
    private Group group;
}
