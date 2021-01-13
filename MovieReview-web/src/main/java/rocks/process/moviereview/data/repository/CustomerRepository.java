/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.moviereview.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rocks.process.moviereview.data.domain.Review;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Review, Long> {
	Review findByMobile(String mobile);
	Review findByMobileAndIdNot(String mobile, Long agentId);
	List<Review> findByAgentId(Long agentId);
	List<Review> findByIdAndAgentId(Long customerId, Long agentId);
}