package SpringBoot.SpringBoot.securingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/registration").permitAll()
                .antMatchers("/", "/resources/**", "/static/**", "/CSS/**", "/js/**", "/images/**", "/bootstrap/**").permitAll()
                .antMatchers("/findUsers").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .failureUrl("/login?error=true")
                .and()
                .logout().permitAll()
                .logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID");

        http.csrf().disable(); //Нужна, чтобы, если зашел на сайт, работал permitAll.



//        http.authorizeRequests()
//                .antMatchers("/findUsers").hasRole("USER")
//                .and()
//            .authorizeRequests()
//                .antMatchers("/","/registration","/user").permitAll()
//                .and()
//            .authorizeRequests()
//                .anyRequest()
//                .permitAll()
//                .and()
////                .antMatchers("/registration").permitAll()
////                .antMatchers("/login").permitAll()
//                .formLogin();
////                .loginPage("/login");
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder(12);
    }
}

