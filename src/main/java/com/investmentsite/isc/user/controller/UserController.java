package com.investmentsite.isc.user.controller;

import com.investmentsite.isc.user.dto.SluserInput;
import com.investmentsite.isc.user.dto.SluserSighInDto;
import com.investmentsite.isc.user.service.SluserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final SluserService sluserService;

    @PostMapping("/signUp")
    public boolean signUp(@RequestBody SluserInput sluserInput) {
        return this.sluserService.signUp(sluserInput);
    }

    @PostMapping("/signIn")
    public SluserSighInDto sighIn(@RequestBody SluserInput sluserInput){
        return this.sluserService.sighIn(sluserInput);
    }
    //    //아이디 찾기
    //    @GetMapping("/findId")
    //    public String findId(){
    //        return "";
    //    }
    //    //패스워드 찾기
    //    @PostMapping("/forgotPassword")
    //    public String forgotPassword(){
    //        return "";
    //    }

    @GetMapping("/sluserGet")
    public Optional sluserGet(@RequestBody SluserInput sluserInput){
        return this.sluserService.sluserGet(sluserInput);
    }
}
