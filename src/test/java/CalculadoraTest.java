import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        //Arrange
        double num1 = 2;
        double num2 = 2;
        double valorEsperado = 4;
        Calculadora calculadora = new Calculadora();


        //Act
        double resultado = calculadora.soma(num1,num2);

        //Assert

        Assert.assertEquals(valorEsperado,resultado,0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double num1 = 2;
        double num2 = 2;
        double valorEsperado = 1;
        Calculadora calculadora =new Calculadora();


        //Act
        double resultado = calculadora.divisao(num1,num2);

        //Assert
        Assert.assertEquals(valorEsperado,resultado,0.01);

    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double num1 = 2;
        double num2 = 2;
        double valorEsperado = 4;
        Calculadora calculadora = new Calculadora();
        //Act
        double resultado = calculadora.multiplicacao(num1,num2);


        //Assert
        Assert.assertEquals(valorEsperado,resultado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        //Arrange
        double num1=3;
        double num2=2;
         double valorEsperado = 1.5;
         Calculadora calculadora = new Calculadora();

        //Act
        double resultado = (double)calculadora.divisao(num1, num2);
        //Assert
        Assert.assertEquals(valorEsperado,resultado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoNumerosForemInteiros(){
        //Arrange
        double num1 = 5;
        double num2 = 3;
        double valorEsperado = 2;
        Calculadora calculadora = new Calculadora();

        //Act
        double resultado = calculadora.subtracao(num1,num2);

        //Assert
        Assert.assertEquals(valorEsperado,resultado,0.01);
    }




}
