package online.akzholedu.kz.mamandyq.services;

import online.akzholedu.kz.mamandyq.entities.QuizResult;
import online.akzholedu.kz.mamandyq.entities.SpecialityQuiz;

import java.util.List;

public interface SpecialityService {
    List<SpecialityQuiz> allQuestions();
    QuizResult getQuizResult(String code);
    List<QuizResult> allQuizResult();
}
