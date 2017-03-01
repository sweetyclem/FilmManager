
package com.elephorm.formation.core;

import com.elephorm.formation.core.controller.DefaultFilmController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args) {
        //DefaultFilmController controller = new DefaultFilmController();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DefaultFilmController controller = (DefaultFilmController) context.getBean("defaultFilmController");
        controller.registerFilmFromConsoleInput();
    }
}
