/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package rocks.process.moviereview.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import rocks.process.moviereview.data.domain.User;
import rocks.process.moviereview.data.repository.AgentRepository;

import javax.validation.Valid;
import javax.validation.Validator;

@Service
@Validated
public class LoginService {

    @Autowired
    private AgentRepository agentRepository;
    @Autowired
    Validator validator;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void saveAgent(@Valid User agent) throws Exception {
        if (agent.getId() == null) {
            if (agentRepository.findByEmail(agent.getEmail()) != null) {
                throw new Exception("Email address " + agent.getEmail() + " already assigned another agent.");
            }
        } else if (agentRepository.findByEmailAndIdNot(agent.getEmail(), agent.getId()) != null) {
            throw new Exception("Email address " + agent.getEmail() + " already assigned another agent.");
        }
        agent.setPassword(passwordEncoder.encode(agent.getPassword()));
        agentRepository.save(agent);
    }

    public User getCurrentAgent() {
        String userEmail = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return agentRepository.findByEmail(userEmail);
    }
}
