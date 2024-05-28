package br.com.dcmacedo.literalura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(
       @JsonAlias("id") Long id,
       @JsonAlias("title") String titulo,
       @JsonAlias("subjects") List<String>assuntos,
       @JsonAlias("authors") List<Autor> autores,
       @JsonAlias("languages") List<String> idiomas,
       @JsonAlias("copyright") Boolean copyright,
       @JsonAlias("media_type") String tipoMidia,
       @JsonAlias("download_count") Integer contadorDownload) {
}
