package az.edu.ada.wm2.lab6.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import az.edu.ada.wm2.lab6.model.Product;

public interface CategoryRepository  extends JpaRepository<Product, UUID> {
    
}
