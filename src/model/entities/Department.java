package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
	// voce implementa caso queira que seu objeto seja transformado em suquencia de
	// bytes para ser gravado em arquivo ou transferido porrede

	private Integer id;
	private String name;

	public Department() {

	}

	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// para que meu objeto seja comparado por conteudo não por referencia de
	// ponteiro.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
