package ru.dhabits;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class PrintTask extends DefaultTask {
    private String module;
    
    @TaskAction
    public void printProjectName() {
        System.out.println("Project module:" + module);
    }

    @Input
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
}
