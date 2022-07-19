package com.example.stringboot.Bai5.Rep;

import com.example.stringboot.Bai5.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRep extends JpaRepository<Subject, Long> {
    List<Subject> findAllByOrderByIdAsc();
    Subject findByName(String name);
    Subject findBySem(Integer sem);
    Long countSubjectByName(String name);
    Long countSubjectBySem(Integer sem);

}
