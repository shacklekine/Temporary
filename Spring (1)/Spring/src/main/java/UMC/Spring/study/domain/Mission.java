package UMC.Spring.study.domain;

import UMC.Spring.study.domain.common.BaseEntity;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import UMC.Spring.study.domain.enums.Gender;
import UMC.Spring.study.domain.enums.member_status;
import UMC.Spring.study.domain.enums.social_type;
import UMC.Spring.study.domain.mapping.member_agree;
import UMC.Spring.study.domain.mapping.member_mission;
import UMC.Spring.study.domain.mapping.member_prefer;
import UMC.Spring.study.domain.store;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer reward;

    private LocalDate deadline;

    @Column(columnDefinition = "TEXT")
    private String missionSpec;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id")
    private store store;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<member_mission> memberMissionList = new ArrayList<>();
}
