
/**
 * Write a description of class IntegerCalculator here.
 * The integer calculator is able to calculate only integers using the main operands ( +, - , * , / , % )
 * 
 * @author (Jose Santiago) 
 * @version (Monday, December 14, 2015)
 */
public class IntegerCalculator
{

    public int binaryOperator(int a, char operator, int b)
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

    public int unaryOperator(char operator, int a)
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

