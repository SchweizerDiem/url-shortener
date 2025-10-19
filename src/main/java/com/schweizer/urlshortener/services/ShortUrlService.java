package com.schweizer.urlshortener.services;

import com.schweizer.urlshortener.domain.entities.ShortUrl;
import com.schweizer.urlshortener.repositories.ShortUrlRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ShortUrlService {

	private final ShortUrlRepository shortUrlRepository;

	public ShortUrlService(ShortUrlRepository shortUrlRepository){
		this.shortUrlRepository = shortUrlRepository;
	}

	public List<ShortUrl> findAllPublicShortUrls(){
		return shortUrlRepository.findPublicShortUrls();
	}
}
