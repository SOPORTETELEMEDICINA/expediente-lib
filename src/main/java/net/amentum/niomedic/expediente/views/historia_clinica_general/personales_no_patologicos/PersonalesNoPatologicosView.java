package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_no_patologicos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonalesNoPatologicosView {
    Long idPersonalesNoPatologicos;
    Long idHistoriaClinica;
    String notas;
    ViviendaView personalesNoPatologicosVivienda;
    MascotasView personalesNoPatologicosMascotas;
    ActividadDeportivaView personalesNoPatologicosAcDeportiva;
    HabitoAlimenticioView personalesNoPatologicosHabAlimenticios;
    HabitosHigienicosView personalesNoPatologicosHabHigienicos;
    Collection<TablaLaboralView> personalesNoPatologicosTablaLaboral = new ArrayList<>();
    Collection<ConsumoView> personalesNoPatologicosTablaConsumo = new ArrayList<>();
    HistoriaLaboralView personalesNoPatologicosHistoriaLaboral;
}
