package net.amentum.niomedic.expediente.views;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ControlesView implements Serializable{
	private static final long serialVersionUID = 325048169855224803L;
	private Long idControl;
	@NotNull
	private UUID idPaciente;
	//Ranogos Diabetes
	private Integer dLimiteRangoBajo;
	private Integer dRangoBajo;
	private Integer dRangoAlto;
	private Integer dLimiteRangoAlto;
	//Ranogos Oximetria
		//frecuencia de pulso
	private Integer oxPrLimiteRangoBajo;
	private Integer oxPrRangoBajo;
	private Integer oxPrRangoAlto;
	private Integer oxPrLimiteRangoAlto;
		//saturación de oxígeno
	private Integer oxSpo2LimiteRangoBajo;
	private Integer oxSpo2RangoBajo;
	private Integer oxSpo2RangoAlto;
	private Integer oxSpo2LimiteRangoAlto;
//	private Integer oxLimiteRangoBajo;
//	private Integer oxRangoBajo;
//	private Integer oxRangoAlto;
//	private Integer oxLimiteRangoAlto;
	//Ranogos Hipertension
		//diastolica
	private Integer hpDLimiteRangoBajo;
	private Integer hpDRangoBajo;
	private Integer hpDRangoAlto;
	private Integer hpDLimiteRangoAlto;
		//sistolica
	private Integer hpSLimiteRangoBajo;
	private Integer hpSRangoBajo;
	private Integer hpSRangoAlto;
	private Integer hpSLimiteRangoAlto;
		//pulso
	private Integer hpPLimiteRangoBajo;
	private Integer hpPRangoBajo;
	private Integer hpPRangoAlto;
	private Integer hpPLimiteRangoAlto;
	
	private Date fechaCreacion;
	private Long IdUsuarioQuienCreo;
	private String nombreQuienCreo;
	private Date fechaUltimaModificacion;
	private Long IdUsuarioQuienModificia;
	private String nombreQuienModifica;
	
	private Boolean hipertension=Boolean.FALSE;
	private Boolean oximetria=Boolean.FALSE;
	private Boolean diabetes=Boolean.FALSE;
	
	private Set<PeriodosControlesView> periodosControlesView= new HashSet<PeriodosControlesView>();
	
	@Override
	public String toString() {
		return "Controles { " + "idControl=" + idControl + 
				", idPaciente=" + idPaciente + 
				", dLimiteRangoBajo=" + dLimiteRangoBajo +
				", dRangoBajo="	+ dRangoBajo + 
				", dRangoAlto=" + dRangoAlto + 
				", dLimiteRangoAlto=" + dLimiteRangoAlto + 
				", oxPrLimiteRangoBajo="+ oxPrLimiteRangoBajo +
				", oxPrRangoBajo=" + oxPrRangoBajo + 
				", oxPrRangoAlto=" + oxPrRangoAlto + 
				", oxPrLimiteRangoAlto=" + oxPrLimiteRangoAlto +
				", oxSpo2LimiteRangoBajo=" + oxSpo2LimiteRangoBajo + 
				", oxSpo2RangoBajo=" + oxSpo2RangoBajo + 
				", oxSpo2RangoAlto=" + oxSpo2RangoAlto + 
				", oxSpo2LimiteRangoAlto" + oxSpo2LimiteRangoAlto + 
//				", oxLimiteRangoBajo=" + oxLimiteRangoBajo + 
//				", oxRangoBajo=" + oxRangoBajo + 
//				", oxRangoAlto=" + oxRangoAlto + 
//				", oxLimiteRangoAlto=" + oxLimiteRangoAlto + 
				", hpDLimiteRangoBajo="	+ hpDLimiteRangoBajo + 
				", hpDRangoBajo=" + hpDRangoBajo + 
				", hpDRangoAlto=" + hpDRangoAlto	+
				", hpDLimiteRangoAlto=" + hpDLimiteRangoAlto + 
				", hpSLimiteRangoBajo=" + hpSLimiteRangoBajo+ 
				", hpSRangoBajo=" + hpSRangoBajo +
				", hpSRangoAlto=" + hpSRangoAlto + 
				", hpSLimiteRangoAlto=" + hpSLimiteRangoAlto +
				", hpPLimiteRangoBajo=" + hpPLimiteRangoBajo + 
				", hpPRangoBajo=" + hpPRangoBajo + 
				", hpPRangoAlto=" + hpPRangoAlto +
				", hpPLimiteRangoAlto=" + hpPLimiteRangoAlto + 
				", fechaCreacion=" + fechaCreacion + 
				", IdUsuarioQuienCreo=" + IdUsuarioQuienCreo + 
				", nombreQuienCreo=" + nombreQuienCreo +
				", fechaUltimaModificacion=" + fechaUltimaModificacion + 
				", nombreQuienModifica="+ nombreQuienModifica + 
				", hipertension=" + hipertension + 
				", oximetria=" + oximetria + 
				", diabetes="+ diabetes + 
				"}";
	}

}
