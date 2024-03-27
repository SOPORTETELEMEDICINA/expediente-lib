package net.amentum.niomedic.expediente.views;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeriodosControlesView implements Serializable{
	private static final long serialVersionUID = -1424356335067240416L;
	
	private Long idPeriodoControl;
	@Min(1) @Max(7)
	private Integer diaSemana;
	@NotNull
	private Date horario;
	private Boolean diabetes=Boolean.FALSE;
	private Boolean hipertension=Boolean.FALSE;
	private Boolean oximetria=Boolean.FALSE;
	@NotNull
	private Long idControles;
	@Override
	public String toString() {
		return "PeriodosControlesView {"+
				"idPeriodo=" + idPeriodoControl +
				", diaSemana=" + diaSemana + 
				", horario=" + horario+
				", diabetes=" + diabetes + 
				", hipertension=" + hipertension +
				", oximetria=" + oximetria + 
				", idControles=" + idControles + "}";
	}
	
	
	

}
