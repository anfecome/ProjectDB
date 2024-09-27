package co.ucentral.parqueadero.persistencia.servicios;

import co.ucentral.parqueadero.persistencia.entidades.Vehiculos;
import co.ucentral.parqueadero.persistencia.repositorios.VehiculoRepositorio;
import org.springframework.stereotype.Service;
@Service
public class VehiculoServicio {

    VehiculoRepositorio vehiculoRepositorio;
    public List<Vehiculo> obtenerVehiculos(){
        List<Vehiculos> listado = (List<Vehiculo>) vehiculoRepositorio.findAll();
        return listado;
    }

    public boolean borrar(Vehiculos vehiculos){
        try{
            vehiculoRepositorio.delete(vehiculos);
            // List(<Vehiculos>) listado = (List<Vehiculos>) vehiculoRepositorio.delete();
        }

    }
}
