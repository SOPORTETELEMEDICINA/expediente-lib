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
public class ArchivoView implements Serializable{
	private String nombreArchivo;
	private String archivoBase64;
}
