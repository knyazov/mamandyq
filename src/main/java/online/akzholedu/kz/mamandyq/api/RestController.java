package online.akzholedu.kz.mamandyq.api;

import online.akzholedu.kz.mamandyq.entities.QuizResult;
import online.akzholedu.kz.mamandyq.entities.SpecialityQuiz;
import online.akzholedu.kz.mamandyq.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/mamandyq")
public class RestController {
    @Autowired
    private SpecialityService specialityService;

    @GetMapping("/")
    public ResponseEntity<List<SpecialityQuiz>> getQuiz() {
        return new ResponseEntity<>(specialityService.allQuestions(), HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<QuizResult> getQuizResult(@PathVariable(value = "code") String code){
        return new ResponseEntity<>(specialityService.getQuizResult(code), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<QuizResult>> getAllQuizResults(){
        return new ResponseEntity<>(specialityService.allQuizResult(), HttpStatus.OK);
    }
}
