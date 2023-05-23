package server.api.kiwes.domain.group_member.entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import server.api.kiwes.domain.group.entity.Group;
import server.api.kiwes.domain.member.entity.Member;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class GroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="group_member_id")
    private Long groupMemberId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    private Boolean isHost;


}
