package pl.koziarz.specificationexample.abstracts.specification;

public interface ISpecification<T> {
	public boolean isSatisfiedBy(T t);
}
