package com.schweizer.urlshortener;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.schweizer.urlshortener.domain.entities.ShortUrl;
import com.schweizer.urlshortener.repositories.ShortUrlRepository;

@Controller
public class HomeController {
	
	private final ShortUrlRepository shortUrlRepository;

	public HomeController(ShortUrlRepository shortUrlRepository){
		this.shortUrlRepository = shortUrlRepository;
	}

	@GetMapping("/")
	public String home(Model model){
		List<ShortUrl> shortUrls = shortUrlRepository.findPublicShortUrls();
		model.addAttribute("shortUrls", shortUrls);
		model.addAttribute("baseUrl", "http://localhost:8080");
		return "index";
	}
}
