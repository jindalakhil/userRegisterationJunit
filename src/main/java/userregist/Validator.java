package userregist;

@FunctionalInterface
public interface Validator {
	boolean vvalidate(String arg) throws UserRegiesterationException;
}
