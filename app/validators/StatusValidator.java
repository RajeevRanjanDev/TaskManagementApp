package validators;

import play.data.Form;
import play.data.validation.Constraints;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import javax.validation.*;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = StatusEnumValidator.class)
@play.data.Form.Display(name="constraint.status",
        attributes = {"value"})
public @interface StatusValidator {
    String message() default StatusEnumValidator.message;
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

