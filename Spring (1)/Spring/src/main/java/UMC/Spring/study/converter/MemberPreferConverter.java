package UMC.Spring.study.converter;


import UMC.Spring.study.domain.food_category;
import UMC.Spring.study.domain.mapping.member_prefer;

import java.util.List;
import java.util.stream.Collectors;

public class MemberPreferConverter {

    public static List<member_prefer> toMemberPreferList(List<food_category> foodCategoryList){

        return foodCategoryList.stream()
                .map(foodCategory ->
                        member_prefer.builder()
                                .foodCategory(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}
