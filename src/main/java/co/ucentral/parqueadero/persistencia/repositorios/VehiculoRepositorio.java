package co.ucentral.parqueadero.persistencia.repositorios;

import co.ucentral.parqueadero.persistencia.entidades.Vehiculos;
import org.springframework.data.repository.CrudRepository;

public interface VehiculoRepositorio  extends CrudRepository<Vehiculos, long> {
}
