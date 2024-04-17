package net.amentum.niomedic.expediente.views;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CatDiagnosticoView implements Serializable{
   private Long id_cie10;
   private String letra;
   private String catalogKey;
   private String nombre;
   private String codigox;
   private String lsex;
   private String linf;
   private String lsup;
   private String trivial;
   private String erradicado;
   private String nInter;
   private String nin;
   private String ninmtobs;
   private String codSitLesion;
   private String noCbd;
   //
   private String cbd;
   //
   private String noAph;
   //
   private String afPrin;
   private String diaSis;
   private String claveProgramaSis;
   private String codComplementMorbi;
   private String diaFetal;
   private String defFetalCm;
   private String defFetalCbd;
   private String claveCapitulo;
   private String capitulo;
   //
   private String lista1;
   //
   private String grupo1;
   //
   private String lista5;
   private String rubricaType;
   private String yearModifi;
   private String yearAplicacion;
   private String valid;
   private String prinmorta;
   private String prinmorbi;
   private String lmMorbi;
   private String lmMorta;
   private String lgbd165;
   private String lomsbeck;
   private String lgbd190;
   private String notdiaria;
   private String notsemanal;
   private String sistemaEspecial;
   private String birmm;
   private String cveCausaType;
   //
   private String causa_type;
   //
   private String epiMorta;
   private String edasEIrasEnM5;
   //
   private String cveMaternasSeedepid;
   //
   private String epiMortaM5;
   private String epiMorbi;
   //
   private String defMaternas;
   //
   private String esCauses;
   private String numCauses;
   private String esSuiveMorta;
   private String esSuiveMorb;
   private String epiClave;
   private String epiClaveDesc;
   private String esSuiveNotin;
   private String esSuiveEstEpi;
   private String esSuiveEstBrote;
   private String sinac;
   //
   private String prinSinac;
   private String prinSinacGrupo;
   private String descripcionSinac;
   private String prinSinacSubGrupo;
   private String descripcionSinacSubGrupo;
   //
   private String daga;
   private String asterisco;
   //
   private String prinMm;
   private String prinMmGrupo;
   private String descripcionPrinMmGrupo;
   private String prinMmSubGrupo;
   private String descripcionPrinMmSubGrupo;
   //

}
