package ru.clevertec.plugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.tasks.TaskAction;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

class MyTask extends DefaultTask {

    @Inject
   public MyTask(){}
    private Project projectDir;

    @TaskAction
    public void myTask() throws IOException {
        URL url = new URL("https://malinalime.com/wp-content/uploads/2018/04/Adobe-Reader.png");
        BufferedImage img = ImageIO.read(url);
        File file = new File(projectDir.getRootDir().toPath() + "/dog.png");
        ImageIO.write(img, "png", file);
        System.out.println("load image " + file);
    }

    public Project getProjectDir() {
        return projectDir;
    }

    public void setProjectDir(Project projectDir) {
        this.projectDir = projectDir;
    }


}