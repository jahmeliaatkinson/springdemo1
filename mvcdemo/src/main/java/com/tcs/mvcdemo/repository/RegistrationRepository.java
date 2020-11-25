package com.tcs.mvcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.mvcdemo.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, String> {

}
