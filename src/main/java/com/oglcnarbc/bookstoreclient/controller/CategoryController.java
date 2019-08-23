package com.oglcnarbc.bookstoreclient.controller;

import com.oglcnarbc.bookstoreclient.model.CategoryResource;
import com.oglcnarbc.bookstoreclient.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/client/categories")
    public List<CategoryResource> getAllCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("/client/categories/feign")
    public Set<CategoryResource> getCategories(){
        return categoryService.getCatetegoriesViaFeignClient();
    }
}
