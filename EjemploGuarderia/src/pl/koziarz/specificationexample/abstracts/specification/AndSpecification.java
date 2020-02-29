package pl.koziarz.specificationexample.abstracts.specification;

import java.util.HashSet;
import java.util.Set;

public class AndSpecification<T> extends AbstractSpecification<T> {

	private Set<ISpecification<T>> set = new HashSet<ISpecification<T>>();
	
	public AndSpecification(ISpecification<T> a, ISpecification<T> b) {
		set.add(a);
		set.add(b);
	}
	
	public boolean isSatisfiedBy(T t) {
		for( ISpecification<T> s : set ) {
			if( !s.isSatisfiedBy(t) ) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public AbstractSpecification<T> and(ISpecification<T> s) {
		set.add(s);
		return this;
	}

}
