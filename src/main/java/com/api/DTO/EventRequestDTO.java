package com.api.DTO;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public record EventRequestDTO(String title, String description, Long date,
                              String city, String uf, boolean remote,
                              String eventUrl, MultipartFile image) {
}
