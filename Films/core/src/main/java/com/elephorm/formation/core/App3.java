
package com.elephorm.formation.core;

import com.elephorm.formation.core.controller.DefaultFilmController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DefaultFilmController controller = (DefaultFilmController) context.getBean("defaultFilmController");
        controller.listerFilms();
    }
}
