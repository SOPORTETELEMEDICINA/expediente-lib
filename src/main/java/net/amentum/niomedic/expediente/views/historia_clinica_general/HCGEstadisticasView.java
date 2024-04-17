package net.amentum.niomedic.expediente.views.historia_clinica_general;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.amentum.niomedic.expediente.views.historia_clinica_general.antecendentes_ginecobstetricos.AntecendentesGinecobstetricosView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.diagnostico.DiagnosticoHCGView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.estudio_laboratorio.HCEstudioLaboratorioView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.exploracion_fisica.ExploracionFisicaView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.heredo_familiares.HeredoFamiliaresView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.interrogatorio_aparatos.InterrogatorioAparatosView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.padecimiento_actual.PadecimientoActualView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.personales_no_patologicos.PersonalesNoPatologicosView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.personales_patologicos.PersonalesPatologicosView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.tratamiento.HCTratamientoView;
import net.amentum.niomedic.expediente.views.historia_clinica_general.vacunacion.VacunacionView;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HCGEstadisticasView {
    Long idHistoriaClinica;
    PersonalesNoPatologicosView pantallaPersonalesNoPatologicos;
    PersonalesPatologicosView personalesPatologicos;
    HCEstudioLaboratorioView estudiosLaboratorio;
    InterrogatorioAparatosView pantallaInterrogatorioAparatos;
    ExploracionFisicaView exploracionFisica;
    HeredoFamiliaresView heredoFamiliares;
    AntecendentesGinecobstetricosView ginecobstetricos;
    PadecimientoActualView padecimientoActual;
    DiagnosticoHCGView diagnosticoHCG;
    HCTratamientoView terapeuticaEmpleada;
    ArrayList<VacunacionView> esquemaVacunacion;
}
