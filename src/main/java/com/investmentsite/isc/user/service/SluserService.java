package com.investmentsite.isc.user.service;

import com.investmentsite.isc.user.dao.SluserRepository;
import com.investmentsite.isc.user.domain.Sluser;
import com.investmentsite.isc.user.dto.SluserInput;
import com.investmentsite.isc.user.dto.SluserSighInDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SluserService {
    private final SluserRepository sluserRepository;

    public boolean signUp(SluserInput sluserInput){
        if (sluserInput.getPassword().equals(sluserInput.getConfirmPassword())){
            Sluser S1 = new Sluser();
            S1.setUserId(sluserInput.getUserId());
            S1.setUserName(sluserInput.getUserName());
            S1.setPassword(sluserInput.getPassword());
            this.sluserRepository.save(S1);
            return true;
        }else {
            return false;
        }
    }

    public SluserSighInDto sighIn(SluserInput sluserInput){
        Optional<Sluser> opSluser = Optional.ofNullable(sluserRepository.findByUserId(sluserInput.getUserId()));
        SluserSighInDto sluserSighInDto = new SluserSighInDto();
        if (opSluser.isPresent()){
            Sluser sluser = sluserRepository.findByUserId(sluserInput.getUserId());
            if (sluser.getPassword().equals(sluserInput.getPassword())){
                //로그인에 성공했을때만, 유저네임과 true 반환
                //실패했을땐 null과 false반환
                sluserSighInDto.setUserName(opSluser.get().getUserName());
                sluserSighInDto.setABoolean(true);
                System.out.println(sluserSighInDto);
                return sluserSighInDto;
            }else {
                sluserSighInDto.setUserName(null);
                sluserSighInDto.setABoolean(false);
                return sluserSighInDto;
            }
        }else {
            sluserSighInDto.setUserName(null);
            sluserSighInDto.setABoolean(false);
            return sluserSighInDto;
        }
    }

    public Optional sluserGet(SluserInput sluserInput){
        Optional<Sluser> opSluser = Optional.ofNullable(sluserRepository.findByUserId(sluserInput.getUserId()));
        return opSluser;
    }
}
