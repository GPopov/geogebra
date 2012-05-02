package geogebra.common.kernel.prover;

import geogebra.common.main.AbstractApplication;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * This is a simple polynomial class for polynomials with arbitrary many
 * variables.
 * 
 * @author Simon Weitzhofer
 * 
 */
public class Polynomial implements Comparable<Polynomial> {

	private TreeMap<Term, Integer> terms;

	/**
	 * Creates the 0 polynomial
	 */
	public Polynomial() {
		terms = new TreeMap<Term, Integer>();
	}

	/**
	 * Copies a polynomial
	 * 
	 * @param poly
	 *            the polynomial to copy
	 */
	public Polynomial(final Polynomial poly) {
		terms = new TreeMap<Term, Integer>(poly.getTerms());
	}

	private Polynomial(final TreeMap<Term, Integer> terms) {
		this.terms = terms;
	}

	/**
	 * Getter for the map which contains the terms and the according
	 * coefficients.
	 * 
	 * @return the map
	 */
	public TreeMap<Term, Integer> getTerms() {
		return terms;
	}

	/**
	 * Creates a constant polynomial.
	 * 
	 * @param coeff
	 *            the constant
	 */
	public Polynomial(final int coeff) {
		this(coeff, new Term());
	}

	/**
	 * Creates a polynomial which contains only one variable
	 * 
	 * @param fv
	 *            the variable
	 */
	public Polynomial(final FreeVariable fv) {
		this();
		terms.put(new Term(fv), 1);
	}

	/**
	 * Creates the polynomial coeff*variable
	 * 
	 * @param coeff
	 *            the coefficient
	 * @param variable
	 *            the variable
	 */
	public Polynomial(final int coeff, final FreeVariable variable) {
		this();
		terms.put(new Term(variable), coeff);
	}

	/**
	 * Creates the polynomial coeff*(variable^power)
	 * 
	 * @param coeff
	 *            The coefficient
	 * @param variable
	 *            the variable
	 * @param power
	 *            the exponent
	 */
	public Polynomial(final int coeff, final FreeVariable variable,
			final int power) {
		this();
		terms.put(new Term(variable, power), coeff);
	}

	/**
	 * Creates the polynomial which contains only one term
	 * 
	 * @param t
	 *            the term
	 */
	public Polynomial(final Term t) {
		this();
		terms.put(t, 1);
	}

	/**
	 * Creates the polynomial coeff*t
	 * 
	 * @param coeff
	 *            the coefficient
	 * @param t
	 *            the term
	 */
	public Polynomial(final int coeff, final Term t) {
		this();
		terms.put(t, coeff);
	}

	/**
	 * Converts a String to a Polynomial
	 * @param s the input string 
	 */
	public Polynomial(String s) {
		// TODO: to implement
		this();
	}
	
	/**
	 * Returns the sum of the polynomial plus another polynomial.
	 * 
	 * @param poly
	 *            the polynomial to add
	 * @return the sum
	 */
	public Polynomial add(final Polynomial poly) {
		TreeMap<Term, Integer> result = new TreeMap<Term, Integer>(terms);
		TreeMap<Term, Integer> terms2 = poly.getTerms();
		Iterator<Term> it = terms2.keySet().iterator();
		while (it.hasNext()) {
			Term t = it.next();
			if (terms.containsKey(t)) {
				int coefficient = terms.get(t) + terms2.get(t);
				if (coefficient == 0) {
					result.remove(t);
				} else {
					result.put(t, terms.get(t) + terms2.get(t));
				}
			} else {
				result.put(t, terms2.get(t));
			}
		}
		return new Polynomial(result);
	}

	/**
	 * Calculates the additive inverse of the polynomial
	 * 
	 * @return the negation of the polynomial
	 */
	public Polynomial negate() {
		TreeMap<Term, Integer> result = new TreeMap<Term, Integer>();
		Iterator<Term> it = terms.keySet().iterator();
		while (it.hasNext()) {
			Term t = it.next();
			result.put(t, 0 - terms.get(t));
		}
		return new Polynomial(result);
	}

	/**
	 * Subtracts another polynomial
	 * 
	 * @param poly
	 *            the polynomial which is subtracted
	 * @return the difference
	 */
	public Polynomial subtract(final Polynomial poly) {
		return add(poly.negate());
	}

