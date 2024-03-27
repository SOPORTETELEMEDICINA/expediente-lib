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
public class ContraReferenciaView {
    Long id;
    String idReferencia;
    Date fechaCreacion;
    String resultadoClinico;
    Integer ingresoDx1;
    Integer ingresoDx2;
    Integer ingresoDx3;
    Integer ingresoDx4;
    Integer ingresoDx5;
    Integer ingresoDx6;
    Integer egresoDx1;
    Integer egresoDx2;
    Integer egresoDx3;
    Integer egresoDx4;
    Integer egresoDx5;
    Integer egresoDx6;
    Integer proced1;
    Integer proced2;
    Integer proced3;
    Integer proced4;
    Integer proced5;
    Integer proced6;
    String manejoPaciente;
    Integer tratamientoConc;
    String cont;
    String consultaSubsecuente;
    String idMedicoCref;
    String unidadMedica;
    Integer regionSanitaria;
}
