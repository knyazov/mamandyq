package online.akzholedu.kz.mamandyq.api;

import online.akzholedu.kz.mamandyq.entities.SpecialityQuiz;
import online.akzholedu.kz.mamandyq.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/mamandyq")
public class RestController {
    @Autowired
    private SpecialityService specialityService;

    @GetMapping("/")
    public ResponseEntity<List<SpecialityQuiz>> getQuiz(){
        return new ResponseEntity<>(specialityService.allQuestions(), HttpStatus.OK);
    }
}
