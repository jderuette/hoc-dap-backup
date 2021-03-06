//TODO MGW by Djer |JavaDoc| Il devrait y avoir un "package-info.java" dans ce package, notament pour y indiquer l'utilit� de ce package
package fr.houseofcode.dap.server.mgw;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

//TODO MGW by Djer |JavaDoc| Il devrait y avoir une description de la classe ("Server Launcher" est suffisant).
//TODO MGW by Djer |IDE| configure ton Eclipse pour le formatage du code (indentation en espace au lieu de tab). Ca sera corrig� sur les fichiers ou j'ai fait des modifications.
/** @author mgw **/
@SpringBootApplication
public class Application {
    /** Logger. */
    private static final Logger LOG = LogManager.getLogger();

    /**
     * is the start of the Spring program.
     * @param args is the external parameters.
     **/
    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //TODO MGW by Djer |Spring| Cette m�thode sert au "tuto" pour v�rifier que Spring fonctionne. Tu peux la supprimer. Pour Info elle affiche (dans la console) tous ce qui est "enregistr�" dans le conteneur IOC de Spring.

    /** Spring beginning.
     * @return the array of beanNames
     * @param ctx the context of application
     **/
    @Bean
    public CommandLineRunner commandLineRunner(final ApplicationContext ctx) {
        return args -> {

            //System.out.println("Let's inspect the beans provided by Spring Boot:");
            LOG.debug("Let's inspect the beans provided by Spring Boot: ");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                LOG.debug("beanName :" + beanName);
            }

            LOG.debug("End of the beans provided by Spring Boot.");
        };
    }

}
