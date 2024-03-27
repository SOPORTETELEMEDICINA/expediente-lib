package net.amentum.niomedic.expediente.views;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TratamientoView implements Serializable{

    private Long idTratamiento;
    private Date fechaCreacion;
    private Long consultaId;
    private Long catCie9Id;
    private String proNombre;
    private String catalogKey;
    private Boolean status;
    private Boolean activo;
	@Override
	public String toString() {
		return "Tratamiento {"
				+ ", idTratamiento='" + idTratamiento +'\''+ 
				", fechaCreacion="+ fechaCreacion +'\''+
				", consultaId='"+ consultaId + '\''+
				", catCie9Id='" +catCie9Id + '\''+
				", proNombre='"+ proNombre +'\''+
				", catalogKey='"+catalogKey+'\''+
				", status='"+status+'\''+
				", activo='"+activo+'\''+
				"}";
	} 
}
