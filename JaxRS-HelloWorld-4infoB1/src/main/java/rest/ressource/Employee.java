package rest.ressource;
import javax.xml.bind.annotation.*;;


@XmlRootElement
public class Employee {

	private String cin;
	private String nom;
	private String prenon;
	public String getCin() {
		return cin;
	}
	@XmlAttribute(name="id",required=true)
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	@XmlAttribute(name="FirstName")
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenon() {
		return prenon;
	}
	@XmlAttribute(name="LastName")
	public void setPrenon(String prenon) {
		this.prenon = prenon;
	}
	@Override
	public String toString() {
		return "Employee [cin=" + cin + ", nom=" + nom + ", prenon=" + prenon + "]";
	}
	public Employee(String cin, String nom, String prenon) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenon = prenon;
	}
	public Employee() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenon == null) ? 0 : prenon.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenon == null) {
			if (other.prenon != null)
				return false;
		} else if (!prenon.equals(other.prenon))
			return false;
		return true;
	}
	
	

}
