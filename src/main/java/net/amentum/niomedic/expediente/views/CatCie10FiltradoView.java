package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CatCie10FiltradoView implements Serializable{
   private Long idCie10;
//   private String letra;
   private String catalogKey;
//   private String asterisco;
   private String nombre;
   private String lsex;
   private String linf;
   private String lsup;
//   private String trivial;
//   private String erradicado;
//   private String nInter;
//   private String nin;
//   private String ninmtobs;
//   private String noCbd;
//   private String noAph;
//   private String fetal;
//   private String diaCapituloType;
   private String descripcionCapitulo;
//   private String rubricaType;
//   private String yearModifi;
//   private String yearAplicacion;
//   private String notdiaria;
//   private String notsemanal;
//   private String sistemaEspecial;
//   private String birmm;
//   private String cveCausaType;
//   private String epiMorta;
//   private String epiMortaM5;
//   private String edasEIrasEnM5;
//   private String lista1;
//   private String lista5;
//   private String prinmorta;
//   private String prinmorbi;
//   private String lmMorbi;
//   private String lmMorta;
//   private String lgbd165;
//   private String lomsbeck;
//   private String lgbd190;
   private String esCauses;
//   private String numCauses;
//   private String esSuiveMorta;
//   private String daga;
//   private String epiClave;
//   private String epiClaveDesc;
   private String esSuiveMorb;
//   private String esSuiveNotin;
//   private String esSuiveEstEpi;
//   private String esSuiveEstBrote;
//   private String sinac;
//   private String codigox;
//   private String codSitLesion;
   private Boolean activo;
}
