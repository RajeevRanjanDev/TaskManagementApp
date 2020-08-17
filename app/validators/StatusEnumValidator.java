package validators;


import common.StatusEnum;
import play.data.validation.Constraints;
import play.libs.F;

import javax.validation.*;
import java.util.Arrays;

public class StatusEnumValidator  extends play.data.validation.Constraints.Validator<Object>
        implements ConstraintValidator<StatusValidator, Object>{



    final static public String message = "Wrong Status Valid status are OPEN CLOSED IN_REVIEW IN_PROGRESS";

    /**
     * Validator init
     * Can be used to initialize the validation based on parameters
     * passed to the annotation.
     */
    public void initialize(StatusValidator constraintAnnotation) {}

    /**
     * The validation itself
     */
    public boolean isValid(Object object) {
        if(object == null)
            return false;

        if(!(object instanceof String))
            return false;

        String s = object.toString();
       if( Arrays.stream(StatusEnum.values())
               .noneMatch(e -> e.getStautsType().equals(s)))
       {
return  false;
       }

        return true;
    }

    public F.Tuple<String, Object[]> getErrorMessageKey() {
        return F.Tuple("Wrong Status Valid status are OPEN CLOSED IN_REVIEW IN_PROGRESS", new Object[]{});
    }

    /**
     * Constructs a validator instance.
     */
    public static play.data.validation.Constraints.Validator<Object> alluppercase() {
        return new StatusEnumValidator();
    }
}





