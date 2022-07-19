package com.example.stringboot.Bai5.Service;

import com.example.stringboot.Bai5.Model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {
    List<Subject> getAllSubject();
    void addSubject(Subject subject);
    void deleteSubject(Long id);
    Optional<Subject> findSubjectById(Long Id);
    Subject getOne(Long id);
    Subject findByName(String name);
    Subject findBySem(Integer sem);
    Long countTblSubjectsByName(String name);
    Long countTblSubjectsBySem(Integer sem);











}
