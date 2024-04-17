package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatCuestionarioHeader implements Serializable {
    Integer idCuestionario;
    String nombre;
    List<CatPreguntaView> listaPreguntas;
}
