package net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InterrogatorioMusculoEsqueleticoView {
    Long idInterrogatorio;
    Long idHistoriaClinica;
    Boolean asintomatico;
    Boolean inflamacion;
    String inflamacionLocalizacion;
    String inflamacionTiempoEvol;
    Boolean dolor;
    String dolorLocalizacion;
    String dolorTiempoEvol;
    String dolorEvn;
    Boolean debilidadMuscular;
    String debilidadMuscularLocalizacion;
    String debilidadMuscularTiempoEvol;
    Boolean secrecion;
    Boolean limitacionMovimientos;
    String limitacionMovimientosLocalizacion;
    Boolean limitacionMovimientosNormal;
    Boolean limitacionMovimientosRestringido;
    Boolean limitacionMovimientosAumentado;
    Boolean deformidades;
    String deformidadesLocalizacion;
    String deformidadesTiempoEvol;
    Boolean calor;
    String calorLocalizacion;
    Boolean eritema;
    String eritemaLocalizacion;
    Boolean crepitaciones;
    String crepitacionesLocalizacion;
    String comentarios;
}
