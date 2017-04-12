
package com.tocea.course.cleancode.module2.badsmell.primitiveobsess.exercice1;

public class PrimitiveObsessionExercice1 {

	public static final String[] personData = new String[] { "John:Wayne:36:5400", "jeremie:guidoux:24:7800",
			"Homeless:People:12:1" };

	private String name;

	public PrimitiveObsessionExercice1(String name) {
		super();
		this.name = name;
	}

	public PrimitiveObsessionExercice1() {

		super();
	}

	/**
	 * Refactoring : This method computes the sum of the people salaries
	 * <ul>
	 * <li>Transform the String structure into a Pojo</li>
	 * <li>Transform the map Structure into a Pojo</li>
	 * <li>Refactor the method computeSumOfSalaries</li>
	 * <li>Validate the test</li>
	 * </ul>
	 */
	public int compteSumOfSalaries(final String[] _personData) {

		// FIXME::Transform the String structure into a Pojo
		// FIXME:: Transform the map Structure into a Pojo
		// FIXME:: Refactor the method computeSumOfSalaries
		// FIXME:: Validate the test

		int totalSalaries = 0;
		for (final String personalData : _personData) {
			final Person person = convertPersonalData(personalData);
			totalSalaries += person.getSalary();
		}
		return totalSalaries;

	}

	private Person convertPersonalData(final String _personalData) {
		return Person.fromStringRepresentation(_personalData);
	}
}
