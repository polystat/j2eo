package tree;

public class BinaryExpression extends Expression
{
    public enum operator
    {
        op_plus,                //  +
        op_minus,               //  -
        op_multiply,            //  *
        op_divide,              //  /
        op_remainder,           //  %
        op_less,                //  <
        op_greater,             //  >
        op_less_equal,          //  <=
        op_greater_equal,       //  >=
        op_equal,               //  ==
        op_nonequal,            //  !=
        op_left_shift,          //  <<
        op_right_shift,         //  >>
        op_right_shift_arithm,  //  >>>
        op_conditional_or,      //  ||
        op_conditional_and,     //  &&
        op_inclusive_or,        //  |
        op_exclusive_or,        //  ^
        op_and,                 //  &

        // Assignment operators
        op_assign,              //  =
        op_assign_mult,         //  *=
        op_assign_divide,       //  /=
        op_assign_rem,          //  %=
        op_assign_plus,         //  +=
        op_assign_minus,        //  -=
        op_assign_lshift,       //  <<=
        op_assign_rshift,       //  >>=
        op_assign_rashift,      //  >>>=
        op_assign__and,         //  &=
        op_assign_exor,         //  ^=
        op_assign_incor,        //  |=
    }

    // Structure
    public Expression left;
    public Expression right;
    public operator sign;

    // Creation
    public BinaryExpression(Expression l, Expression r, operator op)
    {
        this.left = l;
        this.right = r;
        this.sign = op;
    }

    // Reporting
    public void report(int sh)
    {

    }

    // Generation
    public void generateEO()
    {

    }
}
