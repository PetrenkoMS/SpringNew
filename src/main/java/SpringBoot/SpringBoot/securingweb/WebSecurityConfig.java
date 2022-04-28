//package SpringBoot.SpringBoot.securingweb;
//
//import SpringBoot.SpringBoot.DB.PeopleRepository;
//import SpringBoot.SpringBoot.model.PeopleModel;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.event.AuthenticationFailureProxyUntrustedEvent;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import java.util.List;
//
////import static org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry.RequestMatchers.antMatchers;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
////    List<PeopleModel> employLogin = this.peopleRepository.findByLogin();
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN")
//                .and()
//                .withUser("user")
//                .password("user")
//                .roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/findUsers/**").hasRole("USER")
//                .antMatchers("/").permitAll()
//                .and()
//                .formLogin()
//                .loginPage("/login");
//    }
//
//    @Bean
//    public PasswordEncoder encode() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//}
