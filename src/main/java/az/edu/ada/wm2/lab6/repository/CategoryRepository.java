package az.edu.ada.wm2.lab6.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import az.edu.ada.wm2.lab6.model.Category;

public interface CategoryRepository  extends JpaRepository<Category, UUID> {
    
}
