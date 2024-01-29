package mainPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // load the Spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // retrieve bean from Spring container
        JavaTeacher theTeacher = context.getBean(JavaTeacher.class);
        ITeacher mathTeacher = context.getBean( MathTeacher.class);

        // call methods on the bean
        System.out.println(theTeacher.getHomework());
        System.out.println(mathTeacher.getWisdom());

        System.out.println("Wisdom: " + theTeacher.getWisdom());

         System.out.println("Age: " + theTeacher.getAge());
        System.out.println("Work place: " + theTeacher.getWorkPlace());



        // close the context
        context.close();

    }

}

