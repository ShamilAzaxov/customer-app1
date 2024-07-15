package sh.tech.customerapp1.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import sh.tech.customerapp1.dao.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
