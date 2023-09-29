package by.galera.wedding.controller;

import by.galera.wedding.model.ChooseDto;
import by.galera.wedding.model.WelcomeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StartController {

    @GetMapping()
    public ResponseEntity<?> chooseEndpoint() {
        WelcomeDto welcome = new WelcomeDto("/v1/api/dallas", "/v1/api/kiril", "/v1/api/congratulations");
        ChooseDto chooseDto = new ChooseDto("Просто выбирай эндпоинт", welcome);
        return ResponseEntity.ok(chooseDto);
    }

}
