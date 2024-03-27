package net.amentum.niomedic.expediente.views;

import net.amentum.niomedic.catalogos.views.CatEstadoConsultaView;
import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignosVitalesView implements Serializable{
	private static final long serialVersionUID = -3123702445625737772L;
	
	private Map<String, Object> signosVitales;
	private CatEstadoConsultaView catEstadoConsultaView;

	@Override
	public String toString() {
		return "SignosVitalesView:"
				+ "signosVitales='" + signosVitales + '\'' + "}";
	}
}
