package entities;

public class Colaborator {
	private String name;
	private double salary; //nao existe o metodo setSalario porque o metodo increase salary ja altera o valor, atraves de um aumento e o construtor da classe atribui o valor inicial obrigatoriamente
	private int id; //o id nao se modifica, por isso nao existe o metodo setId

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public Colaborator(int id, String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public void increaseSalary(double p) {
		salary = salary + (p / 100) * salary;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
