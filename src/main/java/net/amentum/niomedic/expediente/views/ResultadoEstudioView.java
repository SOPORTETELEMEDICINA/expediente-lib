package net.amentum.niomedic.expediente.views;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResultadoEstudioView {
	private Long idResultadoEstudio;
	@Size(max=200, message="máximo 200 caracteres.")
	@NotNull(message= "No puede ser nulo.")
	@Pattern(regexp="^[a-zA-Z]+/[a-zA-Z]+$", message="debe cumplir con el formato: tipo/subtipo, ejemplo: image/png")
	private String mimeType;
	@NotNull(message="No puede ser nulo.")
	private String base64;
	private Date fechaCreacion;
	@NotNull(message="No puede ser nulo.")
	private UUID idPaciente;
	@NotNull(message="No puede ser nulo.")
	private Long idConsulta;
}
