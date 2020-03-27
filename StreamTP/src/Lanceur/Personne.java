package Lanceur;

public class Personne {

	private String nomcomplet;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomcomplet == null) ? 0 : nomcomplet.hashCode());
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
		Personne other = (Personne) obj;
		if (nomcomplet == null) {
			if (other.nomcomplet != null)
				return false;
		} else if (!nomcomplet.equals(other.nomcomplet))
			return false;
		return true;
	}

	public Personne(String nomcomplet) {
		super();
		this.nomcomplet = nomcomplet;
	}

	@Override
	public String toString() {
		return "Personne [nomcomplet=" + nomcomplet + "]";
	}

	public String getNomcomplet() {
		return nomcomplet;
	}

	public void setNomcomplet(String nomcomplet) {
		this.nomcomplet = nomcomplet;
	}

}
