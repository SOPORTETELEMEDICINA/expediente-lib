package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_no_patologicos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MascotasView {
    Long idMascotas;
    Long idHistoriaClinica;
    Boolean mascotasSi;
    Boolean mascotasNo;
    Boolean perro;
    Boolean gato;
    Boolean ave;
    Boolean conejo;
    Boolean tortuga;
    Boolean reptil;
    Boolean roedor;
    Boolean animalCorral;
    String nivelConvivencia;
    String comentarios;
}
