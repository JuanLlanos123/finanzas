package co.edu.ufps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.ufps.response.ResponseApi;

@RestController
public class StatusController {

    @GetMapping({"/", "/status"})
    public ResponseApi<String> status() {
        return new ResponseApi<>("API is running", 200, "OK");
    }
}
