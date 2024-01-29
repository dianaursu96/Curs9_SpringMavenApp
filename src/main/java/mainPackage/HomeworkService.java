package mainPackage;

import org.springframework.stereotype.Component;

@Component
public class HomeworkService {
    private String message = "Homework is done";

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