	/**
	 * Multiplies the polynomial with another polynomial
	 * 
	 * @param poly
	 *            the polynomial which is multiplied
	 * @return the product
	 */
	public Polynomial multiply(final Polynomial poly) {
		/*
		if (AbstractApplication.singularWS != null && AbstractApplication.singularWS.isAvailable()) {
			String singularMultiplicationProgram = getSingularMultiplication("rr", poly, this);
			if (singularMultiplicationProgram.length()>100)
				AbstractApplication.trace(singularMultiplicationProgram.length() + " bytes -> singular");
			else 
				AbstractApplication.trace(singularMultiplicationProgram + " -> singular");
			String singularMultiplication = AbstractApplication.singularWS.directCommand(singularMultiplicationProgram);
			if (singularMultiplication.length()>100)
				AbstractApplication.trace("singular -> " + singularMultiplication.length() + " bytes");
			else
				AbstractApplication.trace("singular -> " + singularMultiplication);
		} */
		TreeMap<Term, Integer> result = new TreeMap<Term, Integer>();
		TreeMap<Term, Integer> terms2 = poly.getTerms();
		Iterator<Term> it1 = terms.keySet().iterator();
		while (it1.hasNext()) {
			Term t1 = it1.next();
			Iterator<Term> it2 = terms2.keySet().iterator();
			while (it2.hasNext()) {
				Term t2 = it2.next();
				Term product = t1.times(t2);
				int productCoefficient = terms.get(t1) * terms2.get(t2);
				if (result.containsKey(product)) {
					int sum = result.get(product) + productCoefficient;
					if (sum == 0) {
						result.remove(product);
					} else {
						result.put(product, result.get(product)
								+ productCoefficient);
					}
				} else {
					result.put(product, productCoefficient);
				}
			}

		}
		return new Polynomial(result);
	}

	public int compareTo(Polynomial p) {
		int comp1 = terms.lastKey().compareTo(p.getTerms().lastKey());
		if (comp1 == 0) {
			return terms.get(terms.lastKey())
					.compareTo(p.getTerms().get(p.getTerms().lastKey()));
		}
		return comp1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<Term> it = terms.keySet().iterator();
		if (!it.hasNext()) {
			return "0";
		}
		while (it.hasNext()) {
			Term t = it.next();
			int c = terms.get(t);
			if (!t.getTerm().isEmpty()) {
				if (c != 1)
					sb.append(c + "*");
				sb.append(t);
			}
			else
				sb.append(c);
			sb.append('+');
		}
		return sb.substring(0, sb.length() - 1); // removing closing "+"
	}
	
	/**
	 * The set of the variables in this polynomial
	 * @return the set of variables
	 */
	public HashSet<FreeVariable> getVars() {
		HashSet<FreeVariable> v = new HashSet<FreeVariable>();
		Iterator<Term> it = terms.keySet().iterator();
		while (it.hasNext()) {
			Term t = it.next();
			v.addAll(t.getVars());
		}
		return v;
	}

	/**
	 * The set of the variables in the given polynomials
	 * @param polys the polynomials
	 * @return the set of variables
	 */
	public static HashSet<FreeVariable> getVars(Polynomial[] polys) {
		HashSet<FreeVariable> v = new HashSet<FreeVariable>();
		int polysLength = 0;
		if (polys != null)
			polysLength = polys.length;
		for (int i=0; i<polysLength; ++i) {
			HashSet<FreeVariable> vars = polys[i].getVars();
			if (vars != null)
				v.addAll(vars);
		}
		return v;
	}
	
	/**
	 * Creates a comma separated list of the variables in the given polynomials
	 * @param polys the polynomials
	 * @return the comma separated list
	 */
	public static String getVarsAsCommaSeparatedString(Polynomial[] polys) {
		StringBuilder sb = new StringBuilder();
		HashSet<FreeVariable> vars = getVars(polys);
		if (vars == null)
			return "";
		Iterator<FreeVariable> it = vars.iterator();
		while (it.hasNext()) {
			FreeVariable fv = it.next();
			sb.append("," + fv);
		}
		if (sb.length()>0)
			return sb.substring(1); // removing first "," character
		return "";
	}
	
