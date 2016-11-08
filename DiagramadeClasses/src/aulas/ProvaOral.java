package aulas;

public class ProvaOral extends MomentoAvaliacao{
    
    Integer fluencia,
            dominioMateria;

    public ProvaOral(Integer fluencia, Integer dominioMateria) {
        this.fluencia = fluencia;
        this.dominioMateria = dominioMateria;
    }

    public Integer getFluencia() {
        return fluencia;
    }

    public void setFluencia(Integer fluencia) {
        this.fluencia = fluencia;
    }
    
}
