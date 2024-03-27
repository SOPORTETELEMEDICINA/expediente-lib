package net.amentum.niomedic.expediente.views;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormatResumenView implements Serializable{
	private Long idFormat;
	private String title;
	@Override
	public String toString() {
		return "formatResumenView {idFormat='" + idFormat + '\'' +", title='" + title +'\''+ "}";
	}

}
