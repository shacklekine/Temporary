package UMC.Spring.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import UMC.Spring.study.domain.food_category;
import UMC.Spring.study.domain.Member;
import UMC.Spring.study.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

public class member_prefer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private food_category foodCategory;

    public void setMember(Member member){
        if(this.member != null)
            member.getMemberPreferList().remove(this);
        this.member = member;
        member.getMemberPreferList().add(this);
    }

    //public void setFoodCategory(food_category foodCategory){
    //    this.foodCategory = foodCategory;
    //}
}
