package com.vi.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vi.app.domain.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

}
