package guru.springfamework.repositories;

import guru.springfamework.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 9/24/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByLastName(String lastName);

}
