package academy.learnprogramming.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    private static final Logger log = LoggerFactory.getLogger(WebAppInitializer.class);

    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.info("onStartup");

        //create the spring application context
        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();

        context.register(WebConfig.class);

        //create the dispatcher servlet
        DispatcherServlet dispatcherServlet =
                new DispatcherServlet(context);

        //register and configure the dispatcher servlet
        ServletRegistration.Dynamic registration =
                servletContext.addServlet(DISPATCHER_SERVLET_NAME, dispatcherServlet);

        registration.setLoadOnStartup(1); //the container instantiate and initialize the servlet on startup
        registration.addMapping("/"); //map the dispatcher servlet
    }
}
