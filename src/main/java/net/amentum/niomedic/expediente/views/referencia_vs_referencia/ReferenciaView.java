package net.amentum.niomedic.expediente.views.referencia_vs_referencia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReferenciaView {
    Long id;
    String folio;
    Integer vez;
    String umRefClues;
    Integer regionSanitaria;
    Date fechaCreacion;
    String idPaciente;
    Integer dx1;
    Integer dx2;
    Integer dx3;
    Integer dx4;
    Integer dx5;
    Integer dx6;
    Integer urgente;
    String unidadMedica;
    Integer espReq;
    //medico que recibe la referencia/interconsulta
    String idMedicoRecibe;
    String refSamu;
    Date refSamuFecha;
    String refMotivo;
    String refResClin;
    Integer refSvTaSys;
    Integer refSvTaDia;
    Double refSvTemp;
    Integer refSvFr;
    Integer refSvFc;
    Integer refSvPeso;
    Integer refSvTalla;
    //medico que crea la referencia/interconsulta
    String idMedicoCrea;
    Integer estado;
    Integer activo;
    Integer tipo;
}
