package com.oglcnarbc.bookstoreclient.service;

import com.oglcnarbc.bookstoreclient.client.CategoryClient;
import com.oglcnarbc.bookstoreclient.model.CategoryResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final RestTemplate restTemplate;
    private final CategoryClient categoryClient;

    public List<CategoryResource> getCategories(){
        return Arrays.asList(restTemplate.getForEntity("http://book-store/api/categories",CategoryResource[].class).getBody());
    }

    public Set<CategoryResource> getCatetegoriesViaFeignClient(){
        return categoryClient.getAllCategory();
    }
}
