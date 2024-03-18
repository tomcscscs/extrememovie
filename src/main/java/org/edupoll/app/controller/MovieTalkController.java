package org.edupoll.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/movietalk")
@RequiredArgsConstructor

public class MovieTalkController {

	@GetMapping("/talkCommunity")
	public String showMainMovieTalkPage() {

		return "/movie/movie-talk";

	}
	
	@GetMapping("/template")
	public String showFragmentPage() {
		
		return "/fragment/template";
		
	}

}
