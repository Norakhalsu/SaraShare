package com.example.demo.Repository;


import com.example.demo.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.print.Doc;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Doctor findDoctorByDoctorId(Integer doctorId);
}
