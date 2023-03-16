package com.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ImKunYoung
 * @since : 2023-03-15
 * description    :
 * <p>
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-15        ImKunYoung       최초 생성
 */
@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the First Service";
    }
}
