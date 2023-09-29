package by.galera.wedding.controller;

import by.galera.wedding.model.HelloFromKiril;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/kiril")
public class KirilController {

    @GetMapping
    public ResponseEntity<?> hi() {

        HelloFromKiril hello = new HelloFromKiril("Я лишь хочу сказать привет и крикнуть ГОРЬКО");

        return ResponseEntity.ok(hello);
    }
}
