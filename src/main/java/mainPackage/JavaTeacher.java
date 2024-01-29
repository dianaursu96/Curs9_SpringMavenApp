package mainPackage;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class JavaTeacher implements ITeacher{
    private WisdomWordsService wisdomService;
    private HomeworkService homeworkService;
    private int age;
    private String workPlace;


    // constructor unic care primeste ca parametru un obiect de tipul myPackage.WisdomWordsService
    public JavaTeacher(WisdomWordsService wisdomService,
                       HomeworkService homeworkService) {
        this.wisdomService = wisdomService;
        this.homeworkService = homeworkService;
    }


    @Override
    public String getHomework() {
        return homeworkService.getMessage();
    }


    @Override
    public String getWisdom() {
        return wisdomService.getMessage();
    }

    // replaced with lombok-generated getter and setters :

    /*
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

     */

}
