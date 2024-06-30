package UMC.Spring.study.repository;

import UMC.Spring.study.domain.food_category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<food_category, Long> {
}
