package net.amentum.niomedic.expediente.views;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FormatoEstudioView implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mimeType;
	private String base64;
	private Long idConsulta;
}
