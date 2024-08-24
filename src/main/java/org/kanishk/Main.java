package org.kanishk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        FrontendDeveloper developer = context.getBean(FrontendDeveloper.class);
        developer.develop();

        BackendDeveloper backendDeveloper = (BackendDeveloper) context.getBean("backendDeveloper");
        backendDeveloper.develop();

        Developer randomDeveloper = context.getBean(FrontendDeveloper.class);
        randomDeveloper.develop();

        FrontendDeveloper angularDeveloper = context.getBean(FrontendDeveloper.class);
        angularDeveloper.setTechStack("Angular");
        angularDeveloper.develop();

        DevopsDeveloper devopsDeveloper = context.getBean(DevopsDeveloper.class);
        devopsDeveloper.develop();

        StaffEngineer staffEngineer = context.getBean(StaffEngineer.class);
        staffEngineer.setName("Kanishk");
        staffEngineer.work();

        StaffEngineer staffEngineer2 = context.getBean(StaffEngineer.class);
        staffEngineer2.setName("Rohan");
        staffEngineer2.work();
    }
}