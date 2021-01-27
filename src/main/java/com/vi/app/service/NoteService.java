package com.vi.app.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vi.app.dao.NoteRepository;
import com.vi.app.domain.Note;

@Service
public class NoteService {
  @Autowired
  private NoteRepository noteRepo;
  static Logger logger = LogManager.getLogger(NoteService.class);
  
  public List<Note> getAllNotes(){
	  List<Note> notes = noteRepo.findAll();
	  notes.forEach(logger::debug);
	  return notes;
  }
}
