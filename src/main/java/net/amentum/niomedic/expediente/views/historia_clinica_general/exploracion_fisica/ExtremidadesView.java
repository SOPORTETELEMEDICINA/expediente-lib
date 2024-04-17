package net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExtremidadesView {
    Long idExtremidades;
    Long idHistoriaClinica;
    List<Object> pulsos;
    Boolean toracicosIzquierdo;
    Boolean toracicosDerecho;
    Boolean pelvicosIzquierdo;
    Boolean pelvicosDerecho;
    Boolean simetria;
    Boolean pulsosCarotideoPresente;
    String pulsosCarotideoRitmo ;
    String pulsosCarotideoSimetria;
    String pulsosCarotideoIntensidad;
    Boolean pulsosRadialPresente;
    String pulsosRadialRitmo ;
    String pulsosRadialSimetria;
    String pulsosRadialIntensidad;
    Boolean pulsosBraquialPresente;
    String pulsosBraquialRitmo ;
    String pulsosBraquialSimetria;
    String pulsosBraquialIntensidad;
    Boolean pulsosFemoralPresente;
    String pulsosFemoralRitmo ;
    String pulsosFemoralSimetria;
    String pulsosFemoralIntensidad;
    Boolean pulsosPopitleoPresente;
    String pulsosPopitleoRitmo ;
    String pulsosPopitleoSimetria;
    String pulsosPopitleoIntensidad;
    Boolean pulsosTibialPresente;
    String pulsosTibialRitmo ;
    String pulsosTibialSimetria;
    String pulsosTibialIntensidad;
    Boolean pulsosDorsalisPedisPresente;
    String pulsosDorsalisPedisRitmo ;
    String pulsosDorsalisPedisSimetria;
    String pulsosDorsalisPedisIntensidad;
    String masasPalpables;
    String tonoMuscular;
    Boolean dolor;
    String dolorEvn;
    String dolorLocalizacion;
    String dolorCaraceristicas;
    Boolean crepitacion;
    String crepitacionLocalizacion;
    String deformidades;
    Boolean articulacionesEdema;
    Boolean articulacionesHiperemia;
    String articulacionesMovimientos;
    String articulacionesMovimientosDetalles;
    String fuerza;
    Boolean edema;
    String signosGodet;
    Boolean signosHomans;
    String signosColumnaMusculos;
    Boolean signosColumnaEscoliosis;
    Boolean signosColumnaCifosis;
    Boolean signosColumnaLordosis;
    String estado;
    String edemaLocalizacion;
    String edemaConsistencia;
    String edemaGodette;
    Boolean simetricos;
    Boolean intensidad;
    String comentarios;
}
