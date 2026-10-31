package calculadora;

/**
 * Classe responsável por executar os testes funcionais da calculadora.
 *
 * @author Gabriel Donizete
 * @version 1.0
 */
public class TesteCalculadora {
	
	/**
     * Executa os testes das operações matemáticas.
     *
     * @param args argumentos da linha de comando
     */
  
  public static void main(String[] args) {
	  Calculadora calc = new Calculadora();
	  
	  System.out.println("Soma: " + calc.calcular(2, 3, "+"));
	  System.out.println("Subtração: "+ calc.calcular(10, 4, "-"));
	  System.out.println("Multiplicação: " + calc.calcular(3, 5, "*"));
	  System.out.println("Divisão: " + calc.calcular(8, 2, "/"));
	  
	  try {
		  System.out.println(calc.calcular(8, 0, "/")); // exceção
	  } catch (IllegalArgumentException e) {
		  System.out.println(e.getMessage());
	  }
	  
	  try {
		  System.out.println(calc.calcular(5, 5, "x")); // exceção
	  } catch (IllegalArgumentException e) {
		  System.out.println(e.getMessage());
	  }
  }
}
