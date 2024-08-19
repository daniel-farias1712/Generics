import java.util.ArrayList;
import java.util.List;


abstract class Carro<T> {
    private String modelo = "";
    private Long codigo = 0L;
    private String cor = "";


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public abstract void exibirDetalhes();
}


class Sedan extends Carro<Sedan> {
    public Sedan() {
        setModelo("Sedan");
        setCodigo(1L);
        setCor("Preto");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Cor: " + getCor());
    }
}


class SUV extends Carro<SUV> {
    public SUV() {
        setModelo("SUV");
        setCodigo(2L);
        setCor("Branco");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Cor: " + getCor());
    }
}


class Compact extends Carro<Compact> {
    public Compact() {
        setModelo("Compact");
        setCodigo(3L);
        setCor("Vermelho");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Cor: " + getCor());
    }
}


public class Main {
    public static void main(String[] args) {

        List<Carro<?>> listaDeCarros = new ArrayList<>();


        listaDeCarros.add(new Sedan());
        listaDeCarros.add(new SUV());
        listaDeCarros.add(new Compact());


        for (Carro<?> carro : listaDeCarros) {
            carro.exibirDetalhes();
            System.out.println();
        }
    }
}
