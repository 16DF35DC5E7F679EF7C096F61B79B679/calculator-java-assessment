package com.harsha.calculatorJavaAssessment;

import com.harsha.calculatorJavaAssessment.logging.OperationsLogger;
import com.harsha.calculatorJavaAssessment.operators.Adder;
import com.harsha.calculatorJavaAssessment.operators.Divider;
import com.harsha.calculatorJavaAssessment.operators.Multiplier;
import com.harsha.calculatorJavaAssessment.operators.Subtractor;

import java.util.List;

public class Calculator {

    private Adder adder;
    private Subtractor subtractor;
    private Multiplier multiplier;
    private Divider divider;
    private LoggingStrategy loggingStrategy;
    private CalculationMode calculationMode;
    private List<Operation> operations;
    private OperationsLogger operationsLogger;

    public static class Builder {

        private Calculator calculator = new Calculator();

        public Calculator build() {
            //TODO validation
            return calculator;
        }

        public Builder adder(Adder adder) {
            //TODO
            calculator.adder = adder;
            return this;
        }

        public Builder subtractor(Subtractor subtractor) {
            //TODO
            calculator.subtractor = subtractor;
            return this;
        }

        public Builder multiplier(Multiplier multiplier) {
            //TODO
            calculator.multiplier = multiplier;
            return this;
        }

        public Builder divider(Divider divider) {
            //TODO
            calculator.divider = divider;
            return this;
        }

        public Builder calculationMode(CalculationMode calculationMode) {
            //TODO
            calculator.calculationMode = calculationMode;
            return this;
        }

        public Builder loggingStrategy(LoggingStrategy loggingStrategy) {
            //TOOD
            calculator.loggingStrategy = loggingStrategy;
            return this;
        }
    }

    public Integer add(List<Integer> numbers) {
        //TODO Check mode, Add to operations
        return null;
    }

    public Integer subtract(Integer a, Integer b) {
        //TODO Check mode, Add to operations
        return null;
    }

    public Integer multiply(List<Integer> numbers) {
        //TODO Check mode, Add to operations
        return null;
    }

    public Integer divide(Integer a, Integer b) {
        //TODO Check mode, Add to operations
        return null;
    }

    public void sendResults() {
        //TODO
        operationsLogger.logOperations(operations, loggingStrategy);
    }


    public void calculate(String expression) {
        //TODO
    }

    public static Builder builder() {
        return new Builder();
    }

}