package online.akzholedu.kz.mamandyq.services.impl;

import online.akzholedu.kz.mamandyq.entities.SpecialityQuiz;
import online.akzholedu.kz.mamandyq.repositories.SpecialityQuizRepository;
import online.akzholedu.kz.mamandyq.services.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {
    @Autowired
    private SpecialityQuizRepository specialityQuizRepository;

    @Override
    public List<SpecialityQuiz> allQuestions() {
        return specialityQuizRepository.findAll();
    }
}
