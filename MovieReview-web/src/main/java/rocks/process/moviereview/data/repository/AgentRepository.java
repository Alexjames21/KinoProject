/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.moviereview.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rocks.process.moviereview.data.domain.User;

@Repository
public interface AgentRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	User findByEmailAndIdNot(String email, Long agentId);
}
