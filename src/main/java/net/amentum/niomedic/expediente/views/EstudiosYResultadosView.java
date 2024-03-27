package net.amentum.niomedic.expediente.views;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudiosYResultadosView {
	private List<ResultadoEstudioView> ResultadoEstudioViewList = new ArrayList<>();
	private FormatoEstudioView formatoEstudioView;
	

}
