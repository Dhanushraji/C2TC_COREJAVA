package shoppingmall_management.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shoppingmall_management.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
