package techhubmvccurd1.com.techhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="techhubmvccurd1.com.techhub")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean(name="db")
	public DriverManagerDataSource getCon()
	{
		DriverManagerDataSource source=new DriverManagerDataSource();
		
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUsername("root");
		source.setPassword("root");
		source.setUrl("jdbc:mysql://localhost:3306/techhub");
		
		return source;
		
	}
	@Bean(name="template")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(getCon());
		return template;
	}
	
	

	
}
