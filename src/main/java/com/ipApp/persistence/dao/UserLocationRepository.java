package com.ipApp.persistence.dao;

import com.ipApp.persistence.model.User;
import com.ipApp.persistence.model.UserLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
