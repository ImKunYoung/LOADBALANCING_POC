package com.example.second;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName    : com.shareincor.sharein.config
 * fileName       : ModelMapperConfiguration
 * author         : ImKunYoung
 * date           : 2023-02-16
 * description    : ModelMapper 빈 등록
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-16        ImKunYoung       최초 생성
 */
@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
