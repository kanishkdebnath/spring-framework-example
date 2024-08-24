package org.kanishk;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "prototype")
public class StaffEngineer implements BeanNameAware, DisposableBean {
    private String name;

    @Override
    public String toString() {
        return "StaffEngineer{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println("Staff Engineer " + name + " is working.");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Set Bean Name method is called.");
    }

    @PostConstruct
    public void setPostConstructor() {
        System.out.println("Post Constructor method is called.");
    }

    @PreDestroy
    public void setPreDestory() {
        System.out.println("Pre-destroy method called for " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destructing the bean for " + name);
    }
}
