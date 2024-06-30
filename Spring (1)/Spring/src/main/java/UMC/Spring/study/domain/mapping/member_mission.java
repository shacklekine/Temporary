package UMC.Spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import UMC.Spring.study.domain.Member;
import UMC.Spring.study.domain.Mission;
import UMC.Spring.study.domain.common.BaseEntity;
import UMC.Spring.study.domain.enums.mission_status;



@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class member_mission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15)")
    private mission_status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;
}
