
/**
 * Write a description of class DoubleCalculator here.
 * The double calculator is able to calculate double floating point using the main operands ( +, - , * , / , % )
 * @author (Jose Santiago) 
 * @version (Monday, December 14, 2015)
 */

public class DoubleCalculator
{

    public double binaryOperator(double a, char operator, double b)
    { 
        if (operator == '+' )
        { 
            return a + b;

        }
        else
        {
            if (operator == '-' )
            { 
                return a - b;
            }
            else
            { if (operator == '*' )
                { 
                    return a * b;
                }
                else
                { { if (operator == '/' )
                        { 
                            return a / b;
                        }
                        else
                        { if (operator == '%' )
                            { 
                                return a % b;
                            }
                            else
                            { System.out.println("Incorrect Operator, acceptable operators are '+', '-', '*', '/', '%'");
                                return 0;
                            }
                        }
                    }

                }
            }
        }
    }

    public double unaryOperator(char operator, double a)
    {
        if (operator == '+' )
        { 
            return + a ;

        }
        else
        {
            if (operator == '-' )
            { 
                return - a ;
            }
            else

            {System.out.println("Incorrect Operator, acceptable operators are '+', '-'");
                return 0;

            }

        }
    }
}