	/**
	 * Creates a comma separated list of the given polynomials
	 * @param polys the polynomials
	 * @return the comma separated list
	 */
	public static String getPolysAsCommaSeparatedString(Polynomial[] polys) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<polys.length; ++i)
			sb.append("," + polys[i].toString());
		if (sb.length()>0)
			return sb.substring(1); // removing first "," character
		return "";
	}
	
	/**
	 * Creates a Singular program for creating a ring to work with two
	 * polynomials, and multiply them; adds a closing ";" 
	 * @param ringVariable variable name for the ring in Singular
	 * @param p1 first polynomial
	 * @param p2 second polynomial
	 * @return the Singular program code
	 */
	public String getSingularMultiplication(String ringVariable, Polynomial p1, Polynomial p2) {
		return "ring " + ringVariable + "=0,(" 
				+ getVarsAsCommaSeparatedString(new Polynomial[] {p1, p2})
				+ "),dp;" // ring definition in Singular
				
				+ "short=0;" // switching off short output
				
				+ "(" + p1.toString() + ")"
				+ "*"
				+ "(" + p2.toString() + ");"; // the multiplication command
	}
	
	/**
	 * Creates a polynomial which describes the input coordinates as points
	 * lying on the same line. 
	 * @param fv1 x-coordinate of the first point
	 * @param fv2 y-coordinate of the first point
	 * @param fv3 x-coordinate of the second point
	 * @param fv4 y-coordinate of the second point
	 * @param fv5 x-coordinate of the third point
	 * @param fv6 y-coordinate of the third point
	 * @return the polynomial
	 */
	public static Polynomial setCollinear(FreeVariable fv1, FreeVariable fv2, FreeVariable fv3, 
			FreeVariable fv4, FreeVariable fv5, FreeVariable fv6) {
		// a*d-b*c:
		Polynomial a = new Polynomial(fv1);
		Polynomial b = new Polynomial(fv2);
		Polynomial c = new Polynomial(fv3);
		Polynomial d = new Polynomial(fv4);
		Polynomial e = new Polynomial(fv5);
		Polynomial f = new Polynomial(fv6);
		
		Polynomial ret = a.multiply(d).subtract(b.multiply(c))
				// + e*(b-d)
				.add(e.multiply(b.subtract(d)))
				// - f*(a-c)
				.subtract(f.multiply(a.subtract(c)));
		return ret;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Polynomial) {
			return this.compareTo((Polynomial) o) == 0;
		}
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return terms.hashCode();
	}

	/**
	 * Tests if the Polynomial is the zero polynomial
	 * @return true if the polynomial is zero false otherwise
	 */
	public boolean isZero() {
		return terms.isEmpty();
	}

	/**
	 * Creates a Singular program for creating a ring to work with several
	 * polynomials, and returns the Groebner basis of them w.r.t. the
	 * revgradlex order; adds a closing ";"
	 * @param ringVariable variable name for the ring in Singular
	 * @param idealVariable variable name for the ideal in Singular
	 * @param polys array of polynomials
	 * @param setFixValues if set the leading values to fix positions (0,0,0,1)
	 * @return the Singular program code
	 */
	public static String getSingularGroebner(String ringVariable, String idealVariable, Polynomial[] polys) {
		String ret = "ring " + ringVariable + "=0,(" 
			+ getVarsAsCommaSeparatedString(polys)
			+ "),dp;" // ring definition in Singular
				
			+ "ideal " + idealVariable + "=";
		ret += getPolysAsCommaSeparatedString(polys) // ideal definition in Singular
			+";groebner(" + idealVariable + ");"; // the Groebner basis calculation command
		return ret;
	}
	
	/**
	 * Decides if an array of polynomials (as a set) gives a solvable equation system
	 * on the field of the complex numbers.
	 * @param polys the array of polynomials
	 * @return yes if solvable, no if no solutions, or null (if cannot decide)
	 */
	public static Boolean solvable(Polynomial[] polys) {
		if (AbstractApplication.singularWS != null && AbstractApplication.singularWS.isAvailable()) {
			String singularSolvableProgram = getSingularGroebner("rr", "ii", polys);
			if (singularSolvableProgram.length()>500)
				AbstractApplication.debug( singularSolvableProgram.length() + " bytes -> singular");
			else
				AbstractApplication.debug(singularSolvableProgram + " -> singular");
			String singularSolvable = AbstractApplication.singularWS.directCommand(singularSolvableProgram);
			if (singularSolvable.length()>500)
				AbstractApplication.debug("singular -> " + singularSolvable.length() + " bytes");
			else
				AbstractApplication.debug("singular -> " + singularSolvable);
			if ("_[1]=1".equals(singularSolvable))
				return false; // no solution
			return true; // at least one solution exists
		}
		return null; // cannot decide
	}
}
