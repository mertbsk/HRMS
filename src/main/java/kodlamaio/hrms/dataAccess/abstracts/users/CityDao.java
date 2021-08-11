package kodlamaio.hrms.dataAccess.abstracts.users;

import kodlamaio.hrms.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City, Integer> {

    City getByCityName(String cityName);

    boolean existsCityByCityName(String cityName);

}
