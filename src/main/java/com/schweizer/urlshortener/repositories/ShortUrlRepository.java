package com.schweizer.urlshortener.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.schweizer.urlshortener.domain.entities.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

	@Query("select su from ShortUrl su where su.isPrivate = false order by su.createdAt desc")
	List<ShortUrl> findPublicShortUrls();
}
