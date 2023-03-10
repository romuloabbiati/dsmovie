package com.devsuperior.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;
import com.devsuperior.dsmovie.services.ScoreService;

@RestController
@RequestMapping(path = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;

	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
		return scoreService.saveScore(dto);
	}
	
}
