package com.pos.business.serviceimpl;

import com.pos.business.service.AuthenticateService;
import com.pos.library.RestController;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateServiceImpl extends RestController implements AuthenticateService{
    
    private final String URL="http://localhost:8080/jasamedika-web/auth/sign-in";
    
    @Override
    public void authenticate(String userName, String password){
        Authenticate(URL, userName, password);
    }
    
}
