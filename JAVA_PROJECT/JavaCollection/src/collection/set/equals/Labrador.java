package collection.set.equals;

public class Labrador extends Dog {

	public Labrador(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
//		String b= "123";
//		StringBuffer a = new StringBuffer();
//		a.append(b).reverse().
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Labrador other = (Labrador) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
