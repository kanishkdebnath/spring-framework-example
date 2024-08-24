package org.kanishk;

public class DevopsDeveloper implements Developer{

    private String techStack;

    public DevopsDeveloper(String techStack) {
        this.techStack = techStack;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public void develop() {
        System.out.println("Devops developer is developing using " + techStack);
    }
}
