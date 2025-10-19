package com.schweizer.urlshortener;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.schweizer.urlshortener.domain.entities.ShortUrl;
import com.schweizer.urlshortener.services.ShortUrlService;

@Controller
public class HomeController {
	
	private final ShortUrlService shortUrlService;

	public HomeController(ShortUrlService shortUrlService){
		this.shortUrlService = shortUrlService;
	}

	@GetMapping("/")
	public String home(Model model){
		List<ShortUrl> shortUrls = shortUrlService.findAllPublicShortUrls();
		model.addAttribute("shortUrls", shortUrls);
		model.addAttribute("baseUrl", "http://localhost:8080");
		return "index";
	}
}
