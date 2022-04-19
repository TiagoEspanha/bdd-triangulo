package src.triangulo;  

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTest {
    Triangulo triangulo; 
    int lado1; 
    int lado2; 
    int lado3; 

    public void dado() {
        triangulo = new Triangulo();
    }

    public void quando(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public void entao(String mensagemEsperada) {
        String result = triangulo.verificaTriangulo(this.lado1, this.lado2, this.lado3);
        Assertions.assertEquals(result, mensagemEsperada);
    }

    @Test
	public void testLadosInvalidos() {
		this.dado();
        this.quando(-1, 1, 0);
        this.entao("Nao eh um triangulo");
	}

    @Test
	public void test3LadosIguais() {
		this.dado();
        this.quando(2, 2, 2);
        this.entao("O triangulo eh equilatero");
	}

    @Test
	public void test2LadosIguais() {
		this.dado();
        this.quando(1, 1, 2);
        this.entao("O triangulo eh isosceles");
	}

    @Test
	public void test0LadosIguais() {
		this.dado();
        this.quando(2, 3, 4);
        this.entao("O triangulo eh escaleno");
	}



}