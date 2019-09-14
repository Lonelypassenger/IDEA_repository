package annotations.database;


public @interface Uniqueness {
    Constraints constrains() default @Constraints(unique =true);
}
