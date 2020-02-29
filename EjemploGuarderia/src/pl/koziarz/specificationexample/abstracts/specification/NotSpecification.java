package pl.koziarz.specificationexample.abstracts.specification;

public class NotSpecification<T> extends AbstractSpecification<T> {

	private ISpecification<T> spec;
	
	public NotSpecification(ISpecification<T> s) {
		this.spec=s;
	}
	
	@Override
	public boolean isSatisfiedBy(T t) {
		return !spec.isSatisfiedBy(t);
	}

}
