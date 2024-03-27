package net.amentum.niomedic.expediente.views.historia_clinica_general.estudio_laboratorio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HCEstudioLaboratorioView implements Serializable {
    Long idEstudioLaboratorio;
    Long idHistoriaClinica;
    String notas;
    List<HCEstudioLabEstudioView> listaEstudios;
    List<HCEstudioLabDocumentoView> listaDocumentos;
}

