package SpringBoot.SpringBoot.services;

import SpringBoot.SpringBoot.DB.UserRepository;
import SpringBoot.SpringBoot.model.MyUserDetails;
import SpringBoot.SpringBoot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Авторизация и аутентификация пользователя
 */
@Transactional
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    /**
     * Проверка пользователя
     * @param userName - логин пользователя
     * @return либо пользователя, либо ошибку
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(userName);

        user.orElseThrow(() -> new UsernameNotFoundException("Пользователь " + userName + " не найден"));

        return user.map(MyUserDetails::new).get();
    }
}
