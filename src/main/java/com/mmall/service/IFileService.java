package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by kjs on 2019/4/10
 */
public interface IFileService {
    String upload(MultipartFile file , String path);
}
