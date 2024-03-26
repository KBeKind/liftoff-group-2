package org.teamlaika.laikaspetpark.models.data;

import org.springframework.data.repository.CrudRepository;
import org.teamlaika.laikaspetpark.models.Service;

import java.security.Provider;

public interface ServicesRepository extends CrudRepository<Service, Integer> {
}
