package co.ucentral.parqueadero.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "vehiculos")
@Entity

public class Vehiculos {
    @Id
    @Column(name= "veh_codigo")
    public long codigo;

    @Column(name = "placa_vehi")
    public string placa;

    @Column(name = "modelo_vehi")
    public long modelo;

}
