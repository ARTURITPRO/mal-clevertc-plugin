package ru.clevertec.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class MyPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("load image", MyTask.class, task ->
                task.setProjectDir(project)
        );

    }

}