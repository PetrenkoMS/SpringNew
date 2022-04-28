package SpringBoot.SpringBoot.securingweb;

import SpringBoot.SpringBoot.DB.UserRepository;
import SpringBoot.SpringBoot.model.MyUserDetails;
import SpringBoot.SpringBoot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("Пользователь " + userName + " не найден"));

        return user.map(MyUserDetails::new).get();
    }
}
