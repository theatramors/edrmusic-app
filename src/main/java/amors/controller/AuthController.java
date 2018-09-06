package amors.controller;

import amors.dto.AuthRequest;
import amors.dto.AuthResponse;
import amors.service.api.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {this.authService = authService;}

    @RequestMapping(value = "auth", method = RequestMethod.POST)
    public AuthResponse authenticateUser(@RequestBody AuthRequest authRequest) {
        if (authRequest != null) {
            return authService.authenticateUser(authRequest);
        }
        return new AuthResponse("Authentication failed");
    }
}
