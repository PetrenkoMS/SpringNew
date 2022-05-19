package SpringBoot.SpringBoot.DB;

import SpringBoot.SpringBoot.entity.PeopleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Таблица people_model - хранит информацию о пользователе
 * findByLogin - поиск по логину
 * findBySeriesPassportAndNumberPassport - поиск по серии и номеру паспорта (параметры соответственно)
 */
@Repository
public interface PeopleRepository extends JpaRepository<PeopleModel, Integer> {
    List<PeopleModel> findByLogin(String login);
    List<PeopleModel> findBySeriesPassportAndNumberPassport(String seriesPassport, String numberPassport);

//    @Query("Select p from PeopleModel p where p.series_passport = :series and p.number_passport = :number")
//    List<PeopleModel> findBySeriesAndNumber(@Param("series") String series_passport, @Param("number") String number_passport);

}
