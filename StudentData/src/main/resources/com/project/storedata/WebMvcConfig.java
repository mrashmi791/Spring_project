import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.practice.project")
public class WebMvcConfig {
	
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("webapp/WEB-INF");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	

}
