package UMC.Spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import UMC.Spring.study.domain.Member;
import UMC.Spring.study.domain.terms;
import UMC.Spring.study.domain.common.BaseEntity;



@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class member_agree extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terms_id")
    private terms terms;

}