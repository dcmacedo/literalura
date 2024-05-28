package br.com.dcmacedo.literalura.models;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    private Long id; //: <number of Project Gutenberg ID>,
    private String titulo; //"title": <string>,
    private List<String> assuntos = new ArrayList<>(); //"subjects": <array of strings>,
    private List<Autor> autores = new ArrayList<>(); //"authors": <array of Persons>,
    private List<String> idiomas = new ArrayList<>(); //"languages": <array of strings>,
    private Boolean copyright; //: <boolean or null>,
    private String tipoMidia; //"media_type": <string>,
    private Integer contadorDownload; //"download_count": <number>

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(List<String> assuntos) {
        this.assuntos = assuntos;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public void setCopyright(Boolean copyright) {
        this.copyright = copyright;
    }

    public String getTipoMidia() {
        return tipoMidia;
    }

    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    public Integer getContadorDownload() {
        return contadorDownload;
    }

    public void setContadorDownload(Integer contadorDownload) {
        this.contadorDownload = contadorDownload;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", assuntos=" + assuntos +
                ", autores=" + autores +
                ", idiomas=" + idiomas +
                ", copyright=" + copyright +
                ", tipoMidia='" + tipoMidia + '\'' +
                ", contadorDownload=" + contadorDownload +
                '}';
    }
}
