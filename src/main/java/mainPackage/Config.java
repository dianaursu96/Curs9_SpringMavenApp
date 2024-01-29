package mainPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("mainPackage")
public class Config {

    @Autowired
    WisdomWordsService wisdomWordsService;
    @Autowired
    HomeworkService homeworkService;

    //injectare dependenta prin constructor
    @Bean
    public JavaTeacher javaTeacher() {
        return new JavaTeacher(wisdomWordsService, homeworkService);
    }

    // injectare dependenta prin setter

    @Bean
    public MathTeacher mathTeacher() {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setWisdomService(wisdomWordsService);
        mathTeacher.setHomeworkService(homeworkService);
        return mathTeacher;
    }

}
