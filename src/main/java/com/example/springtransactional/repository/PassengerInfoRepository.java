package com.example.springtransactional.repository;

import com.example.springtransactional.entity.PassengerInfo;
import com.example.springtransactional.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
