/**
 * 
 */
package com.pearl.spring;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Meow
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
