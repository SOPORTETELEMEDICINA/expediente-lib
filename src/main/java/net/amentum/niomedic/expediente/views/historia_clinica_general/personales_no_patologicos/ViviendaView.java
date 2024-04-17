package net.amentum.niomedic.expediente.views.historia_clinica_general.personales_no_patologicos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ViviendaView {
    Long idVivienda;
    Long idHistoriaClinica;
    Boolean aguaPotable;
    Boolean electricidad;
    Boolean recoleccionBasura;
    Boolean alcantarillado;
    Boolean pisoTierra;
    Boolean pisoAzulejo;
    Boolean pisoCemento;
    Boolean pisoOtro;
    Boolean techoLadrillo;
    Boolean techoEnjarradas;
    Boolean techoOtro;
    Boolean sinBanio;
    Boolean banio1;
    Boolean banio2;
    Boolean banioMas;
    Boolean habitaciones1;
    Boolean habitaciones2;
    Boolean habitacionesMas;
    Boolean cocinarGas;
    Boolean cocinarLenia;
    Boolean cocinarCarbon;
    Boolean productosToxicosSi;
    Boolean productosToxicosNo;
    String productosToxicosInput;
    Boolean faunaNocivaNo;
    Boolean faunaAranias;
    Boolean faunaAlacranes;
    Boolean faunaSerpiente;
    Boolean faunaOtro;
    String faunaOtroTxt;
}
