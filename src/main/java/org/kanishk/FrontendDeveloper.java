package org.kanishk;

public class FrontendDeveloper implements Developer{
    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    private String techStack;

    public void develop() {
        System.out.println("Backend Developer is developing " + techStack + " application.");

    }
}
