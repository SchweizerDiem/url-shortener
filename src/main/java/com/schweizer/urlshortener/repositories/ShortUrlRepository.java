package com.schweizer.urlshortener.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.schweizer.urlshortener.domain.entities.ShortUrl;

public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {


}
