package pl.koziarz.specificationexample.domain.specification;

import pl.koziarz.specificationexample.abstracts.specification.AbstractSpecification;
import pl.koziarz.specificationexample.abstracts.specification.ISpecification;
import pl.koziarz.specificationexample.domain.entity.Toy;
import pl.koziarz.specificationexample.domain.entity.ToyType;

public class ToySpecifiedByType extends AbstractSpecification<Toy> {

	private ISpecification<ToyType> spec;

	public ToySpecifiedByType(ISpecification<ToyType> spec) {
		super();
		this.spec = spec;
	}
	
	public boolean isSatisfiedBy(Toy t) {
		return spec.isSatisfiedBy(t.getType());
	}
	
}
