package pl.koziarz.specificationexample.abstracts.specification;

public abstract class AbstractSpecification<T> implements ISpecification<T> {
	
	public abstract boolean isSatisfiedBy(T t);
	
	public AbstractSpecification<T> or(ISpecification<T> s) {
		return new OrSpecification<T>(this,s);
	}

	public AbstractSpecification<T> and(ISpecification<T> s) {
		return new AndSpecification<T>(this,s);
	}

	public AbstractSpecification<T> not() {
		return new NotSpecification<T>(this);
	}

}
