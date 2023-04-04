package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargHoraria;
    }

    public Curso() {

    }

    public int getCargHoraria() {
        return cargHoraria;
    }

    public void setCargHoraria(int cargHoraria) {
        this.cargHoraria = cargHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargHoraria=" + cargHoraria +
                '}';
    }
}
