/**
 * 
 */
package com.pearl.spring.repository;

import com.pearl.spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Meow
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
