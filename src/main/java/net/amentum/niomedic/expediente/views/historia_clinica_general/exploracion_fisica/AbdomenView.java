package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AbdomenView {
    Long idAbdomen;
    Long idHistoriaClinica;
    String caracteristicas;
    Boolean ruidosPeristalticos;
    String ruidosPeristalticosTipo;
    String percusion;
    String percusionLocalizacion;
    Boolean palpacionDolor;
    String palpacionDolorLocalizacion;
    Boolean masas;
    Boolean visceromegalias;
    Boolean ascitis;
    String hernias;
    String signos;
    String comentarios;
    String forma;
    String ruidos;
    Boolean dolor;
}
