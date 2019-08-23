package com.oglcnarbc.bookstoreclient.client;


import com.oglcnarbc.bookstoreclient.model.CategoryResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@FeignClient(name = "book-store")
public interface CategoryClient {

    //custom  feign build etme
    @GetMapping("/api/categories")
    Set<CategoryResource> getAllCategory();
}
