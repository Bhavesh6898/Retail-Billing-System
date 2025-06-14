package in.bhaveshdutt.billingsoftware.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.bhaveshdutt.billingsoftware.io.CategoryRequest;
import in.bhaveshdutt.billingsoftware.io.CategoryResponse;

public interface CategoryService {


    CategoryResponse add(CategoryRequest request, MultipartFile file);

    List<CategoryResponse> read();

    void delete(String categoryId);

}
